package com.gurps.designpatterns.structural.bridge;

public class DataAccessImpl implements DataAccess{

	private PersisenceImplementor implementor = null;
	
	public DataAccessImpl(PersisenceImplementor implementor) {
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
