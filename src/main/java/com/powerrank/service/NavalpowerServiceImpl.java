package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Country;
import com.powerrank.model.Navalpower;
import com.powerrank.repository.CountryRepo;
import com.powerrank.repository.NavalPowerRepo;

@Service
public class NavalpowerServiceImpl implements NavalpowerService {
	@Autowired
	NavalPowerRepo navalPowerRepo;
	
	@Autowired
	CountryRepo countryRepo;

	@Override
	public Navalpower findByCountryId(int countryId) {
		Country country=countryRepo.findById(countryId).orElse(null);
		return navalPowerRepo.findByCountry(country);
	}

	@Override
	public Navalpower findByCountryName(String countryName) {
		Country country=countryRepo.findByCountryName(countryName);
		return navalPowerRepo.findByCountry(country);
	}

	@Override
	public Navalpower saveNavalpower(Navalpower navalPower) {
		return navalPowerRepo.save(navalPower);
	}
	
}
