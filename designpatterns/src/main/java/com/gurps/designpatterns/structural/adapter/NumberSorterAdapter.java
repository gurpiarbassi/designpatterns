package com.gurps.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * This adapter takes input from the client and then calls the adaptee
 * givin it the data in the format it requires.
 * @author gurps
 *
 */
public class NumberSorterAdapter implements Sorter {

	public int[] sort(int[] numbers)

	{
		// convert the array to a List
		List<Integer> numberList = new ArrayList<Integer>(numbers.length);

		for (int index = 0; index < numbers.length; index++) {
			numberList.add(numbers[index]);
		}

		// call the adapter that can only sort on List<Integer>

		NumberSorterAdaptee sorter = new NumberSorterAdaptee();
		numberList = sorter.sort(numberList);

		int[] sortedNumbers = new int[numbers.length];

		for (int index = 0; index < numberList.size(); index++) {
			sortedNumbers[index] = numberList.get(index).intValue();
		}
		// convert the list back to an array and return

		return sortedNumbers;

	}
}