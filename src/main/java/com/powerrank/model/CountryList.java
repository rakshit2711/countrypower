package com.powerrank.model;

import java.util.List;

public class CountryList {


	List<Country> countriesList;

	public CountryList(List<Country> countriesList) {
		super();
		this.countriesList = countriesList;
	}

	public CountryList() {
		super();
		// Default Constructor
	}
	
	public List<Country> getCountriesList() {
		return countriesList;
	}

	public void setCountriesList(List<Country> countriesList) {
		this.countriesList = countriesList;
	}
}
