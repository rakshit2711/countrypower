package com.powerrank.service;

import com.powerrank.model.Navalpower;

public interface NavalpowerService {
	Navalpower findByCountryId(int countryId);
	Navalpower findByCountryName(String countryName);
	Navalpower saveNavalpower(Navalpower navaPower);
}
