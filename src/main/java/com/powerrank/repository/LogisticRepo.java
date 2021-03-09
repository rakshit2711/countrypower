package com.powerrank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.powerrank.model.Country;
import com.powerrank.model.Logistic;

@Repository
public interface LogisticRepo extends JpaRepository<Logistic, Integer> {
	Logistic findByCountry(Country country);
}
