package ejerciciosLibro1;

import java.util.Scanner;

public class T1e9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un número");
		
		int num = sc.nextInt();
		
		boolean a = num % 2 == 0;
		
		System.out.println("¿tu número es par? -> " + a);
		
		sc.close();
	}
}
