package org.cap.labPrograms.inheritance_polymorphism;

public class Currentaccount extends Account {
private boolean overDraft;

public boolean isOverDraft() {
	return overDraft;
}

public void setOverDraft(boolean overDraft) {
	this.overDraft = overDraft;
}

@Override
public void withdrawl(double amount)
{
	this.setBalance(this.getBalance()-amount);
	System.out.println("deducted amount is = " + amount);
	
	
	
	if(this.getBalance()<0) {
		this.setOverDraft(true);
		System.out.println("overDraft Limit is reached");
		System.out.println(this.overDraft);
	}
	else {
		this.setOverDraft(false);
		System.out.println("overDraft Limitnot reached u can access");
}
	}
}
