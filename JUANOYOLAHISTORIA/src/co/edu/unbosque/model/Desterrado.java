package co.edu.unbosque.model;

public class Desterrado extends KublaKan{

	public Desterrado() {
		super.alma = false;
	}


	@Override
	public String habitar() {
		return "Habito el extremo sur del planeta.";
	}

	@Override
	public String sentir() {
		return "No siento a nadie mas que a mi mismo.";
	}
	public String arrastrarElCuerpo() {
		return "'Me estoy arrastrando a mi destino.'";
	}

	
	
	
}
