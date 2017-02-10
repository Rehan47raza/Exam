package com;

public abstract class Employee 
{
	private int employeeId;
	private  String employeeName;
	private  String employeeType;
	private  int totalWorkingDaysPerMonth;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public Employee(int employeeId,String employeeName,String employeeType,int totalWorkingDaysPerMonth)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeType=employeeType;
		this.totalWorkingDaysPerMonth=totalWorkingDaysPerMonth;
	}
	public int getTotalWorkingDaysPerMonth() {
		return totalWorkingDaysPerMonth;
	}
	public void setTotalWorkingDaysPerMonth(int totalWorkingDaysPerMonth) {
		this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
	}
public abstract double calculateSalary();


}
