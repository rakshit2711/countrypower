package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idcountry")
	private int idcountry;

	@Column(name="capital")
	private String capital;

	@Column(name="countryName")
	private String countryName;
	
	public Country() {
		// Default COnstructor
	}

	public Country(int idCountry, String capital, String countryName) {
		super();
		this.idcountry = idCountry;
		this.capital = capital;
		this.countryName = countryName;
	}

	public int getIdcountry() {
		return idcountry;
	}

	public void setIdcountry(int idCountry) {
		this.idcountry = idCountry;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}