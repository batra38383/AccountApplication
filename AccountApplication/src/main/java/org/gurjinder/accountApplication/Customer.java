package org.gurjinder.accountApplication;

public class Customer {
	
	private String name;
	private CustomerAddress adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CustomerAddress getAdress() {
		return adress;
	}
	public void setAdress(CustomerAddress adress) {
		this.adress = adress;
	}

}
