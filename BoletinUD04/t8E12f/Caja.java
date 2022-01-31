package t8E12f;

public class Caja {

	private int ancho, alto, fondo;
	private String etiqueta;
	private String unidad;

	public Caja(int ancho, int alto, int fondo, Unidad unidad) {
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad.name();
	}

	public double getVolumen() {

		double res = ancho * alto * fondo;

		if (unidad == "cm") {
			res = res * 100;
			return res;
		} else {
			return res;
		}
	}

	public void setEtiqueta(String etiqueta) {

		if (etiqueta.length() < 31) {
			this.etiqueta = etiqueta;
		} else {
			throw new IllegalArgumentException("El maximo de caracteres en la etiqueta es de 30");
		}
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", etiqueta=" + etiqueta + ", unidad="
				+ unidad + "]";
	}
}
