package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo {

	/**
	 * @param args
	 * @throws CarAlreadyExistException 
	 */
	public static void main(String[] args)throws CityAlreadyExistException, CarAlreadyExistException {
		CarRentalManagement ob=new CarRentalManagement();
		City ob1=new City(2,"Meerut",25.0,15.0);
		City ob2=new City(3,"Delhi",24.0,10.0);
		Car ob3=new Car(4,"aaa","bbb","Delhi",4.0);
		Car ob4=new Car(5,"ddd","eee","fff",60.0);
		System.out.println(ob.addCity(ob1));
		System.out.println(ob.addCity(ob2));
		System.out.println(ob.addCar(ob3));		
		System.out.println(ob.addCar(ob4));
		HashSet<Car> h=ob.searchCarDetailsByCityName("Delhi");
		for(Car c:h)
		{
			System.out.println(c.getCarCompanyName());
		}
		HashMap<String,Double> hm=new HashMap<String,Double>();
		hm=ob.getTotalIncomeFromCity("Delhi");
		for(Map.Entry<String,Double> e:hm.entrySet())
		{
			System.out.println("Key Value : "+e.getKey()+"value will be : "+e.getValue());
		}
			
		

	}

}
