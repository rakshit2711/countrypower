package com.powerrank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.powerrank.model.Country;
import com.powerrank.model.Landpower;

@Repository
public interface LandpowerRepo extends JpaRepository<Landpower, Integer> {
	Landpower findByCountry(Country country);
}
