package ClasesYObjetos;

public class Empleado extends Persona {

	private Double salario;

	public Empleado() {
		super();
		salario = 964d;
	}
	
	@Override
	public String mostrarDatos() {
		return "Persona [nombre= " + super.getNombre() + ", edad= " + super.getEdad() + ", estatura= " + super.getEstatura() + ", salario= " + salario + "]";
		
	}

}
