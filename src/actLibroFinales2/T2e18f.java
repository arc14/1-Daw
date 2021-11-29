package actLibroFinales2;

import java.util.Scanner;

public class T2e18f {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//usando: Math.random() * (max - min) + min;
		
		int num1 = (int) (Math.random() * (100 - 1) + 1);
		int num2 = (int) (Math.random() * (100 - 1) + 1);
		
		System.out.println("Los números dados son: " + num1 + " y " + num2);
		
		//Lo hago con arrays, es la unica forma que se me ocurre
		
		//Vale, lo podia haber hecho con 3 strings y un math.random() que diera 1, 2 o 3
		
		String[] ope = {"sumar", "restar", "multiplicar"};
		int posOpe = (int) (Math.random() * ope.length);
				
		System.out.println("Tienes que " + ope[posOpe] + "los");
		
		System.out.println("Introduce el resultado: ");
		int resUsu = sc.nextInt();
		
		
		switch (ope[posOpe]) {
		case "sumar":
			int resSuma = num1 + num2;
			if (resUsu == resSuma) {
				System.out.println("Tu respuesta es correcta");
			} else
				System.out.println("Tu respuesta no es correcta.");
			break;

		case "restar":
			int resResta = num1 - num2;
			if (resUsu == resResta) {
				System.out.println("Tu respuesta es correcta");
			} else
				System.out.println("Tu respuesta no es correcta.");
			break;
			
		case "multiplicar":
			int resMult = num1 * num2;
			if (resUsu == resMult) {
				System.out.println("Tu respuesta es correcta");
			} else
				System.out.println("Tu respuesta no es correcta.");
			break;
		}
		sc.close();
	}
}
