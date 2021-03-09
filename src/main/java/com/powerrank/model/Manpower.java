package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the manpower database table.
 * 
 */
@Entity
public class Manpower implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idmanpower;

	private BigInteger activePersonnel;

	private BigInteger availableManPower;

	private BigInteger fitForSerrvice;

	private BigInteger reachMilRanAnnually;

	private BigInteger reservePersonnel;

	private BigInteger totalMilPersonnel;

	private BigInteger totalPopulation;

	@ManyToOne
	@JoinColumn(name="idcountry")
	private Country country;

	public Manpower() {
		//Default Constructor
	}

	public Manpower(int idmanpower, BigInteger activePersonnel, BigInteger availableManPower, BigInteger fitForSerrvice,
			BigInteger reachMilRanAnnually, BigInteger reservePersonnel, BigInteger totalMilPersonnel,
			BigInteger totalPopulation, Country country) {
		super();
		this.idmanpower = idmanpower;
		this.activePersonnel = activePersonnel;
		this.availableManPower = availableManPower;
		this.fitForSerrvice = fitForSerrvice;
		this.reachMilRanAnnually = reachMilRanAnnually;
		this.reservePersonnel = reservePersonnel;
		this.totalMilPersonnel = totalMilPersonnel;
		this.totalPopulation = totalPopulation;
		this.country = country;
	}

	public int getIdmanpower() {
		return this.idmanpower;
	}

	public void setIdmanpower(int idmanpower) {
		this.idmanpower = idmanpower;
	}

	public BigInteger getActivePersonnel() {
		return this.activePersonnel;
	}

	public void setActivePersonnel(BigInteger activePersonnel) {
		this.activePersonnel = activePersonnel;
	}

	public BigInteger getAvailableManPower() {
		return this.availableManPower;
	}

	public void setAvailableManPower(BigInteger availableManPower) {
		this.availableManPower = availableManPower;
	}

	public BigInteger getFitForSerrvice() {
		return this.fitForSerrvice;
	}

	public void setFitForSerrvice(BigInteger fitForSerrvice) {
		this.fitForSerrvice = fitForSerrvice;
	}

	public BigInteger getReachMilRanAnnually() {
		return this.reachMilRanAnnually;
	}

	public void setReachMilRanAnnually(BigInteger reachMilRanAnnually) {
		this.reachMilRanAnnually = reachMilRanAnnually;
	}

	public BigInteger getReservePersonnel() {
		return this.reservePersonnel;
	}

	public void setReservePersonnel(BigInteger reservePersonnel) {
		this.reservePersonnel = reservePersonnel;
	}

	public BigInteger getTotalMilPersonnel() {
		return this.totalMilPersonnel;
	}

	public void setTotalMilPersonnel(BigInteger totalMilPersonnel) {
		this.totalMilPersonnel = totalMilPersonnel;
	}

	public BigInteger getTotalPopulation() {
		return this.totalPopulation;
	}

	public void setTotalPopulation(BigInteger totalPopulation) {
		this.totalPopulation = totalPopulation;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}