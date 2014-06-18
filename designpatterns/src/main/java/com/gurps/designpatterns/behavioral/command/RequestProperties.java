package com.gurps.designpatterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class RequestProperties {

	Map<String, String> props = new HashMap<String, String>();
	
	public void put(String key, String value){
		props.put(key, value);
	}
	
	public String get(String key){
		return props.get(key);
	}
}
