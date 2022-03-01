package org.cap.labPrograms.flowcontrol_operators_assignments;
import java.util.Scanner;
public class checkNumber {
	private static boolean Checknumberin(int n) {
	boolean flag=false;
	int currentElement=n%10;
	n=n/10;
	
	while(n>0) {
		if(currentElement < n%10) 
		{
		flag=true;
		break;
		}
		else
			flag=false;
	
		currentElement=n%10;
		n=n/10;
	}
return flag == false;

	}           

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter any number = ");
int num=sc.nextInt();                             //taking input   from user
boolean p=Checknumberin(num);
System.out.println(p);
if(p==true)
	System.out.println("increasing");
else
	System.out.println("not increasing");
	}
}