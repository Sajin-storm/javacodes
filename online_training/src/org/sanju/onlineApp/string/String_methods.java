package org.sanju.onlineApp.string;

public class String_methods {
public static void main(String[] args) {
	String_methods ref=new String_methods(); // one object is created
	String_methods ref2=new String_methods();// second object is created

	
	
	//hashCode method it is inbuilt method
	// syntax---->objrefernce.hashcode();
	
	System.out.println(ref.hashCode()  +" -->   this is a hashcode of object it will store in the form of hexadecimal");   //  hashCode of object
	System.out.println(ref2.hashCode()+"  -->   this is a hashcode of object it will store in the form of hexadecimal");  // hashCode of object
	
	
	ref=ref2;  //assigning object to the other object
	
	System.out.println(ref.hashCode()+"   -->  this is a hashcode of object it will store in the form of hexadecimal");   //  hashCode of object become same
	System.out.println(ref2.hashCode()+"  -->   this is a hashcode of object it will store in the form of hexadecimal");  // hashCode of object become same
	
	System.out.println(ref.equals(ref2));// checking the content of object if same it returns true (or) false

System.out.println(ref   + "         -->This is a object address");  // to print the object address
System.out.println(ref2  + "         -->This is a object address"); //to print the object address
System.out.println(ref.getClass()+"           -->fully qualified class name   "); // to get a fully qualified class name
System.out.println(ref2.getClass()+"          -->fully qualified class name   "); // to get a fully qualified class name

System.out.println("-------------------------------------------------------------------------------------------------------------------->");
System.out.println();

//-------------------------------------------------------------------------------->


String one="hiiam Sanju ";//even space is also a value because it converts into ASCII
System.out.println(one.length());//To find the Length of the string 
System.out.println(one.toUpperCase());//To convert the string to uppercase  
System.out.println( one.toLowerCase());// To convert the string into lowercase 
System.out.println(one.trim());//To remove the last_spaces and first_spaces  from String  


System.out.println(one.charAt(4));//t print the particular index value
System.out.println(one.substring(1, 6)); //to print the value from particular index to particular index
System.out.println(one.concat(" Businessman"));
System.out.println(one.indexOf("Sanju"));//return the index first occurence letter index
System.out.println(one.valueOf(false));























}
}