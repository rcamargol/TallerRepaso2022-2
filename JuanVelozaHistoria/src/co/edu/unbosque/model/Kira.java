package co.edu.unbosque.model;

public class Kira extends Heroe {
	
	private String brigada;
	private String arma;
	
	public Kira() {
		super.edad = 115;
		super.colorojos = "Rojos";
		super.estatura = 3.00;
		super.alma = true;
		this.arma = "Arco de la Fuerza";
		this.brigada = "Brigada de Proteccion Planetaria";
	}
	
	public String establecerAlma() {
		String rta = "";
		if(alma = true) {
			rta = "Kira posee un alma verdadera, lo que quiere decir que es puro y siempre busca lo mejor para todos ";
		}
		return rta;
	}
	
	public String portarArma() {
		return "Kira posee un arma llamada " + arma + " , el cual encontro en lo mas alto de una montaña en una expedicion que hizo en la zona este del planeta" ;
	}
	
	public String pertenecerBrigada() {
		return "Kira pertenece a la " + brigada + " del planeta Cynus X1, encargada de defender al planeta de cualquier peligro exterior";
	}
	
	@Override
	public String volar() {
		return "Kira tiene la posibilidad de volar a lo largo del planeta ";
	}

	@Override
	public String crearFuego() {
		return "Kira es capaz de generar fuego a traves de sus propias manos ";
	}
	
	@Override
	public String detenerTiempo() {
		return "Kira puede detener el tiempo cuando le plazca ";
	}
	
	@Override
	public String habitar() {
		return "Kira habita, junto con otros heroes, en la zona norte del planeta ";
	}

	@Override
	public String sentir() {
		return "Kira y los demas heroes se sienten asi mismos y a los seres de otros mundos ";
	}

	public String getBrigada() {
		return brigada;
	}

	public void setBrigada(String brigada) {
		this.brigada = brigada;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Edad: " + edad + " años" + "\n" +
				"Altura: " + estatura + " metros" + "\n" +
				"Color de ojos: " + colorojos + "\n"+
				establecerAlma() + "\n" + 
				habitar() + "\n"  +
				sentir() + "\n"  +
				"Kira posee 3 poderes: " + "\n" + 
				" \t1. " + crearFuego() + "\n"  +
				" \t2. " + detenerTiempo() + "\n" +
				" \t3. " + volar() + "\n" + "\n" +
				portarArma() +"\n" +
				pertenecerBrigada();
	}
	
	
	

}
