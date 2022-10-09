package co.edu.unbosque.model;

public class Kira extends Heroe{
	
	public Kira(int edad, double estatura, String color_ojos, boolean alma) {
		super(edad, estatura, color_ojos, alma);
	}
	public String accionar() {
		String texto = volar() + "\n" + crearFuego() + "\n" + detenerTiempo() + "\n" + habitar() + "\n" + sentir();
		return texto;
	}

	@Override
	public String volar() {
		String texto = "Kira puede volar";
		return texto;
	}

	@Override
	public String crearFuego() {
		String texto = "Kira puede crear fuego";
		return texto;
	}

	@Override
	public String detenerTiempo() {
		String texto = "Kira puede detener el tiempo";
		return texto;
	}

	@Override
	public String habitar() {
		String texto = "Kira habita en el norte de CynusX1";
		return texto;
	}

	@Override
	public String sentir() {
		String texto = "\tKira se siente a si mismo y a seres de otros mundos";
		return texto;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kira tiene " + this.edad + " años\n"
				+ "Mide " + this.estatura + " metros" 
				+ "\nTiene ojos " + this.color_ojos
				+ "\nSu alma es " + this.alma;
	}
}
