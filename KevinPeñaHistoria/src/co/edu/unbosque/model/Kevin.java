package co.edu.unbosque.model;

public class Kevin extends Mortales{
	
	private String estudia;
	private String juega;
	
	public Kevin() throws ExceptionPorAlgo {
		estudia = "De lunes a viernes.";
		juega = "Cuando no dejan tareas, se puede jugar.";
		edad = 100;
		estatura = "2 metros.";
		colorDeOjos = "Violeta";
		alma = true;
		pesca = true;
		duerme = "Cuando el dia no esta pesado.";
	}
	
	public String realizarCurso() {
		return "En progreso";
	}
	
	public String hacerEjercicios() {
		return "5 veces a la semana.";
	}

	@Override
	String adquirirConocimientos() {
		// TODO Auto-generated method stub
		return "Solo en los libros";
	}

	@Override
	String tenerFamilia() {
		// TODO Auto-generated method stub
		return "Todos tienen familia por ley.";
	}

	@Override
	String ejercerProfesion() {
		// TODO Auto-generated method stub
		return "En todo el planeta, solo de lunes a viernes, algunos los sabados.";
	}

	@Override
	String habitar() {
		// TODO Auto-generated method stub
		return "Al este del planeta.";
	}

	@Override
	String sentir() {
		// TODO Auto-generated method stub
		return "la presencia de los mortales.";
	}
	
	public String mortales() {
		return "Edad: " + edad +" años." + "\n" + "Estatura: " + estatura + "\n" + "Color de ojos: "+ colorDeOjos + "\n"
				+"Alma: " + alma + "\n"+"Habitan: " + habitar() + "\n"+ "Sienten: " + sentir() + "\n"+ "Pesca: " +  pesca + "\n" + "Juega: "+ juega+ "\n"
				+"Adquirir conocimiento: " + adquirirConocimientos() +"\n"+ "Tener familia: " + tenerFamilia();
	}
	
	public String kevin() {
		return "Nombre: Kevin David "+"\n"+"Edad: " + "17" +" años." + "\n" + "Estatura: " + estatura + "\n" + "Color de ojos: "+ colorDeOjos + "\n"
				+"Alma: " + alma + "\n"+"Habitan: " + habitar() + "\n"+ "Sienten: " + sentir() + "\n"+ "Pesca: " +  pesca + "\n" + "Juega: "+ juega+ "\n"
				+"Adquirir conocimiento: " + adquirirConocimientos() + "\n"+ "Tener familia: " + tenerFamilia() +"\n"+ "Estudia: " + this.estudia +"\n"
				+"Juega: " + this.juega +"\n"+"Realiza un curso: " + realizarCurso() + "\n" + "Hacer ejercicio: " + hacerEjercicios();
	}

}
