package org.lessons.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		
		String[] nomi = {"fabio","luca","paolo","giulio","marco","donato"};
		String[] cognomi = {"montrone","giusino","passiatore","macrì","piscopo","battaglia"};
		
		Random rand = new Random();
		
		for (int i = 0; i < cognomi.length; i++) {
			
			
			int randNumber = rand.nextInt(0, cognomi.length);
			
			System.out.println(nomi[i] + " " + cognomi[randNumber]);
		}
		
		
	}
}
