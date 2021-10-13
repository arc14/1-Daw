package ejerciciosLibro2;

import java.util.Scanner;

public class T2e7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame tres números y te los ordeno");
		System.out.println("Dame un número");
		int a = sc.nextInt();
		
		System.out.println("Dame otro número");
		int b = sc.nextInt();
		
		System.out.println("Dame un último número");
		int c = sc.nextInt();
		
		if (a > b && b > c) {
			System.out.println( a + ", " + b + " y " + c + ", ordenados de mayor a menor");
		} else if (b > a && a > c) {
			System.out.println( b + ", " + a + " y " + c + ", ordenados de mayor a menor");
		} else if (c > a && a > b) {
			System.out.println( c + ", " + a + " y " + b + ", ordenados de mayor a menor");
		} else if (a > c && c > b) {
			System.out.println( a + ", " + c + " y " + b + ", ordenados de mayor a menor");
		} else if (b > b && b > a) {
			System.out.println( b + ", " + c + " y " + a + ", ordenados de mayor a menor");
		} else if (c > b && b > a) {
			System.out.println( c + ", " + b + " y " + a + ", ordenados de mayor a menor");
		}
		sc.close();
	}
}
