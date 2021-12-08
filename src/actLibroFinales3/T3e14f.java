package actLibroFinales3;

import java.util.Scanner;

public class T3e14f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un numero y te digo cuanto primos hay entre ese numero y el 1");

		int num = sc.nextInt();
		// el 1 y el dos siempre es primo
		int cont = 1;

		if (num == 2) {

			cont++;

		} else if (num > 2) {

			cont++;

			for (int i = 3; i <= num; i++) {

				if (!(i % 2 == 0)) {
					cont++;
				}

			}
		}
		System.out.println("Hay: " + cont + " numero primos");
		
		sc.close();
	}
}
