package ejerciciosSueltos;

import java.util.Scanner;

public class CalculadoraSumaResta {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primero número");
		int num1 = teclado.nextInt();
		//----
		
		System.out.println("Introduce el segundo número");
		int num2 = teclado.nextInt();
		//----
		
		System.out.println("Quieres sumar o restar. s/R");
		char operacion = teclado.next().charAt(0);
		
		if (operacion == 's' || operacion == 'S') {
			int resultado1 = num1 + num2;
			System.out.println("El resultado es: " + resultado1);
		} else if(operacion == 'r' || operacion == 'R'){
			int resultado2 = num1 - num2;
			System.out.println("El resultado es: " + resultado2);
		}
	}
}
