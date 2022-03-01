package org.cap.labPrograms.inheritance_polymorphism;

public class Savingaccount extends Account {
private  final double minimumBalance=200;


@Override
public void withdrawl(double amount) {
	
	if(this.getBalance()>minimumBalance) {
		System.out.println("u can withdraw the money");
	this.setBalance(this.getBalance()-amount);
	System.out.println("the amount deducted "+ amount);
	System.out.println("remaining balance is" + this.getBalance());
	}
	else
		System.out.println("Low balance you can't withdrawn");
	
	}
}
