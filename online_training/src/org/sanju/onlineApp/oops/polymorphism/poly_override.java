package org.sanju.onlineApp.oops.polymorphism;

public class poly_override {
 int i=90;
	//common method
public void testp() {
		System.out.println("method");
	}
	
//static method
public static void testy() {
	System.out.println("static method");
}

//private method
private void testz() {
System.out.println("private");	
}

public void show(String f) {
	
}


}


class poly_ove extends poly_override{
int i=900;
	@Override
    public void testp ()
	{                                                    // normal method is overridden
      super.testp();
		System.out.println("the method is overriden");
	   System.out.println(super.i);
	   System.out.println(this.i);
	}
/*	
    @Override
    public static void testy() 
    {                                                    // wecan't override static method

    }
	
*/
	
 /*    	@Override
	    private void testz()                         // we can't override the private method
	    {
		System.out.println("private");	
		}
	
*/
	
	
	public static void main(String[] args) {
	poly_ove u=new poly_ove();
    u.testp();
    poly_ove.testy();
   System.out.println(u.i);
	}
}
	