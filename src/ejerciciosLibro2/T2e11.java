package ejerciciosLibro2;

import java.util.Scanner;

public class T2e11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un número del 1 al 7 y te digo el día de la semana correspondiente");
		int num= sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Tienes que ser un número entre 1 y 7");
			break;
		}
		sc.close();
	}
}