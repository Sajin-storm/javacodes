package org.cap.labPrograms.interfac;

public interface demo1 {

	void display1();
	 void display2();
	 
	 
	 default String default_method(String str) { //-> default method in interface with default keyword we 
	//	 cant override in common class it is specific for only interfaces
		 System.out.println();
		 System.out.println("default method above jdk 8 version");
		 System.out.println(str);
		 return str;
	 }
	 
	 public static String showName(String name) {
		 System.out.println("above jdk 8 version in with repect to interface");
		 System.out.println(name);
		 return name;
	 }
	 
}
