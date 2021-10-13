package ejerciciosLibro1;

import java.util.Scanner;

public class T1e11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double pManzanas = 2.35;
		final double pPeras = 1.95;
		
		System.out.println("Cuantos kilos de manzanas vendiste el primer semestre?");
		
		int kManzanas = sc.nextInt();
		
		System.out.println("Y el segundo semestre?");
		
		double finalManzanas = pManzanas * (kManzanas+= sc.nextInt());
		
		System.out.println("Cuantos kilos de peras vendiste el primer semestre?");
		
		int kPeras = sc.nextInt();
		
		System.out.println("Y el segundo semestre?");
		
		double finalPeras = pPeras * (kPeras += sc.nextInt());
		
		double res = finalManzanas + finalPeras;
		
		System.out.println("En el año ha ganado en ventas " + res);
	
		sc.close();
	
	
	}
}
