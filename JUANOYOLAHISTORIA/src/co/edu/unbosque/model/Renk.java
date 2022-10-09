package co.edu.unbosque.model;

public class Renk extends Desterrado{
	
	private String nombre;
	private  int nvecesrechazado;
	private int nvecesodiado;
	
	public Renk() {
		super();
		this.nombre = "Renk";
		this.nvecesrechazado = 10;
		this.nvecesodiado = 5;
		super.edad = 500;
		super.colordeojos = "Rojos";
		super.estatura = 2.10;
	}
	public String renegar() {
		return "'¿Por qué nací con un alma falsa? Me han rechazado " + this.nvecesodiado + " veces en mi vida'";
	}
	public String odiar() {
		return "'Odio a todos con un alma verdadera, he odiado un total de "+ this.nvecesodiado + " veces en mi vida'";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNvecesrechazado() {
		return nvecesrechazado;
	}
	public void setNvecesrechazado(int nvecesrechazado) {
		this.nvecesrechazado = nvecesrechazado;
	}
	public int getNvecesodiado() {
		return nvecesodiado;
	}
	public void setNvecesodiado(int nvecesodiado) {
		this.nvecesodiado = nvecesodiado;
	}
	
	
	
	
	
}
