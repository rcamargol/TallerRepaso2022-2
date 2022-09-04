package co.edu.unbosque.modelo;

public class Libro {

	private String letra;
	private String mes;
	private String numtelefono;

	public Libro(String letra, String mes, String numtelefono) {
		super();
		this.letra = letra;
		this.mes = mes;
		this.numtelefono = numtelefono;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getNumtelefono() {
		return numtelefono;
	}

	public void setNumtelefono(String numtelefono) {
		this.numtelefono = numtelefono;
	}
}
