package org.sanju.onlineApp.array;

import java.util.Arrays;

public class Array {
public static void main(String[] args) {
	
	//Representing a array
	int input[]=new int[3];
	input[0]=1;
	input[1]=2;
	input[2]=3;
	
	
	//To print the array
	for (int i = 0; i < input.length; i++) {
	System.out.print(input[i]+" ");
	}
	System.out.println();
	
	//representing a array in other form
	int input2[]= {1,2,3};
	
	//printing the array by using enhanced loop  also called as(for each loop)
	for (int element : input2) {
		System.out.print(element+" ");
	}
	
	   System.out.println();
	// count The number of values (or) length
	   //variable name.length;------->syntax
		int length=input2.length;
       System.out.println("length of the array  is ="+length);
       

       //to sort the arrays in ascending order
       // Arrays.sort(variable name)---->syntax
       System.out.println("sorted element");
       Arrays.sort(input2);
       for (int i : input2) {
		System.out.print(i+" ");
	}
       
       //to compare the arrays with other other array
       //Arrays.equals(array variable name,array variable name)
       System.out.println(Arrays.equals(input2,input));
       //output is false because it will compare with each and every value
       
       int dupleArray[]=Arrays.copyOf(input, input.length);
       //to copy the arrays to another array
       
       for (int i : dupleArray) {
		System.out.print(i +" ");
	}
       
       
       
       



}
}
