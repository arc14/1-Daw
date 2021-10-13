package ejerciciosLibro1;

import java.util.Scanner;

public class T1e2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un número");
		
		int num = sc.nextInt();
		
		System.out.println("Tú número es: " + num);
		
		sc.close();
	}
}
