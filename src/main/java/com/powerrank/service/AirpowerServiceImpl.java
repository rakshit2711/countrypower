package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Airpower;
import com.powerrank.model.Country;
import com.powerrank.repository.AirpowerRepo;
import com.powerrank.repository.CountryRepo;

@Service
public class AirpowerServiceImpl implements AirPowerService {
	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	AirpowerRepo airpowerRepo;
	
	@Override
	public Airpower findByCountryId(int countryId) {
		Country country=countryRepo.findById(countryId).orElse(null);
		return airpowerRepo.findByCountry(country);
	}

	@Override
	public Airpower findByCountryName(String countryName) {
		Country country=countryRepo.findByCountryName(countryName);
		return airpowerRepo.findByCountry(country);
	}

	@Override
	public Airpower saveAirpower(Airpower airPower) {
		return airpowerRepo.save(airPower);
	}

}
