package com.powerrank.model;

import java.util.List;

public class CountryPowerList {
	List<CountryPower> countryPower;

	public CountryPowerList() {
		super();
	}

	public CountryPowerList(List<CountryPower> countryPower) {
		super();
		this.countryPower = countryPower;
	}

	public List<CountryPower> getCountryPower() {
		return countryPower;
	}

	public void setCountryPower(List<CountryPower> countryPower) {
		this.countryPower = countryPower;
	}
	
}
