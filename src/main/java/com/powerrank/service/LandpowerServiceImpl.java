package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Country;
import com.powerrank.model.Landpower;
import com.powerrank.repository.CountryRepo;
import com.powerrank.repository.LandpowerRepo;
@Service
public class LandpowerServiceImpl implements LandpowerService {

	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	LandpowerRepo landpowerRepo;
	@Override
	public Landpower findByCountryId(int countryId) {
		Country country=countryRepo.findById(countryId).orElse(null);
		return landpowerRepo.findByCountry(country);
	}

	@Override
	public Landpower findByCountryName(String countryName) {
		Country country=countryRepo.findByCountryName(countryName);
		return landpowerRepo.findByCountry(country);
	}

	@Override
	public Landpower saveLandpower(Landpower landpower) {
		return landpowerRepo.save(landpower);
	}

}
