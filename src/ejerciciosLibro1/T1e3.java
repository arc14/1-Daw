package ejerciciosLibro1;

import java.util.Scanner;

public class T1e3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		
		int edad = sc.nextInt();
		
		int a = edad + 1;
		
		System.out.println("Tu edad el año que viene tendrás " + a + " años");
		
		sc.close();
	}
}
