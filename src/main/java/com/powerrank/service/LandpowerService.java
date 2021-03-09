package com.powerrank.service;

import com.powerrank.model.Landpower;

public interface LandpowerService {
	Landpower findByCountryId(int countryId);
	Landpower findByCountryName(String countryName);
	Landpower saveLandpower(Landpower landpower);
}
