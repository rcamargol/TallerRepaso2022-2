package co.edu.unbosque.model;

public class Kira extends Heroe{
	
	private String nombre;
	private int nhaza�as;
	private int nelementosdominados;
	
	public Kira() {
		super();
		super.edad = 20;
		super.colordeojos = "azules";
		this.nombre = "Kira";
		this.nhaza�as = 20;
		this.nelementosdominados = 5;
		
	}
	
	public String contarHaza�as() {
		return "He realizado " + this.nhaza�as + " haza�as en mi vida";
	}
	public String contarElementosDominados() {
		return "He dominado un total de " + this.nelementosdominados + " elementos";
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNhaza�as() {
		return nhaza�as;
	}

	public void setNhaza�as(int nhaza�as) {
		this.nhaza�as = nhaza�as;
	}

	public int getNelementosdominados() {
		return nelementosdominados;
	}

	public void setNelementosdominados(int nelementosdominados) {
		this.nelementosdominados = nelementosdominados;
	}
	
	
}