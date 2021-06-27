package com.EmpWage;

public class CompanyEmpWage {
	public final String company;
	public final int wagePerHour;
	public final int maxWorkingDayInMonth;
	public final int maxHourInMonth;
	public int totalWage;

	public CompanyEmpWage(String company, int wagePerHour, int maxWorkingDayInMonth, int maxHourInMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDayInMonth = maxWorkingDayInMonth;
		this.maxHourInMonth = maxHourInMonth;
	}

	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total Employee Wage for Company " + company + " is: " + totalWage;
	}

}
