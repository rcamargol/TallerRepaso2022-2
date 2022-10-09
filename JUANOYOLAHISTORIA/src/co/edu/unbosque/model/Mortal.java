package co.edu.unbosque.model;

public class Mortal extends KublaKan {

	public Mortal() {
		super();
		super.colordeojos = "Violeta";
		super.alma = true;
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habito al este del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Siento a mis semejantes";
	}
	public String adquirirConocimientos() {
		return "Estoy aprendiendo";
	}
	public String tenerFamilia() {
		return "Amo a mi esposa y a mis hijos, ¡gloria a KublaKan!";
	}
	public String ejercerProfesion() {
		return "Trabajo en lo que me gusta gracias a mi Dios KublaKan"; 
	}

		
}
