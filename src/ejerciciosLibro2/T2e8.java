package ejerciciosLibro2;

import java.util.Scanner;

public class T2e8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora de ecuaciones de 2º grado");
		System.out.println("Dame el valor de a");
		double a = sc.nextDouble();
		
		System.out.println("Dame el valor de b");
		double b = sc.nextDouble();
		
		System.out.println("Dame el valor de c");
		double c = sc.nextDouble();

		double res1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		double res2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		
		System.out.println("Los resultados de la ecuacion son: " + res1 + " y " + res2);
		
		sc.close();
	} 
}
