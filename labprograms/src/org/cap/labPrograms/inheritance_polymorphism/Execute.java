package org.cap.labPrograms.inheritance_polymorphism;

import java.util.Scanner;

public class Execute {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	 Person p1=new Person();
	 p1.create();
	 
	
     
System.out.println("enter the choice 1)Saving   2)Current");
 String choice=sc.next();
     
     switch(choice) {
     case "Saving":
    	 Savingaccount sa=new Savingaccount();
      	 sa.setAccHolder(p1);
      	 sa.setAccNum(sa.getAccNum());
      	 System.out.println("your account number is "+sa.getAccNum());
      	 
      	 System.out.print("enter the balance = ");
      	 sa.setBalance(sc.nextDouble());
      	 System.out.println("your balance is = "+sa.getBalance());

      	 System.out.println("enter the deposit = ");
      	 sa.deposit(sc.nextDouble());
      	 
      	 System.out.print("with draw the money =  ");
      	 sa.withdrawl(sc.nextDouble());
      	 
      	 System.out.println("Account Balance for "+sa.getAccHolder().getName()+" is : "+sa.getBalance()+"   account number = "+sa.getAccNum());
      	 break;
           
     case "Current":
    	 Currentaccount ca=new Currentaccount();

    	 ca.setAccHolder(p1);
      	 ca.setAccNum(ca.getAccNum());
      	 System.out.println("your account number is "+ca.getAccNum());
      	 
      	 System.out.print("enter the balance = ");
      	 ca.setBalance(sc.nextDouble());
      	 System.out.println("your balance is = "+ca.getBalance());

      	 System.out.print("enter the deposit = ");
      	 ca.deposit(sc.nextDouble());
      	 
      	 System.out.print("withdrawl the money = ");
      	 ca.withdrawl(sc.nextDouble());
      	 
      	 
      	 System.out.println("Account Balance for "+ca.getAccHolder().getName()+" is : "+ca.getBalance() + "   account number = "+ca.getAccNum());
      	 break;
         }
     }
}