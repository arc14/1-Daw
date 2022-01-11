package EjRecursividad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 
 * @author arc14
 *
 */

public class funcComparaFechas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime la 1ª fecha");
		String a = sc.nextLine();

		System.out.println("Dime la 2ª fecha");
		String b = sc.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

		LocalDateTime ADate = LocalDateTime.parse(a, formatter);
		LocalDateTime BDate = LocalDateTime.parse(b, formatter);

		comparaFecha(ADate, BDate);

		sc.close();
	}

	public static void comparaFecha(LocalDateTime a, LocalDateTime b) {

		if (a.isAfter(b)) {
			System.out.println("La fecha mayor es: " + a);
		} else {
			System.out.println("La fecha mayor es: " + b);
		}

	}

}
