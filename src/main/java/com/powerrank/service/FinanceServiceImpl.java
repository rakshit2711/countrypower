package com.powerrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Finance;
import com.powerrank.model.Country;
import com.powerrank.repository.FinanceRepo;
import com.powerrank.repository.CountryRepo;
@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	FinanceRepo financeRepo;
	
	@Override
	public Finance findByCountryId(int countryId) {
		Country country=countryRepo.findById(countryId).orElse(null);
		return financeRepo.findByCountry(country);
	}

	@Override
	public Finance findByCountryName(String countryName) {
		Country country=countryRepo.findByCountryName(countryName);
		return financeRepo.findByCountry(country);
	}

	@Override
	public Finance saveFinance(Finance finance) {
		return financeRepo.save(finance);
	}

}
