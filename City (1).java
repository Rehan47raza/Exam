package com;

import java.util.ArrayList;
import java.util.List;

public class City {
	private int cityId;
	private String cityName;
	private double cityPinCode;
	private double cityCharge;
	private List<Car> carListIncity=new ArrayList<Car>();
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getCityPinCode() {
		return cityPinCode;
	}
	public void setCityPinCode(double cityPinCode) {
		this.cityPinCode = cityPinCode;
	}
	public double getCityCharge() {
		return cityCharge;
	}
	public void setCityCharge(double cityCharge) {
		this.cityCharge = cityCharge;
	}
	public List<Car> getCarListIncity() {
		return carListIncity;
	}
	public void setCarListIncity(List<Car> carListIncity) {
		this.carListIncity = carListIncity;
	}
	public City(int cityId, String cityName, double cityPinCode,
			double cityCharge) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.cityPinCode = cityPinCode;
		this.cityCharge = cityCharge;
	}

	}
	


