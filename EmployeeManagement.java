package com;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManagement 
{
	ArrayList<Employee> employeeList=new ArrayList<Employee>();
	public int addEmployee(Employee e)
	{
		int i=0;
		if(e!=null)
		{
			employeeList.add(e);
			 i=employeeList.size();
		}
		else
			return i;
		return i;
	}
	public Employee getEmployee(int empid) throws EmployeeNotFoundException
	{
		for(int i=0;i<employeeList.size();i++)
		{
			if(employeeList.get(i).getEmployeeId()==empid);
			{
				return employeeList.get(i);
			}
		}
			
			throw new EmployeeNotFoundException("emplpyee with the given id does not exsit");
		}
	public int deleteEmployee(int empid)
	{ 
		int count=0;
		for(int i=0;i<employeeList.size();i++)
		{
			if(employeeList.get(i).getEmployeeId()==empid);
			{
				employeeList.remove(employeeList.get(i));
				count++;
				//return employeeList.size();
			}
			count=employeeList.size();
	}
	return count;
		
	}
	public Employee updateEmployee(int empid,String emptype) throws EmployeeAlreadyUpdatedException
	{
		Employee e=null;
		for(int i=0;i<employeeList.size();i++)
		{
			if(employeeList.get(i).getEmployeeType().equalsIgnoreCase(emptype))
			{
				
				throw new EmployeeAlreadyUpdatedException("no updation requird");
			}
			else 
			{
				employeeList.get(i).setEmployeeType(emptype);
				e=employeeList.get(i);
	         }
        }return e;
	}
	
		
	}




