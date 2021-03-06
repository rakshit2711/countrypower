package com.powerrank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powerrank.model.Country;
import com.powerrank.model.CountryPower;
@Service
public class CountryPowerServiceImpl implements CountryPowerService {

	@Autowired
	AirPowerService airpowerService;
	
	@Autowired
	CountryService countryService;
	
	@Autowired
	FinanceService financerService;

	@Autowired
	GeographyService geographyService;
	
	@Autowired
	LandpowerService landpowerService;
	
	@Autowired
	LogisticService logisticService;
	
	@Autowired
	ManpowerService manpowerService;
	
	@Autowired
	NatresourcesService natresourcesService;
	
	@Autowired
	NavalpowerService navalpowerService;

	@Override
	public List<CountryPower> getAllCountriespower() {
		List<CountryPower> countrypowerList=new ArrayList<>();
		List<Country> countryList=countryService.getAllCountries();
		countryList.stream().forEach(country->{
			CountryPower countrypower=new CountryPower();
			countrypower.setCountry(country);
			countrypower.setAirpowers((airpowerService.findByCountryId(country.getIdcountry())));
			countrypower.setFinances(financerService.findByCountryId(country.getIdcountry()));
			countrypower.setGeographies(geographyService.findByCountryId(country.getIdcountry()));
			countrypower.setLandpowers(landpowerService.findByCountryId(country.getIdcountry()));
			countrypower.setLogistics(logisticService.findByCountryId(country.getIdcountry()));
			countrypower.setManpowers(manpowerService.findByCountryId(country.getIdcountry()));
			countrypower.setNatresources(natresourcesService.findByCountryId(country.getIdcountry()));
			countrypower.setNavalpowers(navalpowerService.findByCountryId(country.getIdcountry()));
			countrypowerList.add(countrypower);
		});
		
		return countrypowerList;
	}
	
	
}
