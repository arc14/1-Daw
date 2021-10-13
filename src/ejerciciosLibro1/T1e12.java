package ejerciciosLibro1;

import java.util.Scanner;

public class T1e12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero entero y te doy su valor absoluto");
		
		int a = sc.nextInt();
	
		int res = a >= 0 ? a : -a;
		
		System.out.println("Tú número abasoluto es: " + res);
		
		sc.close();
	}
}
