package com;

import java.util.HashMap;
import java.util.HashSet;

public interface CarRentalMgmtinf {
	public int addCar(Car a) throws CarAlreadyExistException ;
	public int addCity(City c) throws CityAlreadyExistException;
    public HashSet<Car> searchCarDetailsByCityName (String s);
    public HashMap<String,Double> getTotalIncomeFromCity (String s);
	

}
