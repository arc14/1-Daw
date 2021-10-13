package ejerciciosLibro1;

import java.util.Scanner;

public class T1e7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el radio:");
		
		double radio = sc.nextDouble();
		
		double longitud = 2 * Math.PI * radio;
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("La longitud es " + longitud + " y el area es " + area);
		
		sc.close();
	}
}
