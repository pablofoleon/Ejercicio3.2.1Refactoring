package Ejercicios;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int[][] numeros = new int[5][5];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros[i][j] = i + j;
			}
		}
		
		System.out.println("Imprimiendo Tabla.");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println();
			for (int j = 0; j < numeros.length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
		}
	}

}
