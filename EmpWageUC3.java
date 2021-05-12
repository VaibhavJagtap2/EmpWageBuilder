package com.empwageUC3;

public class EmpWageUC3 {
	public static void main(String[] args) {
	int Is_Full_Time = 1;
	int Is_Part_Time = 2;
	int empHr = 0;
	int empRate_Per_Hr = 20;
    int salary = 0;
    int Result=(int)(Math.random()*10)%3;
	 
	 if(Result == Is_Full_Time) {
		empHr=8;
	}
	 else if (Result == Is_Part_Time) {
		 empHr=4;

	 }
	 else
	 {
		 salary = 0;
		 System.out.println("Employee is Absent");
	 }
		 salary = (empHr*empRate_Per_Hr);
		 System.out.println("Salary is "+salary);
}
}