package ejercJUnit;

/**
 * 
 * @author Alejandro Romero
 *
 */


public class Calculadora {

	public static void main(String[] args) {
		
		//Probando
		System.out.println(div(7, 0));

	}
	
	/**
	 * @param a variable entera 1
	 * @param b variable entera 2
	 * @return suma de ambos digitos
	 */
	
	protected static int suma(int a, int b) {
		return (a + b);
	}
	
	/**
	 * @param a variable entera 1
	 * @param b variable entera 2
	 * @return resta de ambos digitos
	 */
	
	protected static int resta(int a, int b) {
		return (a - b);
	}
	
	/**
	 * @param a variable entera 1
	 * @param b variable entera 2
	 * @return multiplicacion de ambos digitos
	 */

	protected static int multi(int a, int b) {
		return (a * b);
	}
	
	/**
	 * @param a variable entera 1
	 * @param b variable entera 2
	 * @param c variable entera 3
	 * @param d variable entera 4
	 * @return multiplicacion de los 4 digitos
	 */
	
	protected static int superMult(int a, int b, int c, int d) {
		return (a * b * c * d);
	}
	
	/**
	 * @param a variable entera 1
	 * @param b variable entera 2
	 * @return division de ambos digitos enteros que devuelve un double
	 */
	
	protected static double div(int a, int b) {
		double c = (double) a/b;
		
		return c;
	}
}
