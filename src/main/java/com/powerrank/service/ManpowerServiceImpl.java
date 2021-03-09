package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Country;
import com.powerrank.model.Manpower;
import com.powerrank.repository.CountryRepo;
import com.powerrank.repository.ManpowerRepo;
@Service
public class ManpowerServiceImpl implements ManpowerService {
	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	ManpowerRepo manpowerRepo;
	@Override
	public Manpower findByCountryId(int countryId) {
		Country country=countryRepo.findById(countryId).orElse(null);
		return manpowerRepo.findByCountry(country);
	}

	@Override
	public Manpower findByCountryName(String countryName) {
		Country country=countryRepo.findByCountryName(countryName);
		return manpowerRepo.findByCountry(country);
	}

	@Override
	public Manpower saveManpower(Manpower manpower) {
		return manpowerRepo.save(manpower);
	}
}
