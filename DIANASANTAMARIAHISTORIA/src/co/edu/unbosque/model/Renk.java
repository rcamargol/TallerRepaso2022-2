package co.edu.unbosque.model;

public class Renk extends Desterrado {

	public Renk() {
		super.nivelDeTristeza = "Muy alto";
		super.alma = false;
		super.edad = 1436;
	}

	public String odiar() {
		return "Siente mucho odio.";
	}

	public String llorar() {
		return "Llora por lo solo que se siente.";
	}

	public String arrastrar() {
		return "Se arrastra de un lugar a otro.";
	}

	public String habitarPlaneta() {
		return "Habita en el extremo sur del planeta Cynux X1.";
	}

	public String sentir() {
		return "Solo se puede sentir a si mismo, a nadie mas:(";
	}

	public String getNivelDeTristeza() {
		return nivelDeTristeza;
	}

	public void setNivelDeTristeza(String nivelDeTristeza) {
		this.nivelDeTristeza = "Muy alto";
	}

	public boolean getAlma() {
		return alma;
	}

	public void setAlma(boolean alma) {
		this.alma = false;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = 1436;
	}
}
