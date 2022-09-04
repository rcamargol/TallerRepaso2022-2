package co.edu.unbosque.model;

public class Libro {
	
	private String apellido;
	private String mes;
	private String telefono;
	
	public Libro(String apellido, String mes, String telefono) {
		super();
		this.apellido = apellido;
		this.mes = mes;
		this.telefono = telefono;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
