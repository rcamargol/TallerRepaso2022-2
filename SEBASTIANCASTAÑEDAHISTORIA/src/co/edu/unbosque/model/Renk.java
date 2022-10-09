package co.edu.unbosque.model;

public class Renk extends Desterrado{
	public Renk(int edad, double estatura, String color_ojos, boolean alma, int vivir) {
		super(edad, estatura, color_ojos, alma, vivir);
	}
	public String accionar() {
		String texto = arrastar() + "\n" + habitar() + "\n" + sentir();
		return texto;
	}

	@Override
	public String arrastar() {
		String texto = "Renk se arrastra de un lugar a otro";
		return texto;
	}

	@Override
	public String habitar() {
		String texto = "Renk vive en el sur de CynusX1";
		return texto;
	}

	@Override
	public String sentir() {
		String texto = "Renk solo se siente a si mismo";
		return texto;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Renk tiene " + this.edad + " años\n"
				+ "Mide " + this.estatura + " metros" 
				+ "\nTiene ojos " + this.color_ojos
				+ "\nSu alma es " + this.alma
				+ "\nRenk puede vivir " + this.vivir + " años";
	}
}
