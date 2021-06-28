package com.EmpWage;

public interface IComputeEmpWage {

	public void addCompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth);

	public void computeEmpWage();

	public int getTotalWage(String company);

}
