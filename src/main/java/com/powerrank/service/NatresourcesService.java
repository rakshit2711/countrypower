package com.powerrank.service;

import com.powerrank.model.Natresource;

public interface NatresourcesService {
	Natresource findByCountryId(int countryId);
	Natresource findByCountryName(String countryName);
	Natresource saveNavalpower(Natresource natresource);
}
