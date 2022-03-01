package org.cap.labPrograms.flowcontrol_operators_assignments;

import java.util.Scanner;

public class FibonaciSeries_specified_fibonaci {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter any index to get to know the fibomacci number = ");
int n=sc.nextInt();    // Taking input from user   
int firstValue=0;
int secondValue=1;
int indexValue;

while(n>0) 
{
    indexValue=firstValue+secondValue;
    firstValue=secondValue;
    secondValue=indexValue;
    n--;
 }

System.out.println(firstValue);  // printing the specified index value of fibonacci sequennce
sc.close();
	}
}
