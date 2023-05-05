package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci un numero");
		int userNum = sc.nextInt();
		
		for (int i = 1; i < userNum; i++) {
			
			if(userNum % i == 0) {
				System.out.println("divisibiler per: " + i);
			}
			
		}
		
		
		sc.close();
	}
}
