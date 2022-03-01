package org.sanju.onlineApp.oops.polymorphism;

public class poly_demo{
	
    public poly_demo(){                  
    	this(345,678);// zero parameter constructor
		System.out.println("zero parameter");
	}
	
	public poly_demo(int price, int discount) {   //parametrized constructor
		System.out.println(price+" "+ discount);
		System.out.println("parameterized constructor");
	}
	
	//------------------------------->      Method overloading              <------------------------------------
  public void pay(int currency,String Through)              // method
      {
	  
	  System.out.println(currency);
	  System.out.println(Through);
	  this.pay(123,"debitcard","SBI");
	  this.pay("net banking", 89073);
	 
      }
  
  
  public void pay( String Through,int currency)      // method overloading- change in datatypes
         {      
	   
	  System.out.println(currency+ " is recharged through the " + Through);
      
         }
  
  public void pay(int currency, String Through,String bank)     // methodoverloading -change in number of datatypes
  {  
	    System.out.println(currency+ " is recharged through the " + Through +" through "+ bank);
  }
	public static void main(String[] args) {
	
		//poly_demo ref=new poly_demo();
	poly_demo ref=new poly_demo();
	ref.pay(456, "phonepay");                 // compile time based on argument 

	}}