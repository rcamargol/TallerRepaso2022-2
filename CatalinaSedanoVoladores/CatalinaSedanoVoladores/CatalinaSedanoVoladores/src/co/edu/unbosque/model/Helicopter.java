package co.edu.unbosque.model;

public class Helicopter extends Airplane{

	private String alasGiratorias;
	

	public Helicopter() {
		this.alasGiratorias = "Tengo 4 alas giratorias";
	    super.velocidad = "velocidad media";
		super.transporte = "solemos ser odiosos, no nos gusta transportar personas ajenas a nuestro piloto. Aunque a veces es divertido escuchar sus gritos y sentir su panico porque accidentalmente el helicoptero se mueve o falla";
	}
	
	public String desplazar () {
		return "Para desplazarnos trabajamos en conjunto con nuestras alas y a la hora de transportar ";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "-Antes de despegar nos tomamos una lominada de coco o un cafe, dependendiendo del clima. Echamos chisme con el piloto mientras calentamos el rotor y nos vamos poniendo la 10";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "-Antes de aterrizar debemos apagar la musica, dejar de lado la comida y estar concentrados. El aterrizaje es lo mas importante y peligroso";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "-Volar es nuestra actividad favoritas no solo por la adrenalina que se siente, tambien lo es porque vamos escuchando las canciones de ban bunny y comiendo golosinas. ";
	}
	@Override
	public String prenderMotor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String textoHelicopter () {
		return "-Soy la reina de los cielos " +alasGiratorias+ " con las que alcanzo a manejar una " +velocidad+ "\n"+
	" a la hora de transportar " +transporte+ "\n" +
	" y hoy te voy contar porque somos los mejores voladores "+ 
	"\n" + despegar() + "\n" + volar () + "\n" + desplazar () +  "\n" + aterrizar();
	}
}


