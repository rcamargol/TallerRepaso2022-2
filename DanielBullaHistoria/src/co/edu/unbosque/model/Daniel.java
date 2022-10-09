package co.edu.unbosque.model;

public class Daniel extends Mortales {

	private String atuendo;
	private String arma;
	
	public Daniel() {
		super.edad = 21;
		super.estatura = 1.72;
		super.alma = true;
		super.religion = " ora todos los dias a KublaKan";
		super.mentira = " miente en que no quiere destruir a los heroes";
		this.atuendo = " tiene una armadura futurista.";
		this.arma = " tiene una pistola que puede distorcionar la realidad.";
	}
	
	public String vestir() {
		return "Daniel " + this.atuendo;
	}
	
	public String defender() {
		return "Daniel " + this.arma;
	}

	@Override
	public String adquirirConocimientos() {
		return "Daniel le gusta mucho crear armas.";
	}

	@Override
	public String tenerUnaFamilia() {
		return "Daniel sueña con tener una esposa y poder formar una desendencia";
	}

	@Override
	public String ejercerUnaProfesion() {
		return "Daniel es un inventor y tambien es el soldado mas poderoso.";
	}
	
	@Override
	public String sentir() {
		return super.sentir();
	}
	
	@Override
	public String habitar() {
		return super.habitar();
	}
	
	@Override
	public String toString() {
		return "Daniel es un mortal" + "\n" +
				"La edad de Daniel es: " + super.edad + " años." + "\n" + 
				"La estatura de Daniel es: " + super.estatura + " metros " + "\n" + 
				"El color de ojos de Daniel es: " + super.colorDeOjos + "\n" + 
				"La alma de Daniel es: " + super.alma + "\n" + 
				vestir() + "\n" + 
				defender() + "\n" +
				"Daniel " + super.religion + "\n" +
				"Daniel " + super.mentira + "\n" +
				"Daniel como los demas mortales, " + sentir() + "\n" +
				"Daniel como los demas mortales, " + habitar() + "\n" +
				adquirirConocimientos() + "\n" + 
				tenerUnaFamilia() + "\n" +
				ejercerUnaProfesion();
	}
}
