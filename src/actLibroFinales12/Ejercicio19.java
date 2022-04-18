package actLibroFinales12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String texto = sc.nextLine();

		Collection<String> lista = new ArrayList<String>();
		Collection<String> repe = new ArrayList<String>();
		Collection<String> noRepe = new ArrayList<String>();

		String[] arrayAux = texto.split(" ");

		lista = Arrays.asList(arrayAux);

		Iterator<String> ItLista = lista.iterator();

		System.out.println(lista.toString());

		for (int i = 0; i < lista.size(); i++) {

			int cont = 0;

			if (ItLista.hasNext()) {

				String palabra = ItLista.next();

				for (int j = 0; j < lista.size(); j++) {

					if (arrayAux[j].equals(palabra)) {
						cont++;
					}

				}
				
				if (cont > 1) {
					repe.add(palabra);
				} else {
					noRepe.add(palabra);
					}
				}
		}

		System.out.println("Repetidas:");
		System.out.println(repe.toString());
		
		System.out.println("No repetidas:");
		System.out.println(noRepe.toString());

		sc.close();
		
	}

}
