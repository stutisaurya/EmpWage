package com.EmpWage;

import java.util.ArrayList;
import java.util.HashMap;

public class EmpWageBuilderClassMethod implements IComputeEmpWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private ArrayList<CompanyEmpWage> companyEmpWageList;
	private HashMap<String, CompanyEmpWage> companyEmpWageMap;

	public EmpWageBuilderClassMethod() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
		companyEmpWageMap = new HashMap<String, CompanyEmpWage>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);

		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage company = companyEmpWageList.get(i);
			company.setTotalEmpWage(this.computeEmpWage(company));
			System.out.println(company);
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