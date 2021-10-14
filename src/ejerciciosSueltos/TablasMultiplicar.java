package ejerciciosSueltos;

import java.util.Scanner;

public class TablasMultiplicar {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		// instruccion que crea una variable escaner
		Scanner teclado = new Scanner(System.in);
		//Pregunta por pantalla un número
		System.out.println("Dime el número del que quieras su tabla de multiplicar");
		//guarda en la variable int creada el valor int introducido en el escaner
		int numTabla = teclado.nextInt();
		
		//Usando while
		//inicializamos una variable con el numero desde el que queremos que empiece a multiplicar
		int cont = 0;
		//Creamos un bucle while con la condicion de que si la variable cont llega a 10 pare de ejecutarse.
		while (cont < 11) {
			//muestra en pantalla la variable numTabla seguido del caracter "X" seguido de la variable cont
			//seguido del caracter "=" seguido de la multiplicacion usando las variable numTabla y cont
			//)numTabla x cont = resultado
			System.out.println(numTabla + " x " + cont + " = " + (numTabla * cont));
			//suma 1 al valor de la variable cont
			cont++;
			//vuelve al while y revisa la condicion
		}
		
		//Usando un for
		/*
		for (int i = 0; i < 11; i++) {
			
			System.out.println(numTabla + " x " + i + " = " + (numTabla * i));
		}
		*/	
	}
}
