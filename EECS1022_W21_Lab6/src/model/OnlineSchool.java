package model;

public class OnlineSchool {
	private final int MAX_OF_PARTICIPANTS = 100;
	Participant [] participant = new Participant [0];
	int nop = 0;
	
	
	public OnlineSchool() {
		
	}
	
	//Accessor methods
	public Participant [] getParticipants(String course) {
		int num = 0;
		for(int i = 0; i < participant.length; i++) {
			for(int j = 0; j < participant[i].getRegistrations().length; j ++) {
				if(participant[i].getRegistrations()[j].getTitle().equals(course)) {
					num += 1;
				}
			}
			
		}
		Participant[] result = new Participant[num];
		if(num > 0) {
			int k = 0;
			for(int i = 0; i < participant.length; i++) {
				for(int j = 0; j < participant[i].getRegistrations().length; j ++) {
					if(participant[i].getRegistrations()[j].getTitle().equals(course)) {
						result[k] = participant[i];
						k ++;
					}
				}
			}
		}
		
		return result;
	}
	
	
	// Mutator methods
		public void addParticipant(Participant p) {
			if(this.nop < MAX_OF_PARTICIPANTS){
			this.nop += 1;
			Participant [] newList = new Participant [this.nop];
			for(int i = 0 ; i < this.nop - 1; i++) {
				newList[i] = participant[i];
			}
			newList[this.nop - 1] = p;
			participant = newList;
		}
		
	}
}


