package co.edu.unbosque.model;

public class Kira extends Heroes {
	private int fuegopm;
	private String preferencia;
	
	public Kira() {
		super.edad = 25;
		super.estatura = 3.00 ;
		super.colorojos = "Azul";
		super.alma =  "Su Dios KublaKan la creo con un alma autentica.";
		super.debilidad = "La criptonita es su debilidad";
		super.numheroe = 1;
		this.fuegopm = fuegopm;;
		this.preferencia = preferencia;
		
		
	}

	public int getFuegopm() {
		return 30;
	}

	public void setFuegopm(int fuegopm) {
		this.fuegopm = fuegopm;
	}

	public String getPreferencia() {
		return "Kira prefiere ir desenmascarada";
	}

	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}

	@Override
	String volar() {
		return "Le encanta volar por las noches.";
	}

	@Override
	String crearFuego() {
		return "Es capaz de crear fuego en 5 segundos desde sus manos. ";
	}

	@Override
	String detenerTiempo() {
		return "Es capaz de detener el tiempo por 1 hora cynuniana.";
	}

	@Override
	String habitar() {
		return "Los heroes habitan en el norte de Cynus X1.";
	}

	@Override
	String sentir() {
		return "Los heroes son capaces de sentir a otros heroes y a otros seres de otros mundos. ";
	} 
	
	public void identificarHeroe() throws ExceptionPorAlgoV1 {
		if(super.estatura != 3) {
			throw new ExceptionPorAlgoV1("Kira no es un heroina, por que no mide 3 mts. \n"+
					                     "Hay que acabar con la impostora...Hay que acabar con Kira!" );
		}
	}

	public String brindarDatoKira() {
		String linea;
		try {
			identificarHeroe();
		}catch(ExceptionPorAlgoV1 e) {
			linea = e.getMessage();
			return linea;
		}
		linea = "Kira ..."+ " \n"+
				"Tiene " +super.edad+ " anios\n"+
				"Mide "  + super.estatura + " mts\n"+
				"Sus ojos son de color "+super.colorojos+" \n"+
				super.debilidad+ " \n"+
				"Es la heroina numero "+super.numheroe+ " de todo Cynus X1"+" \n"+
				super.alma + " \n"+
				crearFuego()+ " \n"+
				detenerTiempo() + " \n"+
				volar() + " \n"+
				"Es capaz de disparar "+getFuegopm() +" bolas de fuego por minuto."+ " \n"+
				getPreferencia() + " \n"+
                habitar() + " \n"+
                sentir() + " \n"+
                "Forma parte de la comunidad de heroes creado por KublaKan y su deber es proteger el planeta " +" \n"+
                "Realmente vivira hasta que KublaKan la llame....";
		return linea;
	}
}
