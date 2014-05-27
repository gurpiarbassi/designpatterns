package com.gurps.designpatterns.structural.composite;

public class LeafComponent implements Component{

	private int id;
	
	public LeafComponent(int id){
		this.id = id;
	}
	
	public void refresh() {
		System.out.println("Refreshing leaf " + id);		
	}

	public String getType() {
		return getClass().getSimpleName();
	}

	public int getNoOfSubComponents() {
		return 0;
	}
}
