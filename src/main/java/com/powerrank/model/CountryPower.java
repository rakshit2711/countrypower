package com.powerrank.model;

public class CountryPower {
	
	private Country country;
	
	private Airpower airpowers;

	private Finance finances;

	private Geography geographies;

	private Landpower landpowers;

	private Logistic logistics;

	private Manpower manpowers;

	private Natresource natresources;

	private Navalpower navalpowers;

	public CountryPower() {
		super();
		// Default COnstrutor
	}

	public CountryPower(Country country, Airpower airpowers, Finance finances, Geography geographies,
			Landpower landpowers, Logistic logistics, Manpower manpowers, Natresource natresources,
			Navalpower navalpowers) {
		super();
		this.country = country;
		this.airpowers = airpowers;
		this.finances = finances;
		this.geographies = geographies;
		this.landpowers = landpowers;
		this.logistics = logistics;
		this.manpowers = manpowers;
		this.natresources = natresources;
		this.navalpowers = navalpowers;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Airpower getAirpowers() {
		return airpowers;
	}

	public void setAirpowers(Airpower airpowers) {
		this.airpowers = airpowers;
	}

	public Finance getFinances() {
		return finances;
	}

	public void setFinances(Finance finances) {
		this.finances = finances;
	}

	public Geography getGeographies() {
		return geographies;
	}

	public void setGeographies(Geography geographies) {
		this.geographies = geographies;
	}

	public Landpower getLandpowers() {
		return landpowers;
	}

	public void setLandpowers(Landpower landpowers) {
		this.landpowers = landpowers;
	}

	public Logistic getLogistics() {
		return logistics;
	}

	public void setLogistics(Logistic logistics) {
		this.logistics = logistics;
	}

	public Manpower getManpowers() {
		return manpowers;
	}

	public void setManpowers(Manpower manpowers) {
		this.manpowers = manpowers;
	}

	public Natresource getNatresources() {
		return natresources;
	}

	public void setNatresources(Natresource natresources) {
		this.natresources = natresources;
	}

	public Navalpower getNavalpowers() {
		return navalpowers;
	}

	public void setNavalpowers(Navalpower navalpowers) {
		this.navalpowers = navalpowers;
	}

	
}
