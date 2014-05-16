package com.gurps.designpatterns.creational.prototype;

public class Sheep implements Animal{

	public Sheep(){
		System.out.println("Creating new Sheep");
	}
	
	public Animal makeClone() {
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sheep;
		
	}
	
	public String toString(){
		return "I am a sheep";
	}

}
