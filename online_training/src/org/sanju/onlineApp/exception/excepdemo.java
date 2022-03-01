package org.sanju.onlineApp.exception;

import java.io.*;
import java.sql.SQLException;

public class excepdemo {
String yj="welcome";
	void divide(){
		int a=23;
		int b=0;
		String g=null;
		
		try {
		//	System.out.println(g);
			System.out.println(g.concat("ro"));
		//System.out.println(a/b);
		}
		catch(ArithmeticException| NullPointerException e) {
			e.printStackTrace();
			g=new String();
			 System.out.println(g.concat("hi"));
	
			System.out.println("the code contain error");
			 b=2;
			 System.out.println(a/b);
		}
		
		//finally block always executive errespective  of exception occurs or not
		finally{
			System.out.println("iam execute irespective of exception occurs or not");
		}
		
		//one try block can contain only one finally block
	/*	finally{
			System.out.println("iam execute irespective of exception occurs or not");
		}*/
		
		
		
		
		System.out.println("block is executed");
	}
	
	public static void main(String[] args) throws ArithmeticException, IOException {
		excepdemo ref=new excepdemo();
	    ref.divide();
	    
	    //try with resource
	    try(FileReader fr=new FileReader(new File("C:\\Users\\st2\\eclipse-workspace\\online_training\\src\\org\\sanju\\onlineApp\\oops\\encapsulation\\Encapse.java"))){
int i=Integer.parseInt("123");
System.out.println(i);
	    	
	    BufferedReader bw=new BufferedReader(fr);	
	    	String str=bw.readLine();
	    	System.out.println(str);
	    	
	    	FileWriter fw=new FileWriter(new File("demo12.txt"));
	    	fw.write(str);
	    	fw.close();
		}
	   
	

}
}

