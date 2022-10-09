package co.edu.unbosque.model;

public class Astar extends Heroes{
	
	private String caracteristicapredominante, tipodevoz;
	
	public Astar(String caracteristicapredominante, String tipodevoz) {
		super.edad = 40;
		super.estatura = 3.00;
		super.colordeojos = "verdes";
		super.alma = "verdadera";
		super.estadodeanimo = "feliz";
		super.tipoidentidad = "visible";
		this.caracteristicapredominante = "valentia";
		this.tipodevoz = "gruesa";
	}

	@Override
	public String habitar() {
		return "Habita al norte del planeta";
	}

	@Override
	public String sentir() {
		return "Puede sentir a si misma y otros seres de otros mundos";
	}

	@Override
	public String volar() {
		return "Vuela por los aires";
	}

	@Override
	public String detenerTiempo() {
		return "Tiene el poder de detener el tiempo";
	}

	@Override
	public String crearFuego() {
		return "Crea fuego con sus manos";
	}	
	
	public String hablar() {
		return "El habla casi todo el dia";
	}
	
	public String luchar() {
		return "El lucha contra las personas que hacen daño a la humanidad";
	}
	
	public String intervalarEstatura() throws EstaturaException{
		
		if (super.estatura >= 1.75) {
			throw new EstaturaException("El panita es de estatura alta");
		}
		
		else if (super.estatura >= 1.60 && super.estatura < 1.75) {
			throw new EstaturaException("El panita es de estatura media");
		}
		
		else if (super.estatura <1.60) {
			throw new EstaturaException("El panita es de estaura baja");
		}
		return "";
	}
	
	@Override
	public String toString() {
		return "ASTAR...\n"+
				"\n"+
				"CARACTERISTICAS.................\n"+
				"La edad es: " + super.edad + "\n"+
				"La estatura es: " + super.estatura + " metros\n"+
				"El color de ojos es: " + super.colordeojos +"\n"+
				"El alma es: " + super.alma + "\n"+
				"Se siente: " + super.estadodeanimo +"\n"+
				"La identidad es: " + super.tipoidentidad + "\n"+
				"La caracteristica mas predominante es su: " + this.caracteristicapredominante +"\n"+
				"La voz es: " + this.tipodevoz +"\n"+
				"\n"+
				"INFORMACION DE LOS HEROES.................\n";
	}
}
