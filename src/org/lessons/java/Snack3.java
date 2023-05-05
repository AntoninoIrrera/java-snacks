package org.lessons.java;

public class Snack3 {
	public static void main(String[] args) {
		
		int[] numeri = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		int somma = 0;
		
		for (int i = 1; i < numeri.length; i+=2) {
			
			
				
			somma += numeri[i];
			
			
		}
		
		System.out.println(somma);
	}
}
