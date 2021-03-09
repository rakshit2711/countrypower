package com.powerrank.service;

import com.powerrank.model.Logistic;

public interface LogisticService {
	Logistic findByCountryId(int countryId);
	Logistic findByCountryName(String countryName);
	Logistic saveLogistic(Logistic logistic);

}
