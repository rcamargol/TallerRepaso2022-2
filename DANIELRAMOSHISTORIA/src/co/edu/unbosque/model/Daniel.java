package co.edu.unbosque.model;

public class Daniel extends Mortales{
	
	private String comidafavorita;
	private double peso;
	
	public Daniel(String comidafavorita, double peso) {
		super.edad = 17;
		super.estatura = 1.72;
		super.colordeojos = "violeta";
		super.alma = "verdadera";
		super.tallazapato = 39.5;
		super.profesion = "Estudiante de ingenieria de sistemas";
		this.comidafavorita = "todo tipo de comida que incorpore pasta";
		this.peso = 60.0;
	}
	
	@Override
	public String habitar() {
		return "Habita en el este del planeta";
	}
	@Override
	public String sentir() {
		return "Puede sentir la presencia de otros mortales";
	}
	@Override
	public String adquirirConocimientos() {
		return "Adquiere conocimientos en todo lo que se le enseñe";
	}
	@Override
	public String tenerFamilia() {
		return "Todo mortal puede tener una familia";
	}
	@Override
	public String ejercerProfesion() {
		return "Como trabaja por el planeta lleva a cabo una profesión";
	}
	
	public String escucharMusica() {
		return "Escucha musica variada";
	}
	
	public String manejar() {
		return "Maneja con la licencia que le otorga Diosito";
	}
	
	public String intervalarEstatura() throws EstaturaException{
		
		if (super.estatura >= 1.75) {
			throw new EstaturaException("El panita es alto");
		}
		
		else if (super.estatura >= 1.60 && super.estatura < 1.75) {
			throw new EstaturaException("El panita es de altura media");
		}
		
		else {
			throw new EstaturaException("El panita es bajito");
		}
	}
	
	@Override
	public String toString() {
		return "DANIEL...\n"+
				"\n"+
				"CARACTERISTICAS.................\n"+
				"La edad es: " + super.edad + "\n"+
				"La estatura es: " + super.estatura + " metros\n"+
				"El color de ojos es: " + super.colordeojos +"\n"+
				"El alma es: " + super.alma + "\n"+
				"El calza: " + super.tallazapato +"\n"+
				"La profesion es: " + super.profesion + "\n"+
				"Le encanta: " + this.comidafavorita +"\n"+
				"El peso en kg es: " + this.peso +" kilos\n"+
				"\n"+
				"INFORMACION DE LOS MORTALES...............\n";
	}
	

}
