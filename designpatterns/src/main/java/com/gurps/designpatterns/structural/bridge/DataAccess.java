package com.gurps.designpatterns.structural.bridge;

public interface DataAccess {

	void save(PersistenceEntity pe);
	
	PersistenceEntity findByPrimaryKey(Long pk);
}
