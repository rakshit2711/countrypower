package com.powerrank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Country;
import com.powerrank.repository.CountryRepo;
@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryRepo countryRepo;

	@Override
	public Country findByCountryId(int countryId) {
		return countryRepo.findById(countryId).orElse(null);
	}

	@Override
	public Country findByCountryName(String countryName) {
		return countryRepo.findByCountryName(countryName);
	}

	@Override
	public List<Country> getAllCountries() {
		
		return countryRepo.findAll();
	}

}
