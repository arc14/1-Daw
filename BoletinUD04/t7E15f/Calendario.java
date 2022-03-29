package t7E15f;

public class Calendario {

	
	int ano, mes, dia;

	public Calendario(int ano, int mes, int dia) throws Exception{
		
		if(ano > 0) {
			this.ano = ano;
		} else {
			throw new IllegalArgumentException("El año no puede ser 0 o negativo");
		}
		
		if(mes > 0 && mes < 13) {
			this.mes = mes;
		} else {
			throw new IllegalArgumentException("El mes tiene tiene que estar entre 1 y 12");
		}
		
		if(dia > 0) {
			this.dia = dia;
		} else {
			throw new IllegalArgumentException("El dia no puede ser 0 o negativo");
		}
	}
	
	//Demasiado largo para volver a hacer un ejercico que se hizo en el tema 2 ejercico de aplicacion 14.
	
	public void incrementarDia() {
		dia += 1;
	}

	public void incrementarMes() {
		mes += 1;
	}
	
	public void incrementarAno() {
		ano += 1;
	}
	
	public void mostrar() {
		System.out.println("Calendario [ano=" + ano + ", mes=" + mes + ", dia=" + dia + "]");
	}
	
	public boolean iguales(Calendario otraFecha) {
		
		if (ano == otraFecha.ano && mes == otraFecha.mes && ano == otraFecha.ano) {
			return true;
		} else {
			return false;
		}
	}
}
