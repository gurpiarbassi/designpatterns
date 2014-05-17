package com.gurps.designpatterns.creational.singleton;

/**
 * As recommended by Josh Bloch, use enum to model singleton
 * @author gurps
 *
 */
public enum Singleton {
	 Instance;
	 
	 private int x = 0;
	 
	 public void increment(){
		 x = x + 1;
	 }
	 
	 public int getX(){
		 return x;
	 }
}
