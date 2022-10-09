package co.edu.unbosque.model;

public class Kira extends Heroes{
	
	private String colorfavorito;
	private String tipobelleza;
	
	
	
	public Kira(String colorfavorito, String tipobelleza) {
		super.edad = 30;
		super.estatura = 3.0;
		super.colordeojos = "cafes";
		super.alma = "verdadera";
		super.estadodeanimo = "orgullosa";
		super.tipoidentidad = "secreta";
		this.colorfavorito = "morado";
		this.tipobelleza = "Hermosa";
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
	
	public String cantar() {
		return "canta en una pelicula musical";
	}
	
	public String bailar() {
		return "Le gusta bailar";
	}
	
	public String intervalarEstatura() throws EstaturaException{
		
		if (super.estatura >= 1.75) {
			throw new EstaturaException("La panita es de estatura alta");
		}
		
		if (super.estatura >= 1.60 && super.estatura < 1.75) {
			throw new EstaturaException("La panita es de altura media");
		}
		
		if (super.estatura <1.60){
			throw new EstaturaException("La panita es de estatura baja");
		}
		
		return "";
	}

	@Override
	public String toString() {
		return "KIRA...\n"+
				"\n"+
				"CARACTERISTICAS.................\n"+
				"La edad es: " + super.edad + "\n"+
				"La estatura es: " + super.estatura + " metros\n"+
				"El color de ojos es: " + super.colordeojos +"\n"+
				"El alma es: " + super.alma + "\n"+
				"Se siente: " + super.estadodeanimo +"\n"+
				"La identidad es: " + super.tipoidentidad + "\n"+
				"El color favorito es: " + this.colorfavorito +"\n"+
				"Ella es: " + this.tipobelleza +"\n"+
				"\n"+
				"INFORMACION DE LOS HEROES.................\n";
	}
	
	
}
