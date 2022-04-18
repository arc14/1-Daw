package actLibroFinales6;

import java.util.Scanner;

public class T6e12f {

	public static void main(String[] args) {

		// Juego del ahorcado

		// sin terminar, casi debería hacerlo de 0
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Player 1, Dame una palabra");

		String palabra = sc.nextLine();
		String vacio = "";
		int fallos = 0;

		System.out.flush();

		System.out.println("Player 2");
		System.out.println("Tienes 7 intentos");
		
		

		for (int i = 0; i < palabra.length(); i++) {
			vacio += "_";
		}
		// quitar espacio al final
		// vacio = vacio.substring(0, vacio.length()-1);

		System.out.println(vacio);
		
		char[] b = vacio.toCharArray();

		do {
			do {
				comprobarLetra(sc, palabra, b, fallos);
			} while (fallos < 7);

		} while (palabra != vacio);

		if (fallos < 7) {
			System.out.println("Ganaste, la palabra era: " + palabra);
			
		} else {
			System.out.println("No te quedan más intentos");
			System.out.println("La palabra era: " + palabra);
		}
		
		
		
		

		sc.close();
	}

	private static void comprobarLetra(Scanner sc, String cadena, char[] vacio, int fallos) {

		System.out.println("Dame una letra");
		
		boolean comprobador = false;

		char letra = sc.nextLine().charAt(0);

		System.out.println("Letra introducida: " + letra);

		for (int i = 0; i < vacio.length; i++) {
			if (cadena.charAt(i) == letra) {
				vacio[i] = letra;
				comprobador = true;
				
			} else {
				comprobador = false;
			}
		}
		
		if (comprobador) {
			System.out.println("Si se encuentra la letra: " + letra);
			System.out.println(vacio);
		} else {
			System.out.println("No se encuentra en la palabra");
			fallos = fallos + 1;
			System.out.println("Te quedan " + (7 - fallos) + " intentos");
		}
	}
}
