package com.EmpWage;

public class EmployeeWageCalculation {

	public static void main(String[] args) {

		System.out.println("!!!!!!!!!! Welcome to Employee Wage Program !!!!!!!!!!");

		EmpWageBuilderClassMethod empWageBuilderClass = new EmpWageBuilderClassMethod();
		empWageBuilderClass.addCompanyEmpWage("Dmart", 20, 15, 140);
		empWageBuilderClass.addCompanyEmpWage("Reliance", 15, 4, 20);
		empWageBuilderClass.computeEmpWage();

	}

}
