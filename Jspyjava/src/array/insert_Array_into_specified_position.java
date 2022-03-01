package array;

import java.util.Scanner;

public class insert_Array_into_specified_position {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
	
	int arr[]=new int[length];

	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("length of array before inserting" );
	sc.close();
	}

}
