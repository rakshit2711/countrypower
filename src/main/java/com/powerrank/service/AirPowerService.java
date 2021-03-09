package com.powerrank.service;

import com.powerrank.model.Airpower;

public interface AirPowerService {
	Airpower findByCountryId(int countryId);
	Airpower findByCountryName(String countryName);
	Airpower saveAirpower(Airpower airPower);
}
