package com.gurps.designpatterns.structural.bridge;

public class DBDataAccess implements PersistenceImplementor{

	public void save(PersistenceEntity pe) {
		//save data to database
		System.out.println("DBDataAccess: save() called");		
	}

	public PersistenceEntity findByPrimaryKey(Long pk) {
		//read data from database
		PersistenceEntity pe = new PersistenceEntity();
		pe.setRecordType("D");
		System.out.println("DBDataAccess: findByPrimaryKey() called");
		return pe;
	}
}
