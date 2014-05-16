package com.gurps.designpatterns.creational.prototype;

public class AnimalCloningFactory {

	public Animal getClone(Animal a){
		return a.makeClone();
	}
}
