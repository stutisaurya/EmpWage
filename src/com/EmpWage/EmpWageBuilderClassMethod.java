package com.EmpWage;

public class EmpWageBuilderClassMethod implements IComputeEmpWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int noOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderClassMethod() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[noOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);
		noOfCompany++;
	}

	public void computeEmpWage() {
		for (int i = 0; i < noOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int workHour = 0, totalWorkingHours = 0, totalWorkingDays = 0;

		while (totalWorkingHours < companyEmpWage.maxHourInMonth
				&& totalWorkingDays < companyEmpWage.maxWorkingDayInMonth) {

			int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;

			switch (employeeAttendance) {
			case IS_FULL_TIME:
				workHour = 8;
				totalWorkingHours = totalWorkingHours + workHour;
				break;

			case IS_PART_TIME:
				workHour = 4;
				totalWorkingHours = totalWorkingHours + workHour;
				break;

			default:
				workHour = 0;
			}

			totalWorkingDays++;
			System.out.println("Day= " + totalWorkingDays + "	Today's work Hour= " + workHour);
		}

		return totalWorkingHours * companyEmpWage.wagePerHour;
	}

}