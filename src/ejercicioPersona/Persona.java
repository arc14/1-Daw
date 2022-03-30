package ejercicioPersona;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Persona {

	String nombre;
	int edad;
	LocalDate fechaNac;
	
	
	public Persona(String nombre, int edad, LocalDate fechaNac) {
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNac = fechaNac;
	}
	
	
	public int compareTo(Persona otra) {
		
		int dias = (int) ChronoUnit.DAYS.between(this.fechaNac, otra.fechaNac);
		
		return dias;
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", fechaNac=" + fechaNac + "]";
	}	
	
}
