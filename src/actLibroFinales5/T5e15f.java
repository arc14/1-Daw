package actLibroFinales5;

import java.util.Scanner;

public class T5e15f {

	public static void main(String[] args) {

		int[][] notas = new int[][] { { 5, 6, 1 }, { 1, 2, 3 }, { 10, 2, 1 }, { 4, 4, 4 }, { 6, 6, 3 } };

		int media;

		for (int i = 0; i < notas[0].length; i++) {

			media = 0;

			for (int j = 0; j < notas.length; j++) {

				media += notas[j][i];

			}

			media = media / 3;

			System.out.println("La media del trimestre " + i + " es: " + media);

		}

		System.out.println("Media de un alumno (1/2/3/4/5)");
		@SuppressWarnings("resource")
		int a = new Scanner(System.in).nextInt();
		int mediaAl = 0;
		
			for (int j = 0; j < notas[a].length; j++) {

				mediaAl += notas[a-1][j];

			}

			mediaAl = mediaAl / 3;

			System.out.println("La media del alumno " + a + " es: " + mediaAl);

		}

	}
