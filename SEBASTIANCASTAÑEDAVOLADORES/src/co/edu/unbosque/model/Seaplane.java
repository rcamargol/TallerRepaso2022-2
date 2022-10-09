package co.edu.unbosque.model;

public class Seaplane extends Airplane{
	private String flotar;
	
	public Seaplane(String gasolina,String flotar) {
		super(gasolina);
		this.flotar = flotar;
		// TODO Auto-generated constructor stub
	}
	public String unirMetodos() {
		String a = takeOff()+"\n"+land()+"\n"+fly()+"\n"+transport()+"\n"+movement()+"\n"+flotar()+"\n"+maneuver();
		return a;
	}
	public String flotar() {
		return "Puede mantenerse a flote";
	}
	public String maneuver() {
		return "Puede ser maniobrado por una persona";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.flotar;
	}
	

}
