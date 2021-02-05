package model;

public class Utilities {
	public static String getSequence1a(int ft, int d, int n) {
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			result += term;
			sum += term;
			term += d;

			if (i < n) { // not the last term
				result += ", ";
			}
		}
		
		result += ">";
		result += " has average " + ((double) sum / n) ;
		
		return result;
	}

	public static String getSequence1b(int ft, int d, int n) {
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
		int i = 1;
		while(i <= n) {
			result += term;
			if (i < n) { // not the last term
				result += ", ";
			}
			sum += term;
			term += d;
			i++;
		}
		
		result += ">";
		result += " has average " + ((double) sum / n) ;
		
		return result;
	}
	public static String getSequence2a(int ft, int d, int max) {
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
//		int i = 1;
		int n = 0;
		for (;term <= max;) {
			n++;
			result += term;
			result += " ";
			sum += term;
			term += d;
//			i++;
		}
		
		result += ">";
		result += " has average " + ((double) sum / n) ;
		
		return result;
	}
	public static String getSequence2b(int ft, int d, int max) {
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
		int i = 1;
		int n = 0;
		while(term <= max) {
			n++;
			result += term;
			result += " ";
			sum += term;
			term += d;
			i++;
		}
		
		result += ">";
		result += " has average " + ((double) sum / n) ;
		
		return result;
	}
}
