package t7E11f;

public class MarcaPagina {

	private int paginaActual;

	public MarcaPagina(int paginaActual) {
		this.paginaActual = paginaActual;
	}

	public void siguientePagina() {
		paginaActual += 1;
		System.out.println("** Pasamos Pagina **");
	}

	public void empezardeNuevo() {
		setPaginaActual(1);
		System.out.println("** Empezamos el libro desde el principio **");
	}

	public void getPaginaActual() {
		System.out.println("La ultima pagina leida es: " + paginaActual);
	}

	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}

}
