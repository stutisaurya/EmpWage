package com.EmpWage;

public class EmployeeWageCalculation {

	public static void main(String[] args) {

		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");

		EmpWageBuilderClassMethod empWageBuilderClass = new EmpWageBuilderClassMethod();
		empWageBuilderClass.addCompanyEmpWage("D-mart", 20, 15, 140);
		empWageBuilderClass.addCompanyEmpWage("Reliance", 15, 4, 20);
		empWageBuilderClass.computeEmpWage();
		System.out.println("\n Total wage of  Company D-Mart is: " + empWageBuilderClass.getTotalWage("D-mart"));

	}

}
