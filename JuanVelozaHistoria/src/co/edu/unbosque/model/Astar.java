package co.edu.unbosque.model;

public class Astar extends Heroe{
	
	private String arma;
	private int añosdeservicio;
	
	public Astar () {
		super.edad = 180;
		super.estatura = 3.00;
		super.colorojos = "Rubi";
		super.alma = false;
		this.arma = "Lanza del destino";
		this.añosdeservicio = 100;
	}
	
	
	
	public String registrarAños() {
		return "Astar sirvio al ejercito durante " + edad + " años";
	}
	public String tenerArma() {
		return "Astar posee un arma llamada " + arma + " ,la cual obtuvo por sus años de servicio en el ejercito";
	}
	@Override
	public String volar() {
		return "Astar tiene la capacidad de volar al rededor del planeta ";
	}

	@Override
	public String crearFuego() {
		return "Astar tiene la capacidad de generar fuego de sus manos ";
	}

	@Override
	public String detenerTiempo() {
		return "Astar tiene la capacidad de detener el tiempo cuando le plazca ";
	}

	@Override
	public String habitar() {
		return "Astar, junto a los otros heroes, habita en la zona norte del planeta  ";
	}

	@Override
	public String sentir() {
		return "Astar y los demas heroes se sienten a si mismos y a los seres de otros mundos ";
	}

	public String getArma() {
		return arma;
	}



	public void setArma(String arma) {
		this.arma = arma;
	}



	public int getAñosdeservicio() {
		return añosdeservicio;
	}



	public void setAñosdeservicio(int añosdeservicio) {
		this.añosdeservicio = añosdeservicio;
	}



	@Override
	public String toString() {
		return "Edad: " + edad + " años" + "\n" +
				"Altura: " + estatura + " metros" + "\n" +
				"Color de ojos: " + colorojos + "\n"+  
				"Astar posee un alma falsa, pues durante sus años de servicio en el ejrecito, acabo con la vida de uno de sus compañeros"
				+ "\n" +"durante una fuerte discución que tuvieron, el asesinar a un aliado hace que se transforme tu alma y sea falsa e impura, a pesar de que Astar siempre fue buena persona" + "\n" + 
				habitar() + "\n"  +
				sentir() + "\n"  +
				"Astar posee 3 poderes: " + "\n" + 
				" \t1. " +crearFuego() + "\n"  +
				" \t2. " +detenerTiempo() + "\n" +
				" \t3. " +volar() + "\n" + 
				tenerArma() + "\n" +
				registrarAños();
	}
	
}
