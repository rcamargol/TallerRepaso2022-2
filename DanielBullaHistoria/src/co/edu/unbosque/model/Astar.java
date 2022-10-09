package co.edu.unbosque.model;

public class Astar extends Heroes{

	public String justicia;
	public String envidia;
	
	public Astar() {
		super.edad = 32;
		super.estatura = 3;
		super.colorDeOjos = "azul";
		super.alma = true;
		super.nobleza = " un corazon noble ";
		super.liderazgo = " es un lider innato ";
		this.justicia = " imparte la justicia ";
		this.envidia = " le tiene envidia a Kira ";
	}
	
	public String luchar() {
		return "Astar es muy poderoso por lo cual " + this.justicia + " a todo el planeta.";
	}
	
	public String sabotear() {
		return "Astar " + this.envidia + " por lo cual siempre sabotea todas sus misiones.";
	}
	
	@Override
	public String habitar() {
		
		return super.habitar();
	}
	
	@Override
	public String sentir() {
		
		return super.sentir();
	}

	@Override
	public String crearFuego() {
		return "Astar como los demas heroes tiene la habilidad de crear fuego, pero es uno de los peores usandola.";
	}

	@Override
	public String detenerTiempo() {
		return "Astar como los demas heroes tiene la habilidad de detener el tiempo, la cual la usa para poder evitar accidentes.";
	}

	@Override
	public String volar() {
		return "Astar como los demas heroes tiene la habilidad de volar, la cual la usa para transportarse y hacer carreras con otros heroes.";
	}
	
	@Override
	public String toString() {
		return 	"Astar es un heroe" + "\n" +
				"La edad de Astar es: " + super.edad + " años." + "\n" + 
				"La estatura de Astar es: " + super.estatura + " metros " + "\n" + 
				"El color de ojos de Astar es: " + super.colorDeOjos + "\n" + 
				"La alma de Astar es: " + super.alma + "\n" + 
				luchar() + "\n" + 
				sabotear() + "\n" +
				"Astar no tiene " + super.nobleza + "\n" +
				"Astar " + super.liderazgo + "\n" +
				"Astar como los demas heroes, " + sentir() + "\n" +
				"Astar como los demas heroes, " + habitar() + "\n" +
				crearFuego() + "\n" + 
				detenerTiempo() + "\n" +
				volar();
	}
	
	
}
