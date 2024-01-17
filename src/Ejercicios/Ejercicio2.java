package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public class Boletin7Ejercicio4 {
		public static void main(String[] args) {
			var scanner = new Scanner(System.in);
			
			System.out.print("Números a introducir: ");
			int n = scanner.nextInt();
			
			int sum = 0, mul = 1;		
			int[] numeros = new int [n];
			
			for (int i = 0; i < numeros.length;i++) {
				System.out.print("Numero: ");
				numeros[i] = scanner.nextInt();
				sum += numeros[i];
				mul *= numeros[i];
			}
			
			
			int re = numeros[0];
			
			for (int i=1; i < numeros.length;i++) {
				re-=numeros[i];
			}

			int div = numeros[0];
			
			for (int i=1; i < numeros.length;i++) {
				div/=numeros[i];
			}
			
			System.out.println("total suma: " + sum);
			System.out.println("total resta: " + re);
			System.out.println("total multiplicacion: " + mul);
			System.out.println("total division: " + div);
			
			
			scanner.close();
		}
	}
}
