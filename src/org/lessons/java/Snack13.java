package org.lessons.java;

import java.util.Arrays;

public class Snack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] arr3 = new Integer[5];
		Integer[] arr4 = new Integer[5];
		
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
			arr4[i] = arr2[i];
		}
		
		int contenitore = 0;
		
		contenitore = arr4[0];
		
		arr4[0] = arr3[0];
		
		arr3[0] = contenitore;
		
		
		System.out.println(Arrays.asList(arr3));
		System.out.println(Arrays.asList(arr4));
	}
}
