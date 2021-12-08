package actLibroFinales3;

import java.util.Scanner;

public class T3e17f {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame primer numero");
		int a = sc.nextInt();
		System.out.println("Dame segundo numero");
		int b = sc.nextInt();

		int cont = 0;

		
		for (int i = a; i > 0; i--) {

			if (a % i == 0 && cont < 1) {

				for (int j = b; j > 0; j--) {

					if (b % j == 0 && i == j) {

						cont++;
						System.out.println(
								"El numero " + a + " y el numero " + b + " tienen en comun el MaxComDiv el: " + i);

					} 
				}

			} 

		}
		
		if (cont == 0){
			System.out.println("No tiene divisores comunes");
		}
		
		sc.close();
	}
}
