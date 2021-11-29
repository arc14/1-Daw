package ejerciciosLibro1;

import java.util.Scanner;

public class T1e4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el año que naciste");
		
		int nacim = sc.nextInt();
		
		System.out.println("Dime en que año estamos");
		
		int ano = sc.nextInt();
		
		int a = ano - nacim;
		
		System.out.println("Tienes " + a + " años");
		
		sc.close();
	}
}
