package model;

public class Grades {
	
	private int number;
	
	public Grades() {
	this.number = 0;
		
	}
	
	public Grades(int number) {
		this.number = number;
		
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public String getLetter() {
		String letterGrade = "";
		if(number >=88) {
			letterGrade = "A";}
			else if (number >= 80) {
				letterGrade = "B";}
				else if(number>= 67) {
					letterGrade  = "C";}
				else if(number>= 60) {
					letterGrade = "f";}
				else {"Invalid";}
			}
		
		return letterGrade;
	}
}
