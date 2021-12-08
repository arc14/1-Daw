package actLibroFinales2;

import java.util.Scanner;

public class T2e13f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantos animales hay?");
		int numAnimales = sc.nextInt();
		
		System.out.println("¿Cuanta comida se ha comprado? (en Kg)");
		float comidaDiaria = sc.nextFloat();
		
		System.out.println("¿Cuantos kilos come cada animal? (en Kg)");
		float kilosPorAnimal = sc.nextFloat();
		
		if (numAnimales <= 0 || kilosPorAnimal <= 0) {
		
			System.out.println("Error: Tiene que haber algun animal y tiene que comer una cantidad minima");
			
		} else {
			
			if ((comidaDiaria / numAnimales) >= kilosPorAnimal ) {
				
				System.out.println("Hay alimento suficiente");
			
			} else {
				
				System.out.println("No hay alimento suficiente, a cada animal le corresponde: " + comidaDiaria / numAnimales + " kg");
				
			}
		
		}

		sc.close();
	}
}
