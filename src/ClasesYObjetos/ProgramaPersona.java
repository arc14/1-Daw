package ClasesYObjetos;

import java.util.Scanner;

public class ProgramaPersona {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//persona 1
		Persona p1 = new Persona();
		
		System.out.println("Dime el nombre de la persona 1");
		p1.setNombre(sc.next());
		
		System.out.println("Dime la edad para la persona 1");
		try {
			p1.setEdad(sc.nextInt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Dime la estatura de la persona 1");
		p1.setEstatura(sc.nextDouble());
		
		//Persona 2
		
		Persona p2 = new Persona();
		
		System.out.println("Dime el nombre de la persona 2");
		p2.setNombre(sc.next());
		
		System.out.println("Dime la edad para la persona 2");
		try {
			p2.setEdad(sc.nextInt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Dime la estatura de la persona 2");
		p2.setEstatura(sc.nextDouble());
		
		
		if (p1.getEdad() > p2.getEdad()) {
			System.out.println(p1);
			System.out.println(p2);
		
		} else if(p1.getEdad() < p2.getEdad()){
			System.out.println(p2);
			System.out.println(p1);
			
		} else {
			System.out.println("No se pueden ordenar, tienen la misma edad");
		}
	
		sc.close();
		
	}

}
