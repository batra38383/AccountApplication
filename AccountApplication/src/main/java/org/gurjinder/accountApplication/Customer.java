package org.gurjinder.accountApplication;

public class Customer {
	
	private String name;
	private CustomerAddress adress;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
