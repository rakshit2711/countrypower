package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the geography database table.
 * 
 */
@Entity
public class Geography implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idgeography;

	private int coastlineCoverage;

	private int labdArea;

	private int sharedBorder;

	private int usableWater;
	
	@ManyToOne
	@JoinColumn(name="idcountry")
	private Country country;

	public Geography() {
		//default Constructor
	}

	public Geography(int idgeography, int coastlineCoverage, int labdArea, int sharedBorder, int usableWater,
			Country country) {
		super();
		this.idgeography = idgeography;
		this.coastlineCoverage = coastlineCoverage;
		this.labdArea = labdArea;
		this.sharedBorder = sharedBorder;
		this.usableWater = usableWater;
		this.country = country;
	}

	public int getIdgeography() {
		return this.idgeography;
	}

	public void setIdgeography(int idgeography) {
		this.idgeography = idgeography;
	}

	public int getCoastlineCoverage() {
		return this.coastlineCoverage;
	}

	public void setCoastlineCoverage(int coastlineCoverage) {
		this.coastlineCoverage = coastlineCoverage;
	}

	public int getLabdArea() {
		return this.labdArea;
	}

	public void setLabdArea(int labdArea) {
		this.labdArea = labdArea;
	}

	public int getSharedBorder() {
		return this.sharedBorder;
	}

	public void setSharedBorder(int sharedBorder) {
		this.sharedBorder = sharedBorder;
	}

	public int getUsableWater() {
		return this.usableWater;
	}

	public void setUsableWater(int usableWater) {
		this.usableWater = usableWater;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}