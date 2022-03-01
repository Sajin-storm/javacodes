package org.sanju.onlineApp.exception;

public class exception2demo extends excepdemo {
 
	@Override
	public void divide() {
		int a=10;
		String h=null;
				System.out.println(h.concat("hi"));
	}
	public static void main(String[] args) throws NullPointerException
	{
		exception2demo obj=new exception2demo();
		try{
obj.divide();			
		}
		catch (Exception e) {
		System.out.println("this is a exception"+e);
		}
		System.out.println("after exception");
	}
}
