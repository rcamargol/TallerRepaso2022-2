package co.edu.unbosque.model;

public class DavidPuerto extends Mortal {
	public DavidPuerto() {
		super.colorOjos = "Violeta";
		super.edad = 18;
	}

	@Override
	public String adquirirConocimientos() {
		return "Puedo adquirir un sin fin de conocimientos";
	}

	@Override
	public String tenerFamilia() {
		return "Puedo procrear y tener una familia";
	}

	@Override
	public String ejercerPorfesion() {
		return "Puedo ejercer un trabajo a cambio de dinero";
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

}
