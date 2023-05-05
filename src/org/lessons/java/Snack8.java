package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Integer[] numeriPari = new Integer[10];
		Integer[] numeriDispari = new Integer[10];
		
		int contatorePari = 0;
		int contatoreDispari = 0;
		
		
		for (int i = 0; i < 10; i++) {
			
			int randNumber = rand.nextInt(0, 101);
			
			System.out.println(randNumber);
			
			if(randNumber % 2 == 0) {
				
				numeriPari[contatorePari++] = randNumber;
				
			}else {
				
				numeriDispari[contatoreDispari++] = randNumber;
			}
			
		}
		
		System.out.println(Arrays.asList(numeriPari));
		System.out.println(Arrays.asList(numeriDispari));
	}
}
