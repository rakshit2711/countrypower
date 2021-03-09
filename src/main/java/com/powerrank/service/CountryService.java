package com.powerrank.service;

import java.util.List;

import com.powerrank.model.Country;

public interface CountryService {
	Country findByCountryId(int countryId);
	Country findByCountryName(String countryName);
	List<Country> getAllCountries();
}
