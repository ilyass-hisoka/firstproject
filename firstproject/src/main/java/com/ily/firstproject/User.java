package com.ily.firstproject;

public class User {
	
	private String name;
	
	private String adress;
	
	

	public User(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}
	

	public User() {
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	

}
