package model;

public class Store {
	private Zone[] zones;
	private int noz; //number of zones in the list
	
	public Store() {
		this.zones = new Zone[100];
	}
	
	public Zone[] getZones() {
		Zone[] newList = new Zone[this.noz];
		for(int i = 0; i< this.noz; i++){
			newList[i] = this.zones[i];
		}
		return newList;
	}
	
	public Zone[] getZones(int num) {
		int numOfZones = 0;
		for(int i = 0; zones[i] != null && i < this.zones.length; i ++) {
			if((10 - zones[i].getNumberOfMovieDVDs()) <= num) {
				numOfZones ++;
			}
		}
		Zone[] newList = new Zone[numOfZones];
		numOfZones = 0;
		for(int i = 0; zones[i] != null && i < this.zones.length; i ++) {
			if((10 - zones[i].getNumberOfMovieDVDs()) <= num) {
				newList[numOfZones] = zones[i];
				numOfZones ++;
			}
		}
		return newList;
		
		
	}
	
	public int[] getStats(String title) {
		int records = 0;
		int dvds = 0;
		for(int i = 0; zones[i] != null && i < this.zones.length; i ++) {
			for(int j = 0; j < zones[i].getRecordsList().length; j++) {
				if(zones[i].getRecordsList()[j].getName().equals(title)){
					records ++;
					dvds += zones[i].getRecordsList()[j].getNumberOfDVDs();
					}
				}
		}
		
		int[] stats = new int[2];
		stats[0] = records;
		stats[1] = dvds;
		return stats;
		
	}
	public void addZones(Zone[] zoneList) {
		for(int i = 0; i < zoneList.length; i++) {
			this.zones[this.noz] = zoneList[i];
			this.noz ++;
		}
	}
}
