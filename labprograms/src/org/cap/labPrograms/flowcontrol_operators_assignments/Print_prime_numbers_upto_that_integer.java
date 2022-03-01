package org.cap.labPrograms.flowcontrol_operators_assignments;
import java.util.Scanner;
public class Print_prime_numbers_upto_that_integer {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter any number to know the prime numbers upto that number = ");
 //taking input from user 
 int input=sc.nextInt();
  
 
 //using for loop i and j to print the prime numbers
 System.out.print("The prime numbers upto that number is = ");
 int pcount=0;
 
 for(int i=2;i<input;i++) {
	 int count=0;
	 for(int j=1;j<input;j++) {
		 if(i%j==0)
			 count++;
	 }
	 if(count==2) {
		 System.out.print(i+" "); 
		 pcount++;
	 }
 }
 
 sc.close(); 
 System.out.println();
 System.out.println(pcount);// counting the primenumbers upto the user input
	}
}
