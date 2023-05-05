package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci un numero: ");
		int userNum = sc.nextInt();
		
		if(userNum % 2 == 0) {
			System.out.println(userNum);
		}else {
			System.out.println(userNum + 1);
		}
		
		sc.close();
	}
}
