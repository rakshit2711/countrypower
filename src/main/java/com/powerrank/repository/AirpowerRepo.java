package com.powerrank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powerrank.model.Airpower;
import com.powerrank.model.Country;

public interface AirpowerRepo extends JpaRepository<Airpower, Integer> {
	Airpower findByCountry(Country country);
}
