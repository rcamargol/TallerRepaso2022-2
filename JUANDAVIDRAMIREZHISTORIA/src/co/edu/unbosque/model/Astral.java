package co.edu.unbosque.model;

public class Astral extends Héroes {
	private String supervelocidad;
	private String espada;
	
	
	public Astral() {
		super.edad= 69;
		super.alma= true;
		super.colorojos= "gris";
		super.estatura= 3.00;
		super.Liderazgo="Este h�roes tiene mucha personalidad a la hora de liderar";
		super.Sabiduria="Este H�roe tiene mucha sabiduria gracias a sus padres";
		this.supervelocidad="este h�roe puede llegar a ser mas rapido que los aviones ";
		this.espada="Este H�roe posse la espada de Bolivar";
	}
	
	public String habitar() {
		
		return "Habitan en Norte del planeta";
	}

	@Override
	public String crearFuego() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSupervelocidad() {
		return supervelocidad;
	}


	public void setSupervelocidad(String supervelocidad) {
		this.supervelocidad = supervelocidad;
	}


	public String getEspada() {
		return espada;
	}


	public void setEspada(String espada) {
		this.espada = espada;
	}


	@Override
	public String detenerTiempo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Sentir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Habitar() {
		// TODO Auto-generated method stub
		return null;
	}

}
