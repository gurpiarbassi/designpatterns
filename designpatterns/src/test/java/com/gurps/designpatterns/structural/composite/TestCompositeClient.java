package com.gurps.designpatterns.structural.composite;

import org.junit.Assert;
import org.junit.Test;

public class TestCompositeClient {

	@Test
	public void testCompositeClient() {

		LeafComponent leaf1 = new LeafComponent(1);
		LeafComponent leaf2 = new LeafComponent(2);
		LeafComponent leaf3 = new LeafComponent(3);

		Panel panel1 = new Panel();
		panel1.add(leaf1);
		panel1.add(leaf2);

		Panel panel2 = new Panel();
		panel2.add(leaf3);

		panel1.add(panel2); 
		
		Assert.assertEquals(4, panel1.getNoOfSubComponents());
		Assert.assertEquals(1, panel2.getNoOfSubComponents());
	}
}
