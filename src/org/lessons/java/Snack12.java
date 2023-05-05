package org.lessons.java;

import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] arr3 = new Integer[arr1.length + arr2.length];
		
		int contatore = 0;
		
		for (int i = 0; i < arr3.length; i++) {
			
			if(i < arr1.length) {
				arr3[i] = arr1[i];				
			}else {
				arr3[i] = arr2[contatore++];
			}
					
					
		}
		
		System.out.println(Arrays.asList(arr3));
	}
}
