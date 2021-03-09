package com.powerrank.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the finances database table.
 * 
 */
@Entity
@Table(name="finances")
public class Finance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idfinance;

	private int defenseBudget;

	private int externalDebt;

	private int forExchRes;

	private int purchasingPower;
	
	@ManyToOne
	@JoinColumn(name="idcountry")
	private Country country;

	

	public Finance() {
		//Default Constructor
	}

	public Finance(int idfinance, int defenseBudget, int externalDebt, int forExchRes, int purchasingPower,
			Country country) {
		super();
		this.idfinance = idfinance;
		this.defenseBudget = defenseBudget;
		this.externalDebt = externalDebt;
		this.forExchRes = forExchRes;
		this.purchasingPower = purchasingPower;
		this.country = country;
	}

	public int getIdfinance() {
		return this.idfinance;
	}

	public void setIdfinance(int idfinance) {
		this.idfinance = idfinance;
	}

	public int getDefenseBudget() {
		return this.defenseBudget;
	}

	public void setDefenseBudget(int defenseBudget) {
		this.defenseBudget = defenseBudget;
	}

	public int getExternalDebt() {
		return this.externalDebt;
	}

	public void setExternalDebt(int externalDebt) {
		this.externalDebt = externalDebt;
	}

	public int getForExchRes() {
		return this.forExchRes;
	}

	public void setForExchRes(int forExchRes) {
		this.forExchRes = forExchRes;
	}

	public int getPurchasingPower() {
		return this.purchasingPower;
	}

	public void setPurchasingPower(int purchasingPower) {
		this.purchasingPower = purchasingPower;
	}
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}