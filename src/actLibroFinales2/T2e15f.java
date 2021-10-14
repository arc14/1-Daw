package actLibroFinales2;

import java.util.Scanner;

public class T2e15f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la base para hacer el area de un triangulo");
		double b = sc.nextDouble();
		
		System.out.println("Dame la altura");
		double h = sc.nextDouble();
		
		if (b < 0 || h < 0) {
			System.out.println("Los datos no pueden ser negativos :c");
		} else {
			System.out.println("El área del triangulo es: " + (b * h) / 2);
		}
		
		
		
		
		sc.close();
	}
}
