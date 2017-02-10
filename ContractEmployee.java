package com;

public class ContractEmployee extends Employee
{
	private double ratePerHour;
	private int totalWorkingHoursPerDay;
	public double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	public int getTotalWorkingHoursPerDay() {
		return totalWorkingHoursPerDay;
	}
	public void setTotalWorkingHoursPerDay(int totalWorkingHoursPerDay) {
		this.totalWorkingHoursPerDay = totalWorkingHoursPerDay;
	}
	
	public ContractEmployee(int employeeId,String employeeName,String employeeType,int totalWorkingDaysPerMonth)
	{
		super(employeeId,employeeName,employeeType,totalWorkingDaysPerMonth);
	}
	public double calculateSalary()
	{
		double total_sal=ratePerHour*totalWorkingHoursPerDay*getTotalWorkingDaysPerMonth();
		return  total_sal;
	}
}
