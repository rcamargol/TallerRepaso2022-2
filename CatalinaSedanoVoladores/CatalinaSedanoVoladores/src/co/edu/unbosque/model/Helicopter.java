package co.edu.unbosque.model;

public class Helicopter extends Airplane{

	private String alasGiratorias;
	
	public Helicopter() {
	this.alasGiratorias = "";
	}
	
	public String desplazar () {
		return "-Solemos ser odiosos, no nos gusta transportar personas ajenas a nuestro piloto." + "\n" + "Aunque a veces es divertido escuchar sus gritos y sentir su panico porque accidentalmente el helicoptero se mueve o fallajajaj";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "-Antes de despegar nos tomamos una lominada de coco o un cafe, dependendiendo del clima. Echamos chisme con el piloto mientras calentamos el rotor y nos vamos poniendo la 10";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "-Volar es nuestra actividad favoritas no solo por la adrenalina que se siente, tambien lo es porque vamos escuchando las canciones de ban bunny y comiendo golosinas. ";
	}
	public String textoHelicopter () {
		return "-Soy la reina de los cielos y hoy te voy contar porque somos los mejores voladores"  + "\n" + despegar() + "\n" + volar () + "\n" + desplazar () + "\n" + aterrizar();
	}
}
