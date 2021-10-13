package ejerciciosLibro2;

import java.util.Scanner;

public class T2e10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la nota de tu examen (sin decimales)");
		
		int nota = sc.nextInt();
		
		if (nota > 0 && nota < 5) {
			System.out.println("Tu nota es de insuficiente");
		} else if (nota == 5) {
			System.out.println("Tu nota es de suficiente");
		} else if (nota == 6) {
			System.out.println("Tu nota es de bien");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Tu nota es de notable");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Tu nota es de sobresaliente");
		} else {
			System.out.println("No has metido una nota entre 0 y 10");
		}
		
		sc.close();
	}
}
