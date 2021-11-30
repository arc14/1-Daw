package actLibroFinales2;

import java.util.Scanner;

public class T2e14f {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero entre 1 y 99, y te lo doy en letras");
		int num = sc.nextInt();
		int uni = num % 10;
		int dec = (int) num / 10;
		String uniL = null;
		String decL = null;
		
		switch (uni) {
		case 1:	
			uniL = "uno";
			break;
		case 2:
			uniL = "dos";
			break;
		case 3:
			uniL = "tres";
			break;
		case 4:
			uniL = "cuatro";
			break;
		case 5:
			uniL = "cinco";
			break;
		case 6:
			uniL = "seis";
			break;
		case 7:
			uniL = "siete";
			break;
		case 8:
			uniL = "ocho";
			break;
		case 9:
			uniL = "nueve";
			break;
			}
		
		switch (dec) {
		case 3:
			decL = "treinta";
			break;
		case 4:
			decL = "cuarenta";
			break;
		case 5:
			decL = "cincuenta";
			break;
		case 6:
			decL = "sesenta";
			break;
		case 7:
			decL = "setenta";
			break;
		case 8:
			decL = "ochenta";
			break;
		case 9:
			decL = "noventa";
			break;
		}
		
		if (num > 9 && num < 20) {
			switch (num) {
			case 10:
				System.out.println("Diez");
				break;
			case 11:
				System.out.println("Once");
				break;
			case 12:
				System.out.println("Doce");
				break;
			case 13:
				System.out.println("Trece");
				break;
			case 14:
				System.out.println("Catorce");
				break;
			case 15:
				System.out.println("Quince");
				break;
			case 16:
				System.out.println("Dieci" + uniL);
				break;
			case 17:
				System.out.println("Dieci" + uniL);
				break;
			case 18:
				System.out.println("Dieci" + uniL);
				break;
			case 19:
				System.out.println("Dieci" + uniL);
				break;
			}
		} else if (dec == 2 && uni == 0) {
			
			switch (dec) {
			case 2:
				System.out.println("veinte");
				break;
			case 3:
				System.out.println(decL);
				break;
			case 4:
				System.out.println(decL);
				break;
			case 5:
				System.out.println(decL);
				break;
			case 6:
				System.out.println(decL);
				break;
			case 7:
				System.out.println(decL);
				break;
			case 8:
				System.out.println(decL);
				break;
			case 9:
				System.out.println(decL);
				break;
				}
			
		} else if (dec == 2 && uni != 0) {
			
			decL = "veinti";
			switch (uni) {
			case 1:	
				System.out.println(decL + uniL);
				break;
			case 2:
				System.out.println(decL + uniL);
				break;
			case 3:
				System.out.println(decL + uniL);
				break;
			case 4:
				System.out.println(decL + uniL);
				break;
			case 5:
				System.out.println(decL + uniL);
				break;
			case 6:
				System.out.println(decL + uniL);
				break;
			case 7:
				System.out.println(decL + uniL);
				break;
			case 8:
				System.out.println(decL + uniL);
				break;
			case 9:
				System.out.println(decL + uniL);
				break;
				}
		} else {
			switch (dec) {
			case 3:
				System.out.println(decL + " y " + uniL);
				break;
			case 4:
				System.out.println(decL + " y " + uniL);
				break;
			case 5:
				System.out.println(decL + " y " + uniL);
				break;
			case 6:
				System.out.println(decL + " y " + uniL);
				break;
			case 7:
				System.out.println(decL + " y " + uniL);
				break;
			case 8:
				System.out.println(decL + " y " + uniL);
				break;
			case 9:
				System.out.println(decL + " y " + uniL);
				break;
				}
		}
		sc.close();
	}
}
