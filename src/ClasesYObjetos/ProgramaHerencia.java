package ClasesYObjetos;

public class ProgramaHerencia {

	public static void main(String[] args) throws Exception {
		
		//----
		
		Persona p = new Persona("Pepe", 25, 174);
		
		System.out.println(p.mostrarDatos());
		
		
		//----
		
		Empleado e = new Empleado();
		
		e.setNombre("Ale");
		e.setEdad(25);
		e.setEstatura(172);
		
		System.out.println(e.mostrarDatos());

	}

}
