package com;

public class PermanentEmployee extends Employee
{
	double ratePerDay;
	public PermanentEmployee(int employeeId,String employeeName,String employeeType,int totalWorkingDaysPerMonth)
	{
		super(employeeId,employeeName,employeeType,totalWorkingDaysPerMonth);
	}
	public double getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public double calculateSalary()
	{
		double totalsal=ratePerDay*getTotalWorkingDaysPerMonth();
		return totalsal;
	}

}
