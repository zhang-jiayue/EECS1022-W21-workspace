package model;

public class Zone {
	private int capacity;
	public static int id = 23;
	private String zoneId;
	private int numOfRecords;
	private int numOfDVDs;
	private String status;
	private MovieRecord[] records;
	
	public Zone(int max) {
		this.capacity = max;
		this.records = new MovieRecord[numOfRecords];
		this.zoneId = "Zone-" + id;
		Zone.id += 11;
		this.updateStatus();
	}
	
	public String getID() {
		return this.zoneId;
	}
	
	public int getNumberOfMovieRecords() {
		return this.numOfRecords;
	}
	
	
	public int getNumberOfMovieDVDs() {
		return this.numOfDVDs;
	}
	
	public MovieRecord[] getRecordsList() {
		return this.records;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void updateNumOfDVDs() {
		this.numOfDVDs = 0;
		for(int i = 0; i < this.records.length; i ++) {
			if(this.records[i] != null) {
				this.numOfDVDs += this.records[i].getNumberOfDVDs();
			}
		}
	}
	
	public void updateStatus() {
		String dvds = "";
		for(int i = 0; i < this.records.length; i ++) {
			if(this.records[i] != null) {
				dvds += String.format("%s (%d)", records[i].getName(), records[i].getNumberOfDVDs());
				if(i<this.records.length-1) {
					dvds += ", ";
				}
			}
		}
		this.updateNumOfDVDs();
		status = this.numOfRecords + " records and " + this.numOfDVDs+ " DVDs: {"+ dvds  +"}";
	}
	
	public void addMovieRecord(MovieRecord record) {
		if(this.numOfDVDs == this.capacity){
			this.status = String.format("Error: maximum number of movie DVDs (%d) reached", this.capacity);
		}
		else if((this.capacity - this.numOfDVDs) < record.getNumberOfDVDs()) {
			int shortOf =  record.getNumberOfDVDs() - (this.capacity - this.numOfDVDs);
			this.status = String.format("Error: insufficient space left in the zone (%d DVDs short)", shortOf);

		}
		
		else {
			boolean recordAlreadyExists = false;
			for(int i = 0; i < this.records.length; i++) {
				if(records[i].getName().equals(record.getName())){
					recordAlreadyExists = true;
					records[i].addDVDs(record.getNumberOfDVDs());
					this.updateStatus();

				}
			}
			if(!recordAlreadyExists) {
				this.numOfRecords += 1;
				MovieRecord[] newList = new MovieRecord[numOfRecords];
				for(int i = 0; i < numOfRecords - 1; i++) {
					newList[i] = this.records[i];
				}
				newList[numOfRecords - 1] = record;
				this.records = newList;
				this.updateStatus();
			}

		}



	}
	
	
}
