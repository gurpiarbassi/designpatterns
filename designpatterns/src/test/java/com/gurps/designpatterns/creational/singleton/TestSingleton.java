package com.gurps.designpatterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TestSingleton {

	@Test
	public void testIncrement() {
		Singleton singleton = Singleton.Instance;
		
		singleton.increment();
		
		Assert.assertEquals(1, singleton.getX());
		
		Singleton singleton2 = Singleton.Instance;
		singleton2.increment();
		
		
		Assert.assertEquals(2, singleton.getX());
		Assert.assertEquals(2, singleton2.getX());
		
	}

}
