package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Country;
import com.powerrank.model.Geography;
import com.powerrank.repository.CountryRepo;
import com.powerrank.repository.GeographyRepo;
@Service
public class GeographyServiceImpl implements GeographyService {
	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	GeographyRepo geographyRepo;
	
	@Override
	public Geography findByCountryId(int countryId) {
		Country country=countryRepo.findById(countryId).orElse(null);
		return geographyRepo.findByCountry(country);
	}

	@Override
	public Geography findByCountryName(String countryName) {
		Country country=countryRepo.findByCountryName(countryName);
		return geographyRepo.findByCountry(country);
	}

	@Override
	public Geography saveGeography(Geography geography) {
		return geographyRepo.save(geography);
	}
}
