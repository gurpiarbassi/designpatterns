package com.gurps.designpatterns.structural.bridge;

public class DataAccessImpl implements DataAccess{

	private PersistenceImplementor implementor = null;
	
	public DataAccessImpl(PersistenceImplementor implementor) {
		super();
		this.implementor = implementor;
	}

	public void save(PersistenceEntity pe) {
		implementor.save(pe);		
	}

	public PersistenceEntity findByPrimaryKey(Long pk) {
		return implementor.findByPrimaryKey(pk);
	}
}
