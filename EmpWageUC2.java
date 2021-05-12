package com.EmpWageUC2;

public class EmpWageUC2 {
	public static void main(String[] args) {
		int Is_Full_Time = 1;
		int empRate_Per_Hr = 20;
	    int empWorking_Hrs = 8;
		double empCheck = Math.floor(Math.random()*10) % 2;
		int empHrs=8;
		 if(Is_Full_Time == empCheck) {
			empHrs=8;
		}
		 else if (empRate_Per_Hr == empCheck) {
			 empHrs=0;
			 System.out.println("Employee Is Absent");
		 }
		 else 
			 System.out.println("Daily Wage of an Fulltime Employee is"+Math.multiplyExact(empRate_Per_Hr, empWorking_Hrs));
}
}	