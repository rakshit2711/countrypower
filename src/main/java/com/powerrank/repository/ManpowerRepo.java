package com.powerrank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.powerrank.model.Country;
import com.powerrank.model.Manpower;

@Repository
public interface ManpowerRepo extends JpaRepository<Manpower, Integer> {
	Manpower findByCountry(Country country);
}
