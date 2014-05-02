package com.gurps.designpatterns.creational.factory;

public class Cabbage implements Vegetable{

	public String getColour() {
		return "red";
	}

	public String getDescription() {
		return "I am a cabbage";
	}

	public VegetableType getType() {
		return VegetableType.LEAFY;
	}	
}
