package EjRecursividad;

import java.util.Scanner;


/**
 * @author Alejandro Romero
 */
public class recursividadMCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame primer numero");
		int a = sc.nextInt();
		System.out.println("Dame segundo numero");
		int b = sc.nextInt();

		System.out.println("El MCD de tus n�mero es: " + mcd(a, b));

		sc.close();
	}

	
	/**
	 * En este metodo recursivo, va a ir calculando el modulo de ambos numeros, si es el caso de que fuese cero es que el n�mero menor ser�a el MCD, en caso contrario
	 * vuelve a revisar que el resto de la division anterior
	 * 
	 * @param a Numero 1 
	 * @param b Numero 2
	 * @return Devuelve el resultado de buscar el divisor mas grande de modulo 0 que comparten ambos numeros.
	 */
	
	public static int mcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return mcd(b, a % b);
	}

}
