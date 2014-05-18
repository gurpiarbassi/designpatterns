package com.gurps.designpatterns.structural.adapter;

import java.util.Arrays;

/**
 * The adapter pattern is used so that two unrelated interfaces can work together.
 * 
 * Clients call operations on the adapter, which in turn calls operations on the adaptee.
 * @author gurps
 *
 */
public class Client {

	public static void main(String[] args){
		
		int[] numbers = new int[]{34, 2, 4, 12, 1};
		System.out.println("BEFORE : " + Arrays.toString(numbers));
		
		Sorter sorter = new NumberSorterAdapter();	
		int[] numbers2 = sorter.sort(numbers);
		System.out.println("After : " + Arrays.toString(numbers2));
	}
}
