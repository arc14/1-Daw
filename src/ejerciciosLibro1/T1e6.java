package ejerciciosLibro1;

import java.util.Scanner;

public class T1e6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 1:");
		
		int nota1 = sc.nextInt();
		
		System.out.println("Nota 2:");
		
		int nota2 = sc.nextInt();

		double media;
	
		media = (nota1 + nota2) / 2.0;
	
		System.out.println("La media de tus notas es: " + media);
		
		sc.close();

	}
}