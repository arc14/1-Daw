package ejerciciosLibro2;

import java.util.Scanner;

public class T2e14 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame una fecha y te doy el día siguiente");
		System.out.println("Dame el día (entre 1 y 31): ");
		int dia= sc.nextInt();
		System.out.println("Dame el mes (enrtre 1 y 12): ");
		int mes= sc.nextInt();
		System.out.println("Dame el año (no puede ser negativo): ");
		int ano= sc.nextInt();
		
		
		if ((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && ano >= 0 ) {
			switch (mes) {
				case 1: case 3: case 5: case 7: case 8: case 10:
					if (dia == 31) {
						dia = 1;
						mes++;
						System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + ano);
					} else {
						dia++;
						System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + ano);
					}
				case 4: case 6: case 9: case 11:
					if (dia == 30) {
						dia = 1;
						mes++;
						System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + ano);
					} else if (dia == 31) {
						System.out.println("Estos meses no tienen dia 31");
					} else {
						dia++;
						System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + ano);
					}
				 case 2: 
					 if (dia == 28) {
							dia = 1;
							mes++;
							System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + ano);
						} else if (dia > 28) {
							System.out.println("Estos mese llega solo hasta el día 28");
						} else {
							dia++;
							System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + ano);
						}
				 case 12:
					 if (dia == 31) {
							dia = 1;
							mes = 1;
							ano++;
							System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + ano);
						} else {
							dia++;
							System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + ano);
						}
			}		
		} else {
			System.out.println("El día, mes o año no es correcto (el día día tiene que estar entre 1 y 31, el mes entre 1 y 12, y el año 0 o superior, por favor)");
		}
		sc.close();
	}
}
