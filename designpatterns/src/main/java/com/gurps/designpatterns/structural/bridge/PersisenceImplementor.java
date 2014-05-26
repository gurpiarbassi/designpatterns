package com.gurps.designpatterns.structural.bridge;

public interface PersisenceImplementor {

	void save(PersistenceEntity pe);

	PersistenceEntity findByPrimaryKey(Long pk);
}
