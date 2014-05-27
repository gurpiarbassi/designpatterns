package com.gurps.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Component{
	
	private List<Component> childComponents = new ArrayList<Component>();
	
	public void add(Component component) {
		childComponents.add(component);		
	}

	public void remove(Component component) {
		childComponents.remove(component);
		
	}
	public void refresh() {
		
		System.out.println("Refreshing Panel...");
		for(Component component : childComponents){
			component.refresh();
		}
	}

	public String getType() {
		return getClass().getSimpleName();
	}
}
