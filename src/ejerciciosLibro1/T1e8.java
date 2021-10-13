package ejerciciosLibro1;

import java.util.Scanner;

public class T1e8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		
		int edad = sc.nextInt();
		
		boolean comprobar = edad >= 18;
		
		System.out.println("¿Eres mayor de edad? -> " + comprobar);
		
		sc.close();
	}
}
