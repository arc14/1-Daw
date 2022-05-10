package ejercJUnit;

public class Calculadora {

	public static void main(String[] args) {
		System.out.println(div(7, 2));

	}
	
	protected static int suma(int a, int b) {
		return (a + b);
	}
	
	protected static int resta(int a, int b) {
		return (a - b);
	}

	protected static int multi(int a, int b) {
		return (a * b);
	}
	
	protected static int superMult(int a, int b, int c, int d) {
		return (a * b * c * d);
	}
	
	protected static double div(int a, int b) {
		double c = (double) a/b;
		
		return c;
	}
	
}
