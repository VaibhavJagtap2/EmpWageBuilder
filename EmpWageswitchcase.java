package com.empwageswitch;

public class EmpWageswitchcase {
		
	    public static final int Is_Full_Time = 1;
		public static final int Is_Part_Time = 2;
		public static final  int empRate_Per_Hr = 20;

public static void main(String[] args) {
		int empHr = 0;
		int salary = 0;
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
		salary=(empHr*empRate_Per_Hr);
		System.out.println("Salary is :"+salary);
	}

}
