package Ejercicios;

import java.util.Random;

public class Ejercicio3 {
	public static void main(String[] args) {

        char[] tablaCaracteres = new char[20];
        Random random = new Random();
        String vocales = "aeiou";

        for (int i = 0; i < t.length; i++) {
            int caracterAleatorio = random.nextInt(vocales.length());
            tablaCaracteres[i] = vocales.charAt(in);
        }
    
        int[] caracteres = new int[5];
        for (char c : t) {
            switch (c) {
                case 'a':
                	can[0]++;
                    break;
                case 'e':
                	can[1]++;
                    break;
                case 'i':
                	can[2]++;
                    break;
                case 'o':
                	can[3]++;
                    break;
                case 'u':
                	can[4]++;
                    break;
            }
        }
        System.out.println("Frecuencia de vocales:");
		System.out.println("a: " + can[0]);
		System.out.println("e: " + can[1]);
        System.out.println("i: " + can[2]);
        System.out.println("o: " + can[3]);
        System.out.println("u: " + can[4]);
	}
}
