package co.edu.unbosque.model;

public class Sebastian extends Mortales{
	
	private String esfuerzo;
	private String cariño;
	
	public Sebastian() {
		super.edad = 21;
		super.estatura = 1.73;
		super.envidia = "no existe";
		super.religion = "Catolico";
		super.alma = true;
		super.colordeojos = "Cafes";
		this.esfuerzo = "maximo";
		this.cariño = "solo a aquellos que lo merecen";
	}

	@Override
	public String adquirirConocimientos() {
		return "Sebastian esta en un constante aprendizaje sobre tecnologia, religion y otros hambitos de su interes";
	}

	@Override
	public String tenerFamilia() {
		return "Sebastian vive junto a su madre, su hermana y sus abuelos";
	}

	@Override
	public String ejercerProfesion() {
		return "Sebastian es un editor de videos digitales que aemes esta estudiando ingenieria de sistemas en la universidad el Bosque ";
	}
	@Override
	public String Habitar() {
		return "Sebastian habita en el planeta tierra mas especificamente en Bogota, Colombia";
	}
	@Override
	public String Sentir() {
		return "Sebastian puede sentir la presencia de otros mortales";
	}
	
	public String rapear() {
		return "Sebastian es muy bueno rimando , por lo que el rap es uno de sus fuertes";
	}
	
	public String jugarBasketball() {
		return "Sebastian practica Basketball por lo menos una vez por semana";
	}

	
	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEsfuerzo() {
		return esfuerzo;
	}

	public void setEsfuerzo(String esfuerzo) {
		this.esfuerzo = esfuerzo;
	}

	public String getCariño() {
		return cariño;
	}

	public void setCariño(String cariño) {
		this.cariño = cariño;
	}
	public String toString() {
		return "Edad: " + edad + " a�os" + "\n" +
				"Altura: " + estatura + " metros" + "\n" +
				"Color de ojos: " + colordeojos + "\n"+
				Habitar() + "\n"  +
				Sentir() + "\n"  +
				rapear() + "\n"+
				tenerFamilia() +  "\n" +
				adquirirConocimientos() + "\n" +
				ejercerProfesion() + "\n" +
				rapear();

	}
}


