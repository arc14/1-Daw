package EjRecursividad;

import java.util.Scanner;

/**
 * @author Alejandro Romero
 */

/**
 * 
 * Programa que devuelve el factorial de un numero dado
 * Realizado de forma recursiva
 */

public class factorialesRecursivo {

	public static void main(String[] args) {
		/**
		 * Se pide por teclado un numero usando Scanner
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		/**
		 * @param n valor del que sacar el factorial
		 * Se usa long en vez de int para poder manejar numero mayores
		 * 
		 */
		long n = sc.nextLong();
		/**
		 * Se llama a la funcion y se muestra el retorno por pantalla
		 */
		System.out.println(funRecu(n));
		
		sc.close();
	}
	
	/**
	 * funcion que calcula de forma recursiva un numero factorial
	 * @param num numero a factorizar
	 * 
	 * @return devuelve el resultado del numero factorizado
	 */

	static public long funRecu(long num) {
		if (num > 0);
		num = num * funRecu(num - 1);

		return num;
	}

}
