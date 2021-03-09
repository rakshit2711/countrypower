package com.powerrank.service;

import com.powerrank.model.Manpower;

public interface ManpowerService {
	Manpower findByCountryId(int countryId);
	Manpower findByCountryName(String countryName);
	Manpower saveManpower(Manpower manpower);
}
