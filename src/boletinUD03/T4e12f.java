package boletinUD03;

import java.util.Scanner;

public class T4e12f {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular distacia euclidea");
		System.out.println("Dame el 1º numero");
		double x1 = sc.nextDouble();
		System.out.println("Dame el 2º numero");
		double y1 = sc.nextDouble();
		System.out.println("Dame el 3º numero");
		double x2 = sc.nextDouble();
		System.out.println("Dame el 4º numero");
		double y2 = sc.nextDouble();
		
		distancia(x1, y1, x2, y2);
		
		sc.close();

	}

	static double distancia(double x1, double y1, double x2, double y2) {
		
		double res = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		return res;
		
	}
}
