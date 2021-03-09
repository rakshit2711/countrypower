package com.powerrank.service;

import com.powerrank.model.Geography;

public interface GeographyService {
	Geography findByCountryId(int countryId);
	Geography findByCountryName(String countryName);
	Geography saveGeography(Geography geography);
}
