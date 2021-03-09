package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the landpower database table.
 * 
 */
@Entity
public class Landpower implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idLand;

	private int armouredVehicle;

	private int rocketProjector;

	private int selfPropelledArtillery;

	private int tank;

	private int towedArtillery;

	@ManyToOne
	@JoinColumn(name="idcountry")
	private Country country;

	public Landpower() {
		//Default COnstrucor
	}

	public Landpower(int idLand, int armouredVehicle, int rocketProjector, int selfPropelledArtillery, int tank,
			int towedArtillery, Country country) {
		super();
		this.idLand = idLand;
		this.armouredVehicle = armouredVehicle;
		this.rocketProjector = rocketProjector;
		this.selfPropelledArtillery = selfPropelledArtillery;
		this.tank = tank;
		this.towedArtillery = towedArtillery;
		this.country = country;
	}

	public int getIdLand() {
		return this.idLand;
	}

	public void setIdLand(int idLand) {
		this.idLand = idLand;
	}

	public int getArmouredVehicle() {
		return this.armouredVehicle;
	}

	public void setArmouredVehicle(int armouredVehicle) {
		this.armouredVehicle = armouredVehicle;
	}

	public int getRocketProjector() {
		return this.rocketProjector;
	}

	public void setRocketProjector(int rocketProjector) {
		this.rocketProjector = rocketProjector;
	}

	public int getSelfPropelledArtillery() {
		return this.selfPropelledArtillery;
	}

	public void setSelfPropelledArtillery(int selfPropelledArtillery) {
		this.selfPropelledArtillery = selfPropelledArtillery;
	}

	public int getTank() {
		return this.tank;
	}

	public void setTank(int tank) {
		this.tank = tank;
	}

	public int getTowedArtillery() {
		return this.towedArtillery;
	}

	public void setTowedArtillery(int towedArtillery) {
		this.towedArtillery = towedArtillery;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}