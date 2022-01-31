package t8E24f;

import t8E23f.Poligono;

public class Rectangulo extends Poligono{

	public Rectangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return base * altura;
	}

}
