package org.cap.labPrograms.inheritance_polymorphism;

import java.util.Random;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
    Random n=new Random();
    long randaccNum=n.nextLong(1000000989090l); 
	this.accNum=randaccNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount) {
	this.setBalance(this.getBalance()+amount);
	System.out.println("amount added" + amount);
	System.out.println("remaining amount " + this.getBalance());
	}
	
	public void withdrawl(double amount) {
		this.setBalance(this.getBalance()-amount);
	System.out.println("amount deducted" + amount);
	System.out.println("remaining amount " + this.getBalance());
	}
	
	public double balance() {
		
		
		
		
	return this.getBalance();
	}
	
	
}
	
	
