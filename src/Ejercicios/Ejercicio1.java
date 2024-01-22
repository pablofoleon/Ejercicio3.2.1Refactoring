package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.print("Palabra 1: ");
		String palabraUno = scanner.nextLine();

		System.out.print("Palabra 2: ");
		String palabraDos = scanner.nextLine();

		String palabraCorregida = "";

		if (palabraUno.length() < palabraDos.length()) {
			palabraCorregida = palabraCorregida.concat(palabraUno);
		} else {
			palabraCorregida = palabraCorregida.concat(palabraDos);
		}

		System.out.println("La palabra más corta es: " + palabraCorregida);

		scanner.close();
	}
}
