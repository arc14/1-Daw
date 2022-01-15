package EjRecursividad;

import java.util.Scanner;

public class recurArrayMCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[2];
		
		System.out.println("Dame primer numero");
		a[0] = sc.nextInt();
		System.out.println("Dame segundo numero");
		a[1] = sc.nextInt();

		System.out.println("El MCD de tus número es: " + mcd(a));

		sc.close();
	}

	/**
	 * En este metodo recursivo, va a ir calculando el modulo de ambos numeros, si
	 * es el caso de que fuese cero es que el número menor sería el MCD, en caso
	 * contrario vuelve a revisar que el resto de la division anterior
	 * 
	 * @param a Numero 1
	 * @param b Numero 2
	 * @return Devuelve el resultado de buscar el divisor mas grande de modulo 0 que
	 *         comparten ambos numeros.
	 */

	public static int mcd(int[] arr) {
		
		int a = arr[0];
		int b = arr[1];
		
		if (arr[1] == 0)
			return arr[0];
		else {
			int[] res = {b, a % b};
			return mcd(res);
		}
	}
}
