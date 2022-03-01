package org.cap.labPrograms.exception_handling;

public class prac {
	public void validate(String firstName, String lastName) 
	{
		try
		{
			if(firstName==" " && lastName==" ")
			{
				throw new Nameexception();
			}
		}
	    catch ( Nameexception e)
		{
	    	System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		prac e= new prac();
		e.validate(" ", " ");

	}

}

