package actLibroFinales3;

import java.util.Scanner;

public class T3e12f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un numero en binario y te lo paso a decimal");

		String bin = sc.next();

		int numFinal = 0;

		int cont = 1;

		System.out.println(bin);

		for (int i = 0; i <= bin.length() - 1; i++) {

			int numero = (int) bin.charAt(i) - 48;

			int multiplo = (int) Math.pow(2, bin.length() - cont++);

			System.out.println(numero + " x " + multiplo);

			numFinal += (numero * multiplo);

		}

		System.out.println(numFinal);

		sc.close();
	}

}
