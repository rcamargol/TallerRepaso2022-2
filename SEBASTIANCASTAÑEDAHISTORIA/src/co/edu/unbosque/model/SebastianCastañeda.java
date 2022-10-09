package co.edu.unbosque.model;

public class SebastianCastañeda extends Mortal{

	public SebastianCastañeda(int edad, double estatura, String color_ojos, boolean alma) {
		super(edad, estatura, color_ojos, alma);
		// TODO Auto-generated constructor stub
	}
	public String accionar() {
		String texto = adquirirConocimientos() + "\n" + tenerFamilia()+ "\n" + ejercerProfesion()+ "\n" + habitar() + "\n" + sentir();
		return texto;
	}

	@Override
	public String adquirirConocimientos() {
		String texto = "Sebastian Castañeda puede adquirir conocimientos";
		return texto;
	}

	@Override
	public String tenerFamilia() {
		String texto = "Sebastian Castañeda puede tener una familia";
		return texto;
	}

	@Override
	public String ejercerProfesion() {
		String texto = "Sebastian Castañeda puede ejercer una profesion";
		return texto;
	}

	@Override
	public String habitar() {
		String texto = "Sebastian Castañeda habita en el este del planeta";
		return texto;
	}

	@Override
	public String sentir() {
		String texto = "Sebastian Castañeda puede sentir la presencia de otros mortales";
		return texto;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Sebastian Castañeda tiene " + this.edad + " años\n"
				+ "Mide " + this.estatura + " metros" 
				+ "\nTiene ojos " + this.color_ojos
				+ "\nSu alma es " + this.alma;
	}
}
