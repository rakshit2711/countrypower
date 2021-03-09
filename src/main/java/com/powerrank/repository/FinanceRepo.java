package com.powerrank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.powerrank.model.Country;
import com.powerrank.model.Finance;

@Repository
public interface FinanceRepo extends JpaRepository<Finance, Integer> {
	Finance findByCountry(Country country);
}
