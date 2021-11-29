package actLibroFinales2;

import java.util.Scanner;

public class T2e19f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el grado de un angulo y te lo paso a radianes:");
		double grados = sc.nextDouble();
		
		
		
		if (grados < 0) {
			grados = 360 - Math.abs(grados);
		} else if (grados > 360) {
			grados = grados - 360;
		}
		
		
		
		double rad = (grados * Math.PI) / 180;
		
		System.out.println(rad);
		
		sc.close();
		
	}

}
