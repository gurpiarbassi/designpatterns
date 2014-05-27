package com.gurps.designpatterns.structural.bridge;

public interface PersistenceImplementor {

	void save(PersistenceEntity pe);

	PersistenceEntity findByPrimaryKey(Long pk);
}
