package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci un parola");
		String parola = sc.nextLine();
		
		parola = parola.toLowerCase().replaceAll("\\s", "");
		
		boolean palindroma = true;

		int fineParola = parola.length() - 1;		
		
	
		for(int x = 0; x < fineParola; x++, fineParola-- ) {
				
			if(parola.charAt(x) != parola.charAt(fineParola)) {
				palindroma = false;
				break;
			}
				
				
		}
		
		
		
		if(palindroma) {
			System.out.println("la parola e palindroma");
		}else {
			System.out.println("la prola non e palindroma");
		}
		
		sc.close();
		
	}
}
