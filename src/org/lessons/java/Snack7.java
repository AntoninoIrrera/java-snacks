package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int randNumber = -1;
		
		while(randNumber % 3 != 0 && randNumber % 5 != 0){
			
			randNumber = rand.nextInt(0, 101);
			System.out.println(randNumber);
			
		}
		
	}
}
