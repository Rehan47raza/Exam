package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CarRentalManagement implements CarRentalMgmtinf {
	private List<City> cityList=new ArrayList<City>();

	
	public int addCar(Car a) throws CarAlreadyExistException {
		if(a!=null)
		{
			for(int i=0;i<cityList.size();i++)
			{
				if(cityList.get(i).getCityName().equalsIgnoreCase(a.getMappedCity()))
						{
					         for(int j=0;j<cityList.get(i).getCarListIncity().size();j++)
					         {
					        	 if(cityList.get(i).getCarListIncity().get(j)==a)
					        		 throw new CarAlreadyExistException();
					         }
					         cityList.get(i).getCarListIncity().add(a);
					         return cityList.get(i).getCarListIncity().size();
						}
				
			}
			
		}
		return -1;
		
		
	}

	
	public int addCity(City c) throws CityAlreadyExistException
	{
		if(c!=null && cityList!=null)
		{
			for(int i=0;i<cityList.size();i++)
			{
                   if(cityList.get(i).getCityPinCode()==c.getCityPinCode())
					  throw new CityAlreadyExistException();
			}
		
		    cityList.add(c);
		    return cityList.size();
		}
		else return -1;
	}
		
	

	
	public HashSet<Car> searchCarDetailsByCityName(String s) {
		HashSet<Car> h=new HashSet<Car>();
		
		if(cityList!=null)
		{
			for(int i=0;i<cityList.size();i++)
			{
				if(cityList.get(i).getCityName().equalsIgnoreCase(s))
				{
					for(int j=0;j<cityList.get(i).getCarListIncity().size();j++)
						h.add(cityList.get(i).getCarListIncity().get(j));
					
					return h;
				}
				
					
			}
		}
		return null;
		
		
		
	}

	@Override
	public HashMap<String, Double> getTotalIncomeFromCity(String s) {
		HashMap<String,Double> hm=new HashMap<String,Double>();
		double a=0;
		if(cityList!=null)
		{
			for(int i=0;i<cityList.size();i++)
			{
				if(cityList.get(i).getCityName().equalsIgnoreCase(s))
				{
					for(int j=0;j<cityList.get(i).getCarListIncity().size();j++)
					{
					a=a+cityList.get(i).getCarListIncity().get(j).getCharge()*cityList.get(i).getCityCharge();
					}
					
				}
				
			}
		}
		hm.put(s, a);
		return hm;
	}
	

}
