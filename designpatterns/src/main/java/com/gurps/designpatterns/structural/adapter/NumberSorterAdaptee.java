package com.gurps.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Think of this as a third party system that sorts a java.util.List of
 * Integers.
 * 
 * @author gurps
 *
 */
public class NumberSorterAdaptee {

	public List<Integer> sort(List<Integer> numbers)

	{		Collections.sort(numbers);
			List<Integer> sortedList = new ArrayList<Integer>();
			sortedList.addAll(numbers);
			return sortedList;
	}
}
