package actLibroFinales3;

import java.util.Scanner;

public class T3e19f {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		//Ejercicio planteado sin acabar
		
		System.out.println("Dame un (1) numero");
		int a = sc.nextInt();
		
		int comprobador = 0;
		
		
		while (comprobador >= a) {
			
			for (int i = 0; i < 12; i++) {
				
				comprobador = (int) Math.pow(i - 1, 2);	
					
					if (comprobador >= a) {
						
						
						System.out.println("la raiz cuadrada es " + (i) + " con resto " + (a - comprobador));
						
					}
			}
				
		}
		sc.close();
	}
}
