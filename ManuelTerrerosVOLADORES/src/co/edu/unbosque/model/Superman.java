package co.edu.unbosque.model;

public class Superman extends Kriptoniano implements Volador  {
	
	private String droga;
	
	public Superman() {
		this.droga = "Se droga con el polvo de la Cenicienta";
		super.defecar = "Defeca en la orbita de Andromeda";
		super.comida = "Come de to' menos las sobras, es todo lo contrario a sus supuestos amigos ;)";
		super.novia = "Como dice el dicho, entre primos mas me arrimo";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Aterriza donde sea";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Despega donde le venga en gana";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Vuela hasta donde no llega la luz";
	}

	@Override
	public String estrellarseDondeSea() {
		// TODO Auto-generated method stub
		return "No se puede estrellar en cualquier lado :(";
	}

	@Override
	String defecarDondeSea() {
		// TODO Auto-generated method stub
		return defecar;
	}

	public String getDroga() {
		return droga;
	}

	public void setDroga(String droga) {
		this.droga = droga;
	}

	@Override
	String comer() {
		// TODO Auto-generated method stub
		return comida;
	}

	@Override
	String tenerNovia() {
		// TODO Auto-generated method stub
		return novia;
	}
	public String saltarEdificio() {
		return "Puede saltar desde lo mas alto de cada edificio sin partirse la madre";
	}
	public String pararBalas() {
		return "A su madre, para las balas hasta de un tanque Panther KF51, se merece un nerf URGENTE";
	}

	@Override
	public String toString() {
		return "Superman: "+ " \n" + despegar() +" \n" + volar()+ " \n" + aterrizar()+ " \n" + comer() +"\n" +defecarDondeSea()+ "\n" +estrellarseDondeSea()+"\n" +getDroga()+"\n" +tenerNovia()+"\n" +pararBalas()+"\n" +saltarEdificio()+"";
	}
	

}
