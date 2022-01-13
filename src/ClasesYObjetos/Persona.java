package ClasesYObjetos;

public class Persona {

	private String nombre;
	
	private int edad;
	
	private double estatura;
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad (int edad) throws Exception{
		if (edad <= 0) {
			throw new Exception("No puede ser menor o igual a 0");
		} else {
			this.edad = edad;
		}
		
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEstatura(double estatura) {
		if (estatura <= 0 ) {
			System.out.println("Estatura no permitida");
		} else {
			this.estatura = estatura;
		}
	}
	
	@Override
	public String toString() {
		return "Persona [nombre= " + nombre + ", edad= " + edad + ", estatura= " + estatura + "]";
	}
	
}
