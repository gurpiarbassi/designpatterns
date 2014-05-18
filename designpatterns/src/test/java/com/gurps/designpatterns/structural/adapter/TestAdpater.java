package com.gurps.designpatterns.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class TestAdpater {

	@Test
	public void testSort() {
		
		int[] numbers = new int[]{34, 2, 4, 12, 1};
		
		
		Sorter sorter = new NumberSorterAdapter();	
		int[] numbers2 = sorter.sort(numbers);
		
		Assert.assertArrayEquals(new int[]{1, 2, 4, 12, 34}, numbers2);
	}

}
