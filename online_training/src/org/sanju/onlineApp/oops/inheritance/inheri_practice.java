package org.sanju.onlineApp.oops.inheritance;
  
//------------------------------------------->    MULTILEVEL INHERITANCE 4 feb 2022    <------------------------------------------------------------------- 


public class inheri_practice {
long cardNumber;    // instance variables
int cvv;            // instance variables
String bankName;    // instance variables
String name;        // instance variables
String expDate;     // instance variables
String address;

public String toString() {
	return  bankName+" "+ cardNumber +" " + cvv+ "  "+name+" "+ expDate+" "+address;
}

// common method
public void personDetails(String name,String bankname, long cardNumber,String address,String expDate,int cvv ) {
	this.name=name;
	this.bankName=bankname;
	this.address=address;
	this.cardNumber=cardNumber;
	this.expDate=expDate;
	this.cvv=cvv;
//	System.out.println("your name is "+name);
//	System.out.println("bank name is "+bankname);
//	System.out.println("address is"+address);
//	System.out.println("card number is"+cardNumber);

}
public void swipe() {
	System.out.println("the card is swiped");
}
//common method
public void withdraw() {
	System.out.println("the amount is withdrawn");
}
}

//class extending inheri_practice class 
class Debitcard extends inheri_practice{
	int fixedMoney;
	// all superclass properties is inherited to subclass
}

class Creditcard extends Debitcard{
	int cardLimit;
	
}

class Forexcard extends Creditcard {
String rootCurrency;
String targetCurrency;
	
 public void loadMoney() {
	System.out.println("load money to forex card");
}

 public void convertCurrency() {
System.out.println("convert the money from root  to target");	
}
 
}

class test{
	
	
	public static void main(String[] args) {
		Forexcard fc =new Forexcard();
		// all these properties are inherited from super class and in its own class
		fc.bankName="SBI";
		fc.cardNumber=1234567890;
		fc.cvv=345;
		fc.name="Sanju T";
		
		//these properties from forexCard
		fc.rootCurrency="100000rs";
		fc.convertCurrency();
        fc.fixedMoney=500000;	
        
fc.personDetails("anu ", "RBI ", 1234567898, " Bankok ", " 23/45/3890 ", 345);        
System.out.println(fc);
	}
}