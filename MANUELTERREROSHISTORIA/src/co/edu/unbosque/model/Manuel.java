package co.edu.unbosque.model;

public class Manuel extends Mortales {
	private String colorpiel, pasatiempo; 
	
	public Manuel(){
		super.edad = 18;
		super.estatura = 1.75;
		super.colorojos = "Violetas";
		super.alma =  "Su Dios KublaKan lo creo con un alma autentica.";
		super.profesion = "Ingenieria de Sitemas";
		super.nombrepareja = "";
		this.colorpiel = colorpiel;
		this.pasatiempo = pasatiempo;
	}
	

	public String getColorpiel() {
		return "Su color de piel es morena";
	}


	public void setColorpiel(String colorpiel) {
		this.colorpiel = colorpiel;
	}


	public String getPasatiempo() {
		return "Le gusta ver peliculas ";
	}


	public void setPasatiempo(String pasatiempo) {
		this.pasatiempo = pasatiempo;
	}


	@Override
	String adquirirConocimiento() {
		return " Ha adquirido conocimientos en el septimo arte, en la programacion y en la cocina";
	}

	@Override
	String tenerFamilia() {
		return "Tiene familia y formara la suya algun dia con ";
	}

	@Override
	String ejercerProfesion() {
		return "Se dedica a la ";
	}

	@Override
	String habitar() {
		String a = "Los mortales viven en el este de Cynus X1";
		return a;
	}

	@Override
	String sentir() {
		return  " Solo puede sentir la presencia de otros mortales. ";
	} 
	public String trabajo() {
		return "Todos los dias trabajara para hacer feliz a KublaKan";
	}
	public void generarExepcionPareja()throws ExceptionPorAlgoV1 {
		
		if(super.nombrepareja == "") {
			throw new ExceptionPorAlgoV1("Manuel tiene a sus padres, pero no tiene pareja, por ende, no podra formar su propia familia.");
		}
	}
	
	public String brindarDatoMort() {
		String linea;
	try {
		generarExepcionPareja();
	} catch (ExceptionPorAlgoV1 e) {
		
		linea = "Manuel ..."+ " \n"+
				"Tiene" +super.edad+ "anios\n"+
				"Mide"  +super.estatura+ " mts\n"+
				"Sus ojos son de color "+super.colorojos+"\n"+
				getColorpiel()+ "\n"+
				super.alma + "\n"+
				e.getMessage()+ "\n"+
				getPasatiempo() + "\n"+
				adquirirConocimiento() + "\n"+
				ejercerProfesion() +super.profesion+ "\n"+
				trabajo() + "\n"+
                habitar() + "\n"+
                sentir() + "\n"+
                "Forma parte de la comunidad de mortales creado por KublaKan " +" \n"+
                "Realmente vivira hasta que KublaKan lo llame....";
		return linea;
	}
	linea = "Manuel ..."+ " \n"+
			"Tiene" +super.edad+ "anios\n"+
			"Mide"  +super.estatura+ " mts\n"+
			"Sus ojos son de color "+super.colorojos+"\n"+
			getColorpiel()+ "\n"+
			super.alma + "\n"+
			tenerFamilia() +nombrepareja+ "\n"+
			getPasatiempo() + "\n"+
			adquirirConocimiento() + "\n"+
			ejercerProfesion() +super.profesion+ "\n"+
			trabajo() + "\n"+
            habitar() + "\n"+
            sentir() + "\n"+
            "Forma parte de la comunidad de mortales creado por KublaKan " +" \n"+
            "Realmente vivira hasta que KublaKan lo llame....";
	return linea;
	
	
	
}

}
