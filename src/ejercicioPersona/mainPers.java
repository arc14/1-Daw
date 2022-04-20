package ejercicioPersona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class mainPers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantas persona quieres crear?");
		int numPers = sc.nextInt();
		sc.nextLine();
		
		Persona [] Personas = new Persona[numPers];
		
		int aux = 1;
		
		for(int i = 0; i < Personas.length; i++) {
			Personas[i] = creaPersona(sc, aux);
			aux ++;
		}
		
		for (Persona persona : Personas) {
			System.out.println(persona);
		}
		
		ordenaPersona(Personas);
		
		for (Persona persona : Personas) {
			System.out.println(persona);
		}
	}
	
	private static Persona creaPersona(Scanner sc, int indice) {
		
		System.out.println("Introduce el nombre de la " + indice + "º persona");
		String nombre = sc.next();
		sc.nextLine();
		
		System.out.println("Introduce la edad de la " + indice + "º persona");
		int edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce la fecha de nacimiento de la " + indice + "º persona(yyyy-MM-dd)");
		String fechaIntroducida = sc.next();
		sc.nextLine();
		
		LocalDate fecha = LocalDate.parse(fechaIntroducida,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		return new Persona(nombre, edad, fecha);
	}

	public static void ordenaPersona(Persona [] a) {
		
		Persona aux;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i].compareTo(a[j])<0) {
										
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
	}
}