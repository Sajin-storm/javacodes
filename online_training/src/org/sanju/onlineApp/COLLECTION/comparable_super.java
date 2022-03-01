package org.sanju.onlineApp.COLLECTION;

public class comparable_super implements Comparable<comparable_super> {
private int id;
private String name;
private String tech;

@Override
public String toString() {
	return "comparable_super [id=" + id + ", name=" + name + ", tech=" + tech + "]";
}

public int getId() {
	return id;
}
public comparable_super(int id, String name, String tech) {
	super();
	this.id = id;
	this.name = name;
	this.tech = tech;
}

public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}

@Override
public int compareTo(comparable_super a) {
	int i=this.getId()-a.id;
	return i;
}
}
