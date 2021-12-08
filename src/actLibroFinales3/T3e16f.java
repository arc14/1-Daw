package actLibroFinales3;

import java.util.Scanner;

public class T3e16f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int p = num; p > i; p--) {
				
				System.out.print(" ");
			}
			
			
			for (int j = 0; j < i; j++) {

				System.out.print("*");
				System.out.print(" ");
			}

			System.out.println("");
		}

		sc.close();
	}

}
