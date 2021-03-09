package com.powerrank.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.powerrank.model.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {
	Country findByCountryName(String name);
}
