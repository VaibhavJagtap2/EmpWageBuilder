package com.empwagetotalhrs;

public class EmpWageTotalHrs {
		    
		    public static final int Is_Full_Time = 1;
			public static final int Is_Part_Time = 2;
			public static final int empRate_Per_Hr = 20;
			public static final int empWorking_Days = 20; 
			public static final int Total_Working_Hrs = 100;
		
public static void main(String[] args) {
			
			int empHr = 0;
			int totalEmpWage = 0;
			int empWage = 0;
			int totalEmpHr = 0;
			int totalWorkingDays = 0;
			
			while(totalEmpHr<=Total_Working_Hrs && totalWorkingDays<=empWorking_Days) {
				
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
			totalEmpWage=totalEmpWage*empRate_Per_Hr;
			System.out.println("salary is :"+totalEmpWage);
	}
}	

