package org.cap.labPrograms.abstrac;

public class Rx extends Bike {

	@Override
	public void start() {
	System.out.println("the vehicle get started");	
	}

	@Override
	public void stopTheVehicle() {
		System.out.println("the vehicle is stoped");
	}
	@Override
	public void speed() {
		System.out.println("max 120");
	}
public static void main(String[] args) {
	System.out.println("using subclass object and reference");
	Rx r=new Rx();
	r.brand="RX yamaha";
	r.start();
	r.stopTheVehicle();
	r.applyBrake();
	r.register();
	
	System.out.println();
	System.out.println();
	System.out.println("using super class reference subclass object ");
	Bike b=new Rx();
	b.applyBrake();b.stopTheVehicle();b.start();b.brand="r15";
	b.register();
	b.speed();  // by using super class reference we can accesse sub class specified method only in case of overriding
	
}
}
