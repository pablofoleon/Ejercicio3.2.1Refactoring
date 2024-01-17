package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Palabra 1: ");
        String p1 = scanner.nextLine();
        
        System.out.print("Palabra 2: ");
        String p2 = scanner.nextLine();
        
		String res = "";
		
		if (p1.length() < p2.length()) {
			res = res.concat(p1);
		}else {
			res = res.concat(p2);
		}

		System.out.println("La palabra más corta es: " + res);
		
		scanner.close();
	}
}
