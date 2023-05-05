package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci un numero");
		int userNum = sc.nextInt();
		
		Random rand = new Random();
		
		int somma = 0;
		int sommaPari = 0;
		int sommaDispari = 0;
		int contatoreDispari = 0;
		int max = 0;
//		int min = 0;
//		int min = 100;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < userNum; i++) {
			
			int randNumber = rand.nextInt(0, 101);
			
			System.out.println(randNumber);
			
			somma += randNumber;
			
			if(randNumber % 2 == 0) {
				sommaPari += randNumber;
			}else {
				contatoreDispari++;
				sommaDispari += randNumber;
			}
			
//			if(max < randNumber) {
//				max = randNumber;
//				min = randNumber;
//			}
//			if(min > randNumber) {
//				min = randNumber;
//			}
			
			if(randNumber > max) {
				max = randNumber;
			}
			if(randNumber < min) {
				min = randNumber;
			}
			
				
		}
		
		int media = somma / userNum;
		int mediaDispari = 0;
		
		if(contatoreDispari > 0) {

			mediaDispari = sommaDispari / contatoreDispari;
			
		}
				
		System.out.println("la somma e: " + somma);
		System.out.println("la somma pari e: " + sommaPari);
		System.out.println("la media e: " + media);
		System.out.println("la media dei dispari e: " + mediaDispari);
		System.out.println("il numero massimo e: " + max);
		System.out.println("il nuemro minimo e: " + min);
		
		sc.close();
		
	}
}
