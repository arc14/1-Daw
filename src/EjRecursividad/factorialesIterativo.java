package EjRecursividad;

import java.util.Scanner;

/**
 * @author Alejandro Romero
 */

/**
 * 
 * Programa que devuelve el factorial de un numero dado
 * Realizado de iterativa
 *
 */

public class factorialesIterativo {

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
		
		System.out.println(funIter(n));
		
		sc.close();
	}
	
	/**
	 * funcion que calcula de forma iterativa un numero factorial
	 * @param num numero a factorizar
	 * 
	 * @return devuelve el resultado del numero factorizado
	 */
	
	static long funIter(long num) {
		
		long res = 1;
		
		for (long i = num; i > 0; i--) {
			res = res * i;
		}
		
		return res;
	}

}
