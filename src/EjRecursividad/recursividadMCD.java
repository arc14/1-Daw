package EjRecursividad;

import java.util.Scanner;

public class recursividadMCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Dame primer numero");
		int a = sc.nextInt();
		System.out.println("Dame segundo numero");
		int b = sc.nextInt();
		
		MCD(sc, a, b);
		
		sc.close();
	}
	
	
	public static int MCD(Scanner sc, int a, int b) {
		
		for (int i = a; i > 0; i--) {
			if (a % i == 0) {
				int maybeRes1 = i;
			}
		}
		
		MCD(sc, a, b);
		
		
		return 0;
		
	}

	
	
}
