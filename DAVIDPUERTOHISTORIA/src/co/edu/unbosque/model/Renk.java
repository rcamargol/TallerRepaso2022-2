package co.edu.unbosque.model;

public class Renk extends Desterrado {

	public Renk() {
		super.alma = false;
		super.edad = 1300;
	}

	@Override
	public String arrastrarse() {
		return "Me arrastro de un lugar al otro";
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getAlma() {
		return alma;
	}

	public void setAlma(boolean alma) {
		this.alma = alma;
	}

}
