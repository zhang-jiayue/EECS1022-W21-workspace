package model;

public class MovieRecord {
	private String name;
	private int numOfDVDs;
	private Zone zone;
	private String id;
	private int order;
	public static int numOfMovieRecords;
	
	
	public MovieRecord(String name, int num, Zone zone) {
		this.name = name;
		this.numOfDVDs = num;
		this.zone = zone;
		MovieRecord.numOfMovieRecords ++;
		this.order = MovieRecord.numOfMovieRecords;
		this.id = this.zone.getID() + "-" + this.name + "-" + this.order;

		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumberOfDVDs() {
		return this.numOfDVDs;
	}
	
	public Zone getZone() {
		return this.zone;
	}
	
	public String getID() {
		return this.id;
	}
	
	public void addDVDs(int units) {
		this.numOfDVDs += units;
	}
	

	
	

}
