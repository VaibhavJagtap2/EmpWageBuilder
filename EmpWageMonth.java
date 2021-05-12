package com.empwagemonth;

public class EmpWageMonth {
	    
	    public static final int Is_Full_Time = 1;
		public static final int Is_Part_Time = 2;
		public static final int empRate_Per_Hr = 20;
		public static final int empWorking_Days = 20; 

	public static void main (String[] args) {
		int empHr = 0;
		int totalEmpWage = 0;
		int empWage = 0;
		for(int day=0;day<=empWorking_Days;day++) {
			
		int Result = (int)(Math.random()*10)%3;
		switch(Result) {
		case Is_Full_Time:
			empHr=8;
			break;
		case Is_Part_Time:
			empHr=4;
			break;
		default:
			empHr=0;
		}
		empWage=empHr*empRate_Per_Hr;
		totalEmpWage+=empWage;
		System.out.println("Per day wage:"+empWage);
		
	}
		System.out.println("salary is :"+totalEmpWage);
}
}	
