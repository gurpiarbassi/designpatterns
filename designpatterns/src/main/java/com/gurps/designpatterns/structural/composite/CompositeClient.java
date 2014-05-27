package com.gurps.designpatterns.structural.composite;

/**
 * The purpose of the composite pattern is to treat simple 
 * components and groups of components in the same way.
 * 
 * Terminology: A Leaf is a simple object. A Node is a group (composition)
 * of objects. Both of these types of object must implement
 * a common interface if they are to be treated uniformly.
 * 
 * Note: The object relationship assumed is 'whole-part' or 'is-part-of'.
 * 
 * This example shows how it can be used in a GUI framework to refresh 
 * areas of the screen.
 * 
 * 
 * 
 * @author gurps
 *
 */
public class CompositeClient {

	public static void main(String[] args){
		
		LeafComponent leaf1 = new LeafComponent(1);
		LeafComponent leaf2 = new LeafComponent(2);
		LeafComponent leaf3 = new LeafComponent(3);
		
		Panel panel1 = new Panel();
		panel1.add(leaf1);
		panel1.add(leaf2);
		
		Panel panel2 = new Panel();
		panel2.add(leaf3);
		
		
		panel1.add(panel2); // you can add panel2 to panel1 since they are both of type Components
		
		panel1.refresh();
	}
}
