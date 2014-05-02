package com.gurps.designpatterns.creational.factory;

public class Carrot implements Vegetable{

	public String getColour() {
		return "green";
	}

	public String getDescription() {
		return "I am a carrot";
	}

	public VegetableType getType() {
		return VegetableType.ROOT;
	}

}
