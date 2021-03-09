package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the airpower database table.
 * 
 */
@Entity
public class Airpower implements Serializable {
	
	public Airpower() {
		//default Constructor
	}
	
	public Airpower(int idAir, int attackHelicopter, int dedicatedAttack, int fighter, int helicopter,
			int specialMission, int tankerFleet, int totalStrength, int trainer, int transport, Country country) {
		super();
		this.idair = idAir;
		this.attackHelicopter = attackHelicopter;
		this.dedicatedAttack = dedicatedAttack;
		this.fighter = fighter;
		this.helicopter = helicopter;
		this.specialMission = specialMission;
		this.tankerFleet = tankerFleet;
		this.totalStrength = totalStrength;
		this.trainer = trainer;
		this.transport = transport;
		this.country = country;
	}

	private static final long serialVersionUID = 1L;

	@Id
	private int idair;

	private int attackHelicopter;

	private int dedicatedAttack;

	private int fighter;

	private int helicopter;

	private int specialMission;

	private int tankerFleet;

	private int totalStrength;

	private int trainer;

	private int transport;

	@ManyToOne
	@JoinColumn(name="idcountry")
	private Country country;

	
	public int getIdair() {
		return this.idair;
	}

	public void setIdair(int idAir) {
		this.idair = idAir;
	}

	public int getAttackHelicopter() {
		return this.attackHelicopter;
	}

	public void setAttackHelicopter(int attackHelicopter) {
		this.attackHelicopter = attackHelicopter;
	}

	public int getDedicatedAttack() {
		return this.dedicatedAttack;
	}

	public void setDedicatedAttack(int dedicatedAttack) {
		this.dedicatedAttack = dedicatedAttack;
	}

	public int getFighter() {
		return this.fighter;
	}

	public void setFighter(int fighter) {
		this.fighter = fighter;
	}

	public int getHelicopter() {
		return this.helicopter;
	}

	public void setHelicopter(int helicopter) {
		this.helicopter = helicopter;
	}

	public int getSpecialMission() {
		return this.specialMission;
	}

	public void setSpecialMission(int specialMission) {
		this.specialMission = specialMission;
	}

	public int getTankerFleet() {
		return this.tankerFleet;
	}

	public void setTankerFleet(int tankerFleet) {
		this.tankerFleet = tankerFleet;
	}

	public int getTotalStrength() {
		return this.totalStrength;
	}

	public void setTotalStrength(int totalStrength) {
		this.totalStrength = totalStrength;
	}

	public int getTrainer() {
		return this.trainer;
	}

	public void setTrainer(int trainer) {
		this.trainer = trainer;
	}

	public int getTransport() {
		return this.transport;
	}

	public void setTransport(int transport) {
		this.transport = transport;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}