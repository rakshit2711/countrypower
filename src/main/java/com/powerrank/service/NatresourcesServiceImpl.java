package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Country;
import com.powerrank.model.Natresource;
import com.powerrank.repository.CountryRepo;
import com.powerrank.repository.NatresourceRepo;

@Service
public class NatresourcesServiceImpl implements NatresourcesService {
	@Autowired
	NatresourceRepo natresourceRepo;

	@Autowired
	CountryRepo countryRepo;
	
	@Override
	public Natresource findByCountryId(int countryId) {
		Country country=countryRepo.findById(countryId).orElse(null);
		return natresourceRepo.findByCountry(country);
	}

	@Override
	public Natresource findByCountryName(String countryName) {
		Country country=countryRepo.findByCountryName(countryName);
		return natresourceRepo.findByCountry(country);
	}

	@Override
	public Natresource saveNavalpower(Natresource natresource) {
		return natresourceRepo.save(natresource);
	}
	
}
