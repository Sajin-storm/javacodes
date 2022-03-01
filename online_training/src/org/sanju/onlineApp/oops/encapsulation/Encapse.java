package org.sanju.onlineApp.oops.encapsulation;

public class Encapse {
private int id;
private String tech;
private String sname;
private address Address;
public int getId() {
	return id;
}
@Override
public String toString() {
	return "Encapse [id=" + id + ", tech=" + tech + ", sname=" + sname + ", Address=" + Address + "]";
}
public Encapse(int id, String tech, String sname, address address) {
	super();
	this.id = id;
	this.tech = tech;
	this.sname = sname;
	Address = address;
}
public void setId(int id) {
	this.id = id;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public address getAddress() {
	return Address;
}
public void setAddress(address address) {
	Address = address;
}


}
