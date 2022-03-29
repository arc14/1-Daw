package t8E13f;

import t8E12f.Caja;
import t8E12f.Unidad;

public class CajaCarton extends Caja {
	
	public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
		super(ancho, alto, fondo, unidad);
	}

	@Override
	public double getVolumen() {
		
		double res =  (80 * (ancho * alto * fondo)) / 100;
		
		if (unidad.equals("m")) {
			res = res * 100;
			return res;
		} else {
			return res;
		}
	}

}
