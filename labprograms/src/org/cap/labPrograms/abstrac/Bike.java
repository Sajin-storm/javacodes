package org.cap.labPrograms.abstrac;

abstract class Bike {
	String brand;
	Bike(){
		System.out.println("default constructor");
	}
	
	Bike(String brand){
		this.brand=brand;
		System.out.println(brand);
	}

	public void speed() {
		System.out.println("max 160");
	}
public void register() {
	System.out.println("register the vehicle with respectIVE RTO");
}
	
abstract public void start();  //abstract method
abstract public void stopTheVehicle();

	public void applyBrake() {
		System.out.println("apply the break");
	}
	
public static void main(String[] args) {
// Bike b=new Bike();                          we cannot create a object for abstract class // and also we can make use of static method but not standard
	System.out.println("main method executed ");
}
}
