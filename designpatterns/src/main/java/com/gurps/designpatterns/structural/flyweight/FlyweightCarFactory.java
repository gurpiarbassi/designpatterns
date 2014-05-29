package com.gurps.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight car factory
 * @author gurps
 *
 */
public class FlyweightCarFactory {

	private Map<String, Car> carPool;
	
	private static FlyweightCarFactory INSTANCE = null;
	
	public static FlyweightCarFactory getInstance(){
		if(INSTANCE == null){
			INSTANCE = new FlyweightCarFactory();
		}
		
		return INSTANCE;
	}
	
	private FlyweightCarFactory(){
		carPool = new HashMap<String, Car>();
	}
	
	public Car createCar(String make, String model, String year){
	
		String key = make + "_" + model + "_" + year;
		Car car = carPool.get(key); 
		if(car == null){
			car = new Car(make, model, year);
			carPool.put(key, car);		
		}
		
		return car;
	}
}
