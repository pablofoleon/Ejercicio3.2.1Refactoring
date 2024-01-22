package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
		public static void main(String[] args) {
			var scanner = new Scanner(System.in);

			System.out.print("Números a introducir: ");
			int numero = scanner.nextInt();

			int suma = 0, producto = 1;
			int[] numeros = new int[numero];

			for (int i = 0; i < numeros.length; i++) {
				System.out.print("Número: ");
				numeros[i] = scanner.nextInt();
				suma += numeros[i];
				producto *= numeros[i];
			}

			int resta = numeros[0];
			for (int i = 1; i < numeros.length; i++) {
				resta -= numeros[i];
			}

			int division = numeros[0];
			for (int i = 1; i < numeros.length; i++) {
				division /= numeros[i];
			}

			System.out.println("total suma: " + suma);
			System.out.println("total resta: " + resta);
			System.out.println("total multiplicacion: " + producto);
			System.out.println("total division: " + division);

			scanner.close();
		}
	
}
