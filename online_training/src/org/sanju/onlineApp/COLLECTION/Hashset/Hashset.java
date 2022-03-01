package org.sanju.onlineApp.COLLECTION.Hashset;

import java.util.Objects;
import java.util.*;

public class Hashset implements Comparable<Hashset> {
int id;
String name;
String branch;
public Hashset(int id, String name, String branch) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
}


@Override
public String toString() {
	return "Hashset [id=" + id + ", name=" + name + ", branch=" + branch + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (getClass() != obj.getClass()) {
		return false;
	}
	Hashset other = (Hashset) obj;
	return id == other.id;
}


@Override
public int compareTo(Hashset s) {
	int i=this.id-s.id;
	return i;
}
}
