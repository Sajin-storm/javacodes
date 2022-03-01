package org.cap.labPrograms.exception_handling;

public class Nameexception extends RuntimeException {
Nameexception(){
	System.out.println("Please enter a valid name... the name will not start with blanks");
}
}
