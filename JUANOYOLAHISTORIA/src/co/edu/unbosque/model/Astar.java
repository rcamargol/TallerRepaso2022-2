package co.edu.unbosque.model;

public class Astar extends Heroe{
	
	private String nombre;
	private int nhaza�as;
	private int nelementosdominados;
	
	public Astar() {
		super();
		super.colordeojos = "Verdes";
		super.edad = 27;
		this.nombre = "Astar";
		this.nhaza�as = 40;
		this.nelementosdominados = 3;
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
