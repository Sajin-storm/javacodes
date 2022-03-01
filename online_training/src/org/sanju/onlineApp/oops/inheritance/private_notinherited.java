package org.sanju.onlineApp.oops.inheritance;

//--------------------------------------------------------------------->     private      <------------------------------------------------------------------



public class private_notinherited {

int a=10;
private int u=190;
public int getU() {
	return u;
}
public void setU(int u) {
	this.u = u;
}
		
		
		
	}
class inheri extends private_notinherited{
	public static void main(String[] args) {
		private_notinherited ref=new private_notinherited();
		ref.setU(78);
	System.out.println(ref.getU());
	}
}

