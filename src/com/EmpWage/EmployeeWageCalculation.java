package com.EmpWage;

public class EmployeeWageCalculation {
	public static void main(String args[])

	{
		System.out.println("Welcome to empwage program");
		int fulltime = 1;
		double value = (Math.floor(Math.random() * 10) % 2);

		if (value == fulltime)
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");

	}

}
