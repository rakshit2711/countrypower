package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logistic database table.
 * 
 */
@Entity
public class Logistic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idlogistic;

	private int labour;

	private int merchantMarines;

	private int portAndTerminals;

	private int railWay;

	private int roadWay;

	private int serviceableAirports;

	@ManyToOne
	@JoinColumn(name="idcountry")
	private Country country;

	public Logistic() {
		//Default Constructor
	}

	public Logistic(int idLogistic, int labour, int merchantMarines, int portAndTerminals, int railWay, int roadWay,
			int serviceableAirports, Country country) {
		super();
		this.idlogistic = idLogistic;
		this.labour = labour;
		this.merchantMarines = merchantMarines;
		this.portAndTerminals = portAndTerminals;
		this.railWay = railWay;
		this.roadWay = roadWay;
		this.serviceableAirports = serviceableAirports;
		this.country = country;
	}

	public int getIdLogistic() {
		return this.idlogistic;
	}

	public void setIdlogistic(int idLogistic) {
		this.idlogistic = idLogistic;
	}

	public int getLabour() {
		return this.labour;
	}

	public void setLabour(int labour) {
		this.labour = labour;
	}

	public int getMerchantMarines() {
		return this.merchantMarines;
	}

	public void setMerchantMarines(int merchantMarines) {
		this.merchantMarines = merchantMarines;
	}

	public int getPortAndTerminals() {
		return this.portAndTerminals;
	}

	public void setPortAndTerminals(int portAndTerminals) {
		this.portAndTerminals = portAndTerminals;
	}

	public int getRailWay() {
		return this.railWay;
	}

	public void setRailWay(int railWay) {
		this.railWay = railWay;
	}

	public int getRoadWay() {
		return this.roadWay;
	}

	public void setRoadWay(int roadWay) {
		this.roadWay = roadWay;
	}

	public int getServiceableAirports() {
		return this.serviceableAirports;
	}

	public void setServiceableAirports(int serviceableAirports) {
		this.serviceableAirports = serviceableAirports;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}