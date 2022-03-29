package t7E16f;

public class Punto {

	private double x, y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void desplazaX(double dx) {
		x = x + dx;
	}
	
	public void desplazaY(double dy) {
		y = y + dy;
	}
	
	public void desplaza(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public double distanciaEuclidea(Punto otro) {
		double res = Math.sqrt(Math.pow(otro.x - x, 2) + Math.pow(otro.y - y, 2));
		return res;
	}

	public void muestra() {
		System.out.println("Punto [x=" + x + ", y=" + y + "]");
	}
	
	
}
