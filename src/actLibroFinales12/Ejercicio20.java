package actLibroFinales12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args){
		
		ArrayList<Integer> cola1 = supercola.cola1();
		ArrayList<Integer> cola2 = supercola.cola2();
		
		int menu = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Menú");
			System.out.println("1. Encolar en cola 1");
			System.out.println("2. Encolar en cola 2");
			System.out.println("3. Desncolar en cola 1");
			System.out.println("4. Desncolar en cola 2");
			System.out.println("5. Exit");
			
			
			menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.println("Ecolar 1 seleccionado");
				supercola.encolar(sc.nextInt(), cola1);
				
			} else if (menu == 2) {
				System.out.println("Ecolar 2 seleccionado");
				supercola.encolar(sc.nextInt(), cola2);
				
			} else if (menu == 3) {
				supercola.desencolar(cola1, 1);
				
			} else if (menu == 4) {
				supercola.desencolar(cola2, 2);
			}
			
			System.out.println("Cola 1:");
			System.out.println(cola1.toString());
			System.out.println("Cola 2:");
			System.out.println(cola2.toString());
			
			
		} while (menu != 5);
		
		
		System.out.println("Programa acabado");
		
		sc.close();
	}

}
