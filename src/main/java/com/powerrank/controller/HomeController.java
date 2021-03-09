package com.powerrank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.powerrank.model.Country;
import com.powerrank.model.CountryList;
import com.powerrank.model.CountryPower;
import com.powerrank.model.CountryPowerList;
import com.powerrank.service.CountryPowerService;
import com.powerrank.service.CountryService;

@RestController
@RequestMapping("/firepower")
public class HomeController {
	
	@Autowired
	CountryService countryService;
	
	@Autowired
	CountryPowerService countrypowerService;
	

	@GetMapping("/country")
	public ResponseEntity<CountryList> getAllCountries(){
		List<Country> countryList=countryService.getAllCountries();
		CountryList countriesList=new CountryList(countryList);
	    return new ResponseEntity<>(countriesList, HttpStatus.OK);
	}
	
	@GetMapping("/countrypower")
	public ResponseEntity<CountryPowerList> getAllCountriesPower(){
		List<CountryPower> countryPowerList=countrypowerService.getAllCountriespower();
		CountryPowerList countriespowerList=new CountryPowerList(countryPowerList);
	    return new ResponseEntity<>(countriespowerList, HttpStatus.OK);
	}
}
