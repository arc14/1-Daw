package EjRecursividad;

import java.util.Random;
import java.util.Scanner;

public class MonedaDado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int p1 = preguntaObjeto(sc);
		String p2 = preguntaAcierto(p1, sc);
		int lanz = numLanzamientos(sc);
		
		
		
		
		
		if (p1 == 1) {
			
			//moneda(lanz, sc, contador);
			
		} else {
			
		}
		

	}

	public static int preguntaObjeto(Scanner a) {

		System.out.println("¿Que vas lanzar?");
		System.out.println("'dado' o 'moneda'");

		String preg1 = a.next();

		int resp1;

		if (preg1.equalsIgnoreCase("moneda")) {
			return resp1 = 1;
		} else if (preg1.equalsIgnoreCase("dado")) {
			return resp1 = 2;
		} else {
			return resp1 = 0;
		}
	}

	public static int numLanzamientos(Scanner a) {

		System.out.println("¿Cuantas veces va a lazanse?");

		int numLanz = a.nextInt();

		return numLanz;
	}

	public static String preguntaAcierto(int a, Scanner b) {

		String preg2;

		if (a == 1) {
			System.out.println("¿Que valor saldrá más veces? ('cara' / 'cruz')");
			preg2 = b.next();
			if (preg2.equalsIgnoreCase("cara") || preg2.equalsIgnoreCase("cruz")) {
				return preg2;

			} else {
				// excepcion
				return "El valor introducido no es correcto para el dado";
			}
		} else if (a == 2) {
			System.out.println("¿Que valor saldrá más veces? ('1' / '2' / '3' / '4' / '5' / '6')");
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

	public static void moneda(int a, String ac, int cont) {

		Random ran = new Random();
		for (int i = 0; i < a; i++) {
			int num = ran.nextInt(2) + 1;
			if (num == Integer.parseInt(ac))
				;
			cont++;

		}

		System.out.println("Has acertado: " + cont + " veces");

	}

	public static void dado(int b, String ac, int cont) {

		Random ran = new Random();
		for (int i = 0; i < b; i++) {
			int num = ran.nextInt(6) + 1;

			if (num == Integer.parseInt(ac))
				;
			cont++;
		}
		System.out.println("Has acertado: " + cont + " veces");
	}
	
	
	
}
