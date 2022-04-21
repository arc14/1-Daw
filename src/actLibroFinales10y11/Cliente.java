package actLibroFinales10y11;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Serializable{

	private int id;
	private String nombre;
	private long telefono;

	public Cliente() {

	}
	
	
	public Cliente(int id, String nombre, long telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "ID = " + id + ", Nombre = " + nombre + ", Tlfn = " + telefono;
	}

}
