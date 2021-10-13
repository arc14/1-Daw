package ejercicios1;

import java.util.Scanner;

public class HolaMundo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu nombre, wapito");
		
		String nombre = teclado.next();
		
		System.out.println("Hola Mundo, " + nombre);
	}
}
