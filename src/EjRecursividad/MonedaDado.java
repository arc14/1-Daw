package EjRecursividad;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author AsEh
 *
 * programa que pregunta que objeto, dado o moneda quieres lanzar, 
 * cuantas veces y pregunta en cada caso que resultado va a repetirse más veces 
 * y te da cuantas veces se ha repetido ese elemento.
 *
 */

public class MonedaDado {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p1 = preguntaObjeto(sc);
		
		if (p1 == 1) {
			moneda(numLanzamientos(sc), preguntaAcierto(p1, sc));
			
		} else if (p1 == 2) {
			dado(numLanzamientos(sc), preguntaAcierto(p1, sc));
		}
	}

	/**
	 * 
	 * @param scanner
	 * @return devuelve string del objeto a lanzarse
	 */
	
	public static int preguntaObjeto(Scanner a) {

		System.out.println("¿Que vas lanzar?");
		System.out.println("'dado' o 'moneda'");

		String preg1 = a.next();

		if (preg1.equalsIgnoreCase("moneda")) {
			return 1;
		} else if (preg1.equalsIgnoreCase("dado")) {
			return 2;
		} else {
			System.out.println("Entrada incorrecta");
			return 0;
		}
	}

	/**
	 * 
	 * @param sc scanner
	 * @return numero de lanzamientos del objeto
	 */
	public static int numLanzamientos(Scanner sc) {

		System.out.println("¿Cuantas veces va a lanzarse?");

		int numLanz = sc.nextInt();

		return numLanz;
	}

	/**
	 * funcion que pregunta que valor se repite más veces
	 * 
	 * @param a Valor devuelto por la funcion pregunta objeto
	 * @param b iniciacion del Escaner
	 * @return String devuelve el valor que más se va a repetir
	 */
	
	public static String preguntaAcierto(int a, Scanner b) {

		String preg2;

		if (a == 1) {
			System.out.println("¿Que valor saldra mas veces? (Escribe: '1' para cara / '2' para cruz)");
			preg2 = b.next();
			if (preg2.equalsIgnoreCase("1") || preg2.equalsIgnoreCase("2")) {
				return preg2;
			} else {
				// excepcion
				return "El valor introducido no es correcto para el dado";
			}
			
		} else if (a == 2) {
			System.out.println("¿Que valor saldra mas veces? ('1' / '2' / '3' / '4' / '5' / '6')");
			preg2 = b.next();
			if (preg2.equals("1") || preg2.equals("2") || preg2.equals("3") || preg2.equals("4") || preg2.equals("5")
					|| preg2.equals("6")) {
				return preg2;	
			} else {
				return "El valor introducido no es correcto para el dado";
			}
			
		} else {
			// excepcion
			return "No entiendo el valor de entrada";
		}
	}

	/**
	 * Indica cuantas veces se ha repetiod el valor que has indicado para la eleccion dado.
	 * 
	 * @param a numero de lanzamientos
	 * @param ac numero seleccionado como el que va a salir mas veces
	 */
	
	public static void moneda(int a, String ac) {
		
		int cont = 0;
		Random ran = new Random();
		for (int i = 0; i < a; i++) {
			int num = ran.nextInt(2) + 1;
			if (num == Integer.parseInt(ac)){
				cont++;
			}
		}

		System.out.println("Tu eleccion ha salido: " + cont + " veces");

	}

	/**
	 * Indica cuantas veces se ha repetiod el valor que has indicado para la eleccion dado.
	 * 
	 * @param a numero de lanzamientos
	 * @param ac numero seleccionado como el que va a salir mas veces
	 */
	
	public static void dado(int b, String ac) {
		
		int cont = 0;
		Random ran = new Random();
		for (int i = 0; i < b; i++) {
			Integer num = ran.nextInt(6) + 1;
			
			if (num == Integer.parseInt(ac)) {
				cont++;
			}
		}
		System.out.println("Tu numero ha salido: " + cont + " veces");
	}
}
