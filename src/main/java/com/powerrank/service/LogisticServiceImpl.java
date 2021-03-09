package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Country;
import com.powerrank.model.Logistic;
import com.powerrank.repository.CountryRepo;
import com.powerrank.repository.LogisticRepo;
@Service
public class LogisticServiceImpl implements LogisticService {
	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	LogisticRepo logisticRepo;
	@Override
	public Logistic findByCountryId(int countryId) {
		Country country=countryRepo.findById(countryId).orElse(null);
		return logisticRepo.findByCountry(country);
	}

	@Override
	public Logistic findByCountryName(String countryName) {
		Country country=countryRepo.findByCountryName(countryName);
		return logisticRepo.findByCountry(country);
	}

	@Override
	public Logistic saveLogistic(Logistic logistic) {
		return logisticRepo.save(logistic);
	}
}
