package com.gurps.designpatterns.structural.bridge;

public class PersistenceDriver {

	public static void main(String[] args){
		
		PersisenceImplementor implementor = null;
		
		//choose correct implementor based on cmd line args
		
		if(args[0].equals("F")){
			implementor = new FileDataAccess();
		}
		else if(args[0].equals("D")){
			implementor = new DBDataAccess();
		}
		
		else{
			System.out.println("Invalid option detected");
			System.exit(0);
		}
		
		implementor.findByPrimaryKey(1L);
	}
}
