package com.gurps.designpatterns.structural.bridge;


public class FileDataAccess implements PersisenceImplementor{

	public void save(PersistenceEntity pe) {
		System.out.println("Saving file");
		
	}

	public PersistenceEntity findByPrimaryKey(Long pk) {
		System.out.println("Finding file by primary key");
		PersistenceEntity pe = new PersistenceEntity();
		pe.setRecordType("F");
		return pe;
	}	
}
