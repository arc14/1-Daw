package t7E12f;

public class Ecuaciones2Grado {

	private int a, b, c;
	private int check;
	double res1, res2;

	public Ecuaciones2Grado(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

public void checkDiscriminante() {
		
		double comp = Math.pow(b, 2) - (4*a*c);
		
		if (0 <= comp) {
			System.out.println("El discriminante es positivo");
			check = 1;
		} else if(0 == comp){
			System.out.println("El discriminante es 0");
			check = 2;
		} else {
			System.out.println("El discriminante es negativo");
			check = 3;
		}
}

	public void resolverEcuacion() {

		if (check == 1) {
			
			res1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			res2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

			System.out.println(res1 + "," + res2);
			
		} else if(check == 2) {
			
			System.out.println(((-b) - (4 * a * c)) / (2 * a));

		} else {
			System.out.println("No hay solucion");
		}
	}

}
