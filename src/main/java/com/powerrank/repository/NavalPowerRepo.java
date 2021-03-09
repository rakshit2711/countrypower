package com.powerrank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.powerrank.model.Country;
import com.powerrank.model.Navalpower;

@Repository
public interface NavalPowerRepo extends JpaRepository<Navalpower, Integer> {
	Navalpower findByCountry(Country country);
}
