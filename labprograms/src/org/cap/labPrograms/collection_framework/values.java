package org.cap.labPrograms.collection_framework;
import java.util.*;
public class values{// implements //Comparable<values> {
private int key;
private String values;

public values(int key, String values) {
	super();
	this.key = key;
	this.values = values;
}


@Override
public String toString() {
	return "values [key=" + key + ", values=" + values + "]";
}



public int getKey() {
	return key;
}
public void setKey(int key) {
	this.key = key;
}
public String getValues() {
	return values;
}
public void setValues(String values) {
	this.values = values;
}

//
//@Override
//public int compareTo(values s) {
//int i=  this.key-s.key;     
//	return i;
//}
}