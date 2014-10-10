package org.gurjinder.accountApplication;

public abstract class Account {
	
	private double amount;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public abstract void depositMoney(double amount);
	
	public abstract void withdrawMoney(double amount);

}
