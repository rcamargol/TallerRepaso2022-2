package co.edu.unbosque.model;

public class Astar extends Heroe{
	
	private String nombre;
	private int nhazañas;
	private int nelementosdominados;
	
	public Astar() {
		super();
		super.colordeojos = "Verdes";
		super.edad = 27;
		this.nombre = "Astar";
		this.nhazañas = 40;
		this.nelementosdominados = 3;
	}
	
	public String contarHazañas() {
		return "He realizado " + this.nhazañas + " haza�as en mi vida";
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
	public int getNhazañas() {
		return nhazañas;
	}
	public void setNhazañas(int nhazañas) {
		this.nhazañas = nhazañas;
	}
	public int getNelementosdominados() {
		return nelementosdominados;
	}
	public void setNelementosdominados(int nelementosdominados) {
		this.nelementosdominados = nelementosdominados;
	}
	

}
