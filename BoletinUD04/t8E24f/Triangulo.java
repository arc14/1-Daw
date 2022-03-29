package t8E24f;

import t8E23f.Poligono;

public class Triangulo extends Poligono{

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return base * altura / 2;
	}

}
