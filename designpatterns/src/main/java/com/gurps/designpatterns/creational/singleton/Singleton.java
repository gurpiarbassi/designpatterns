package com.gurps.designpatterns.creational.singleton;

/**
 * As recommended by Josh Bloch, use enum to model singleton
 * 
 * Provides guarantee against multiple instantiations, 
 * even in the face of serialization or reflection attacks. 
 * 
 * While this approach has yet to be widely adopted, 
 * a single-element enum type is the best way to implement a singleton.
 * 
 * An enum type has no instances other than those defined by its enum constants. 
 * It is a compile-time error to attempt to explicitly instantiate an enum type.
 * The final clone method in Enum ensures that enum constants can never be cloned, 
 * and the special treatment by the serialization mechanism ensures that duplicate instances are never 
 * created as a result of deserialization. 
 * Reflective instantiation of enum types is prohibited. 
 * 
 * Together, these four things ensure that no instances of an enum type exist beyond those defined by the enum constants.
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
