package co.edu.unbosque.model;

public class Helicopter extends Airplane{
	private String rotor;
	
	public Helicopter(String gasolina,String rotor) {
		super(gasolina);
		this.rotor = rotor;
		// TODO Auto-generated constructor stub
	}
	public String unirMetodos() {
		String a = planear()+"\n"+sustentar()+"\n"+takeOff()+"\n"+land()+"\n"+fly()+"\n"+transport()+"\n"+movement();
		return a;
	}
	public String planear() {
		String a = "Puede planear";
		return a;
	}
	public String sustentar() {
		String a = "Genera presión que lo ayuda a volar";
		return a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.rotor;
	}
	

}
