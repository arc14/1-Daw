package boletinUD03;

import java.util.Scanner;

public class T4e11f {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el radio");
		long radio = sc.nextLong();
		
		superficie(radio);
		volumen(radio);
		
		sc.close();

	}

	public static void superficie(long radio) {
		
		long res = (long) (4 * Math.PI * Math.pow(radio, 2));
		
		System.out.println("Superficie: " + res);
		
	}
	
	public static void volumen (long radio) {
		long res = (long) (4 * Math.PI / 3 * Math.pow(radio, 3)); 
		
		System.out.println("Volumen: " + res);
	}
	
}
