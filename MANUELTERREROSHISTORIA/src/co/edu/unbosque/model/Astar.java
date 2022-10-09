package co.edu.unbosque.model;

public class Astar extends Heroes{
	private int fegopm;
	private String preferencia;
	
	public Astar() {
		super.edad = 40;
		super.estatura = 3.00 ;
		super.colorojos = "Verde";
		super.alma =  "Su Dios KublaKan lo creo con un alma autentica.";
		super.debilidad = "Los diamantes son su debilidad";
		super.numheroe = 13;
		this.fegopm = fegopm;;
		this.preferencia = preferencia;
		
	}

	public int getFegopm() {
		return 15;
	}

	public void setFegopm(int fegopm) {
		this.fegopm = fegopm;
	}

	public String getPreferencia() {
		return "Astar prefiere ir una capa roja";
	}

	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}

	@Override
	String volar() {
		return "Le encanta volar cuando hay mucho sol.";
	}

	@Override
	String crearFuego() {
		return "Es capaz de crear fuego en 2 segundos desde sus manos. ";
	}

	@Override
	String detenerTiempo() {
		return "Es capaz de detener el tiempo por 40 minutos cynunianos.";
	}

	@Override
	String habitar() {
		return "Los heroes habitan en el norte de Cynus X1.";
	}

	@Override
	String sentir() {
		return "Los heroes son capaces de sentir a otros heroes y a otros seres de otros mundos. ";
	} 
	public void identificarHeroe() throws ExceptionPorAlgoV2 {
		if(super.estatura != 3) {
			throw new ExceptionPorAlgoV2("Astar no es un heroe, por que no mide 3 mts. \n"+
					                     "Hay que acabar con el impostor...Hay que acabar con Astar!" );
		}
	}
	
	public String brindarDatoAstar() {
		String linea;
		try {
			identificarHeroe();
		}catch (ExceptionPorAlgoV2 e) {
			linea = e.getMessage();
			return linea;
		}
		linea = "Astar ..."+ " \n"+
				"Tiene " +super.edad+ " anios\n"+
				"Mide "  + super.estatura + " mts\n"+
				"Sus ojos son de color "+super.colorojos+" \n"+
				super.debilidad+ " \n"+
				"Es el heroe numero "+super.numheroe+ " de todo Cynus X1"+" \n"+
				super.alma + " \n"+
				crearFuego()+ " \n"+
				detenerTiempo() + " \n"+
				volar() + " \n"+
				"Es capaz de disparar "+getFegopm() +" bolas de fuego por minuto."+ " \n"+
				getPreferencia() + " \n"+
                habitar() + " \n"+
                sentir() + " \n"+
                "Forma parte de la comunidad de heroes creado por KublaKan y su deber es proteger el planeta " +" \n"+
                "Realmente vivira hasta que KublaKan lo llame....";
		return linea;
	}

}
