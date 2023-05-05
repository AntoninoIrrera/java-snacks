package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("inserisci un numero limite da raggiungere");
		int userNum = sc.nextInt();
		
		int somma = 0;
		
		while(somma < userNum) {
			
			int randNumber = rand.nextInt(0, 101);
			
			somma += randNumber;
			
			System.out.println(randNumber);
			
		}
		
		System.out.println(somma);
		
		sc.close();
		
	}
}
