package co.edu.unbosque.model;

public class Heroe extends KublaKan{

	public Heroe() {
		super.estatura = 3;
		super.alma = true;
	}

	@Override
	public String habitar() {	
		return "Habito el norte del planeta.";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Me siento a mi y a la gente de otros mundos.";
	}
	public String adquirirConocimientos() {
		return "Estoy aprendiendo.";
	}
	public String volar() {
		return "¡Levito por los aires gracias a mi Dios KublaKan!";
	}
	public String detenerElTiempo() {
		return "¡Todo se queda quieto cuando quiero gracias a mi Dios KublaKan!";
	}
	public String crearFuego() {
		return "¡Las flamas brillan en mis manos gracias al dios Kublakan!";
	}
	public String luchar() {
		return "Estoy protegiendo el planeta";
	}
	
}
