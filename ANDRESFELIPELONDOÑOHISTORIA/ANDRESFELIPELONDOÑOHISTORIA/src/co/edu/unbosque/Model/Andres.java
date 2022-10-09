package co.edu.unbosque.Model;

public class Andres extends Mortales{
	
	
	public Andres() {
		super.colorOjos ="Violeta";
		super.edad = 17;
	}
	
	String adquirirConocimiento() {
		return "He adquirido conocimiento por mucho tiempo.";
	}

	@Override
	String tenerFamilia() {
		return "En algun momento de mi vida tuve una familia.";
	}

	@Override
	String ejercerProfesion() {
		// TODO Auto-generated method stub
		return "En mi vida he tenido varios trabajos pero actualmente"
				+ "me dedico a recorrer el mundo en busca de quien acabo "
				+ "con mi familia.";	
	}

	@Override
	String habitar() {
		// TODO Auto-generated method stub
		return "Habito en la parte este del planeta.";
	}

	@Override
	String sentir() {
		// TODO Auto-generated method stub
		return "Puedo sentir la presencia de otros mortales como yo.";
	}
	public String descAndres() {
		return "Tengo "+ edad+ " años"+"\n"+
				"Tengo los ojos color "+ colorOjos + "\n"+ 
				adquirirConocimiento()+ "\n" +
				tenerFamilia() + "\n" +
				ejercerProfesion() + "\n" +
				habitar() + "\n" +
				sentir();
				
		
	}
}
