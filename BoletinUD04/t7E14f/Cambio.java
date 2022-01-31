package t7E14f;

public class Cambio {

	private double aPagar, pago;

	public Cambio(double aPagar, double pago) {
		this.aPagar = aPagar;
		this.pago = pago;
	}

	public void cambioMinimo() {

		double res = pago - aPagar;

		if (res > 0) {

			if (res > 500) {
				System.out.println("Billetes de 500: " + (int) res / 500);
				res = res % 500;
			}

			if (res > 200) {
				System.out.println("Billetes de 200: " + (int) res / 200);
				res = res % 200;
			}

			if (res > 100) {
				System.out.println("Billetes de 100: " + (int) res / 100);
				res = res % 100;
			}

			if (res > 50) {
				System.out.println("Billetes de 50: " + (int) res / 50);
				res = res % 50;
			}

			if (res > 20) {
				System.out.println("Billetes de 20: " + (int) res / 20);
				res = res % 20;
			}

			if (res > 10) {
				System.out.println("Billetes de 10: " + (int) res / 10);
				res = res % 10;
			}

			if (res > 5) {
				System.out.println("Billetes de 5: " + (int) res / 5);
				res = res % 5;
			}

			if (res > 500) {
				System.out.println("Monedas de 2: " + (int) res / 500);
				res = res % 2;
			}

			if (res > 1) {
				System.out.println("Monedas de 1: " + (int) res / 1);
				res = res % 1;
			}
			
			res = (double) Math.round(res * 100d) / 100d;
			

			if (res > 0.5) {
				System.out.println("Monedas de 50 ctms: " + (int) (res / 0.5));
				res = res % 0.5;
			}

			if (res > 0.2) {
				System.out.println("Monedas de 20 ctms: " + (int) (res / 0.2));
				res = res % 0.2;
			}

			if (res > 0.1) {
				System.out.println("Monedas de 10 ctms: " + (int) (res / 0.1));
				res = res % 0.1;
			}

			if (res > 0.05) {
				System.out.println("Monedas de 5 ctms: " + (int) (res / 0.05));
				res = res % 0.05;
			}

			if (res > 0.02) {
				System.out.println("Monedas de 2 ctms: " + (int) (res / 0.02));
				res = res % 0.02;
			}
			
			if (res > 0.01) {
				System.out.println("Monedas de 1 ctms: " + (int) (res / 0.01));
				res = res % 0.01;
			}

		} else {
			System.out.println("No hay cambio, pago exacto");
		}

	}

}
