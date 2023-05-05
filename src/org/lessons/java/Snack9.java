package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserire una base");
		int userBase = sc.nextInt();
		System.out.println("inserisci una altezza");
		int userAltezza = sc.nextInt();
		
		int perimetro = (2 * userBase) + (2 * userAltezza); 
		int area = userBase * userAltezza;
		
		System.out.println(perimetro);
		System.out.println(area);
		
		
		sc.close();
	}
}
