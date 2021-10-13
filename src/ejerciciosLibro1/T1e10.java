package ejerciciosLibro1;

import java.util.Scanner;

public class T1e10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Está lloviendo? (true/false)");
		
		boolean lluvia = sc.nextBoolean();
		
		System.out.println("Has acabado las tareas? (true/false)");
		
		boolean tarea = sc.nextBoolean();
		
		boolean salir1 = !lluvia && tarea;
		
		System.out.println("Tiene que ir a la biblioteca? (true/false)");
		
		boolean biblio = sc.nextBoolean();
		
		boolean salir2 = salir1 || biblio;
		
		System.out.println("Puedes salir? -> " + salir2);
		
		sc.close();
	}
}
