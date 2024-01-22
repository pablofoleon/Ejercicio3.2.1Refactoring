package Ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {

		MostrarTabla(crearTabla());

	}

	public static int[][] crearTabla() {

		int[][] tabla = new int[5][5];

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla.length; j++) {

				tabla[i][j] = i + j;
			}
		}

		return tabla;
	}

	public static void MostrarTabla(int[][] tabla) {

		System.out.println("Imprimiendo Tabla.");

		for (int i = 0; i < tabla.length; i++) {

			System.out.println();

			for (int j = 0; j < tabla.length; j++) {

				System.out.print(tabla[i][j] + " ");

			}
		}
	}

}
