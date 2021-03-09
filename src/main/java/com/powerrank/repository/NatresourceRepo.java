package com.powerrank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.powerrank.model.Country;
import com.powerrank.model.Natresource;

@Repository
public interface NatresourceRepo extends JpaRepository<Natresource, Integer> {
	Natresource findByCountry(Country country);
}
