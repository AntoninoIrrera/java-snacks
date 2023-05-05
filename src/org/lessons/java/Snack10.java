package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserire un raggio");
		int userRaggio = sc.nextInt();
		
		
		double perimetro = (2 * userRaggio) * 3.14; 
		double area = (userRaggio * userRaggio) * 3.14;
		
		System.out.println(Math.round(perimetro*100.0)/100.0);
		System.out.println(area);
		
		
		sc.close();
	}
}
