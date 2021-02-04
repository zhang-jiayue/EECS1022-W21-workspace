package model;

public class Grade {
	public static String getLetterGrade1(int marks) {
		String lg = "";
		
		if(90 <= marks) {	//single if statement
			lg = "A+";
		}
		else if(80 <= marks) {
			lg = "A";
		}
		else if(75 <= marks) {
			lg = "B+";
		}
		else if(70 <= marks) {
			lg = "B";
		}
		else if(65 <= marks) {
			lg = "C+";
		}
		else if(60 <= marks) {
			lg = "C";
		}
		else if(55 <= marks) {
			lg = "D+";
		}
		else if(50 <= marks) {
			lg = "D";
			
		}
		else {
			lg = "F";
		}
		
		return lg;
	}
	
	
	public static String getLetterGrade2(int marks) {
		String lg = "";
		
//		if(marks >= 90) {	//Incorrect: Multiple if-stmts with overlapping conditions
//			lg = "A+";
//		}
//		if(marks >= 80) {	//Distinct, independent if-stmts
//			lg = "A";
//		}
//		if(marks >= 75) {
//			lg = "B+";
//		}
//		if(marks >= 70) {
//			lg = "B";
//		}
//		if(marks >= 65) {
//			lg = "C+";
//		}
//		if(marks >= 60) {
//			lg = "C";
//		}
//		if(marks >= 55) {
//			lg = "D+";
//		}
//		if(marks >= 50) {
//			lg = "D";
//			
//		}
//		else {
//			lg = "F";
//		}
//		
//		return lg;
//	}
		
		if(90 <= marks && marks <= 100) {
			lg = "A+";
		}
		if(80 <= marks && marks < 90) {
			lg = "A";
		}
		if(75 <= marks && marks < 80) {
			lg = "B+";
		}
		if(70 <= marks && marks < 75) {
			lg = "B";
		}
		if(65 <= marks && marks < 70) {
			lg = "C+";
		}
		if(60 <= marks && marks < 65) {
			lg = "C";
		}
		if(55 <= marks && marks < 60) {
			lg = "D+";
		}
		if(50 <= marks && marks < 55) {
			lg = "D";
			
		}
		if(0 <= marks && marks < 50){
			lg = "F";
		}
		
		return lg;
		
	}
}
