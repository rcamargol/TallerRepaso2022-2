package co.edu.unbosque.model;

public class Diana extends Mortal {

	public Diana() {
		super.colorDeOjos = "Violeta";
		super.edad = 17;
	}

	public String amar() {
		return "Ama a su familia y amig@s.";
	}

	public String jugar() {
		return "Juega mucho con sus amigos y amigas.";
	}

	public String adquirirConocimiento() {
		return "Tiene la capacidad de adquirir conocimiento.";
	}

	public String tenerFamilia() {
		return "Tiene una familia.";
	}

	public String ejercerProfesion() {
		return "Ejerce una profesion.";
	}

	public String habitarPlaneta() {
		return "Habita en el este del planeta Cynux X1.";
	}

	public String sentir() {
		return "Puede sentir la presencia de otros mortales.";
	}

	public String getColorDeOjos() {
		return colorDeOjos;
	}

	public void setColorDeOjos(String colorDeOjos) {
		this.colorDeOjos = "Violeta";
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = 17;
	}
}
