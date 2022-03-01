package org.sanju.onlineApp.oops.encapsulation;

public class address {
	private int flatno;
	private String city;
	private String state;
	private String country;
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", city=" + city + ", state=" + state + ", country=" + country + "]";
}
}
