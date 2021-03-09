package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the natresources database table.
 * 
 */
@Entity
@Table(name="natresources")
public class Natresource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idnatres;

	private int oikReserves;

	private int oilCOnsumption;

	private int oilProduction;

	@ManyToOne
	@JoinColumn(name="idcountry")
	private Country country;

	public Natresource() {
		//Default Constructor
	}

	public Natresource(int idnatres, int oikReserves, int oilCOnsumption, int oilProduction, Country country) {
		super();
		this.idnatres = idnatres;
		this.oikReserves = oikReserves;
		this.oilCOnsumption = oilCOnsumption;
		this.oilProduction = oilProduction;
		this.country = country;
	}

	public int getIdnatres() {
		return this.idnatres;
	}

	public void setIdnatres(int idnatres) {
		this.idnatres = idnatres;
	}

	public int getOikReserves() {
		return this.oikReserves;
	}

	public void setOikReserves(int oikReserves) {
		this.oikReserves = oikReserves;
	}

	public int getOilCOnsumption() {
		return this.oilCOnsumption;
	}

	public void setOilCOnsumption(int oilCOnsumption) {
		this.oilCOnsumption = oilCOnsumption;
	}

	public int getOilProduction() {
		return this.oilProduction;
	}

	public void setOilProduction(int oilProduction) {
		this.oilProduction = oilProduction;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}