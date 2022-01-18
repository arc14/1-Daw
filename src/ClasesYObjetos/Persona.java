package ClasesYObjetos;

public class Persona {

	private String nombre;
	
	private int edad;
	
	private double estatura;
	
	//Contructuros a la hora de llamar a la clase
	
	public Persona(String nombre, int edad, double estatura) throws Exception{
		setNombre(nombre);
		setEdad(edad);
		setEstatura(estatura);
	}

	public Persona() {
		nombre = "Sin nombre";
		edad = 0;
		estatura = 0;
	}

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
	
	public double getEstatura() {
		return estatura;
	}
	
	//@Override
	//ponemos override para sobreescribir un metodo que ya exista
	//por ejemplo si en vez de mostrarDatos se llamara toString (que ya existe).
	public String mostrarDatos() {
		return "Persona [nombre= " + nombre + ", edad= " + edad + ", estatura= " + estatura + "]";
	}
	
}
