package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the navalpower database table.
 * 
 */
@Entity
public class Navalpower implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idnaval;

	private int aircraftCarrier;

	private int corvettes;

	private int destroyers;

	private int frigate;

	private int helicopterCarrier;

	private int mineWarfare;

	private int patrol;

	private int submarine;

	private int totalAsset;

	@ManyToOne
	@JoinColumn(name="idcountry")
	private Country country;

	public Navalpower() {
		//Default Constructor
	}

	public Navalpower(int idNaval, int aircraftCarrier, int corvettes, int destroyers, int frigate,
			int helicopterCarrier, int mineWarfare, int patrol, int submarine, int totalAsset, Country country) {
		super();
		this.idnaval = idNaval;
		this.aircraftCarrier = aircraftCarrier;
		this.corvettes = corvettes;
		this.destroyers = destroyers;
		this.frigate = frigate;
		this.helicopterCarrier = helicopterCarrier;
		this.mineWarfare = mineWarfare;
		this.patrol = patrol;
		this.submarine = submarine;
		this.totalAsset = totalAsset;
		this.country = country;
	}

	public int getIdnaval() {
		return this.idnaval;
	}

	public void setIdnaval(int idNaval) {
		this.idnaval = idNaval;
	}

	public int getAircraftCarrier() {
		return this.aircraftCarrier;
	}

	public void setAircraftCarrier(int aircraftCarrier) {
		this.aircraftCarrier = aircraftCarrier;
	}

	public int getCorvettes() {
		return this.corvettes;
	}

	public void setCorvettes(int corvettes) {
		this.corvettes = corvettes;
	}

	public int getDestroyers() {
		return this.destroyers;
	}

	public void setDestroyers(int destroyers) {
		this.destroyers = destroyers;
	}

	public int getFrigate() {
		return this.frigate;
	}

	public void setFrigate(int frigate) {
		this.frigate = frigate;
	}

	public int getHelicopterCarrier() {
		return this.helicopterCarrier;
	}

	public void setHelicopterCarrier(int helicopterCarrier) {
		this.helicopterCarrier = helicopterCarrier;
	}

	public int getMineWarfare() {
		return this.mineWarfare;
	}

	public void setMineWarfare(int mineWarfare) {
		this.mineWarfare = mineWarfare;
	}

	public int getPatrol() {
		return this.patrol;
	}

	public void setPatrol(int patrol) {
		this.patrol = patrol;
	}

	public int getSubmarine() {
		return this.submarine;
	}

	public void setSubmarine(int submarine) {
		this.submarine = submarine;
	}

	public int getTotalAsset() {
		return this.totalAsset;
	}

	public void setTotalAsset(int totalAsset) {
		this.totalAsset = totalAsset;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}