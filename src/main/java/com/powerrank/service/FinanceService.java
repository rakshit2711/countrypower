package com.powerrank.service;

import com.powerrank.model.Finance;

public interface FinanceService {
	Finance findByCountryId(int countryId);
	Finance findByCountryName(String countryName);
	Finance saveFinance(Finance finance);
}
