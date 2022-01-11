package ejerciciosSueltos;

import java.util.Scanner;

public class PracticaFunciones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		division(leeNumero(sc), leeNumero(sc));
		
	}
	
	public static float leeNumero(Scanner a) {
	
		System.out.println("Dime un numero");
		
		float num = a.nextFloat();
		
		return num;
	}

	public static float division(float a, float b) {
		
		return b/a;
	}
	
}
