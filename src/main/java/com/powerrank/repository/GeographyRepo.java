package com.powerrank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.powerrank.model.Country;
import com.powerrank.model.Geography;

@Repository
public interface GeographyRepo extends JpaRepository<Geography, Integer> {
	Geography findByCountry(Country country);
}
