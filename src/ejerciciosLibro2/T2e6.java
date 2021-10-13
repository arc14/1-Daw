package ejerciciosLibro2;

import java.util.Scanner;

public class T2e6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un número");
		
		int a = sc.nextInt();
		
		System.out.println("Dame otro número");
		
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.println("El número " + a + " es mayor que " + b);
		} else if (a<b) {
			System.out.println("El número " + b + " es mayor que " + a);
		} else {
			System.out.println("El número " + a + " y " + b + " son guales");
		}
		sc.close();
	}
}
