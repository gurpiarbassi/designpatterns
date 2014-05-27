package com.gurps.designpatterns.structural.bridge;

import org.junit.Assert;
import org.junit.Test;

public class TestBridge {

	@Test
	public void testBridge() {
		PersistenceImplementor implementor = new FileDataAccess();
		PersistenceEntity pe = implementor.findByPrimaryKey(1L);
		Assert.assertEquals("F", pe.getRecordType());
		
		implementor = new DBDataAccess();
		pe = implementor.findByPrimaryKey(1L);
		Assert.assertEquals("D", pe.getRecordType());
	}
}
