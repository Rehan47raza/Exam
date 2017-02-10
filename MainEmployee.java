package com;

public class MainEmployee 
{
	public static void main(String args[])
	{
		Employee e1=new ContractEmployee(1,"priya","permanent",1213);
		Employee e2=new PermanentEmployee(2,"pri","TEMP",222);
		Employee e3=new PermanentEmployee(3,"pri","TEMP",222);
		EmployeeManagement e=new EmployeeManagement();
		System.out.println(e.addEmployee(e1));
		System.out.println(e.addEmployee(e2));
		//System.out.println();
		System.out.println(e.deleteEmployee(1));
		try
		{
		System.out.println(e.updateEmployee(3,"fix"));
		}
		catch(EmployeeAlreadyUpdatedException f)
		{
			
		}
		try
		{
			System.out.println(e.getEmployee(2));
		}
		catch(EmployeeNotFoundException gh)
		{
			
		}
		
	}

}
