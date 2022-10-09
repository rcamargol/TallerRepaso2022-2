package co.edu.unbosque.model;

public class Kira extends Héroe{

	private String arma;
	private String ataque;
	
	public Kira() {
		super.edad= 1110;
		super.estatura= 3;    //Dependiendo de este valor se genera la excepcion o no
		super.colorOjos= "Azul claro";
		super.alma= "Pura y verdadera";
		super.intervaloTiempo= 2;
		super.tiempoVuelo= 30;
		this.arma= "espada";
		this.ataque= "aereo";
	}
	
	@Override
	public String volar() {
		String msj = "Kira tiene la habilidad de volar, pero debe saber usarlo, el tiempo limite para la acción es "+super.tiempoVuelo+" minutos.";
		return msj;
	}

	@Override
	public String crearFuego() {
	    String msj = "Kira tiene la habilidad de crear fuego a voluntad solo con solo frotar sus manos.";
		return msj;
	}

	@Override
	public String detenerTiempo() {
		String msj = "Kira tiene la capacidad de detener el tiempo en un intervalo no muy prolongado de "+super.intervaloTiempo+" minutos.";
		return msj;
	}

	@Override
	public String habitar() {
		String msj = "Kira al ser catalogada como HÉROE esta con los de su misma clase al norte del planeta.";
		return msj;
	}

	@Override
	public String sentir() {
		String msj = "Kira tiene la responsabilidad de defender el planeta y por ende tiene la capacidad de sentir la presencia de si misma y la de seres de otros mundos.";
		return msj;
	}
	
	public String ejecutarOfensiva() {
		String msj = "Kira ha desarrollado su estrategia para poder dar fin a sus enemigos por medio de un ataque "+this.ataque+" haciendo uso de su "+this.arma+" prendida fuego por sus manos.";
		return msj;
	}
	
	public void generarExcepcionEstaturaKira() throws NoPareceEsoExeption {
		// Aqui se evalua si la estatura de Kira es menor o supera a la estatura normal de un héroe  
		if (super.estatura < 3 || super.estatura > 3) {
			throw new NoPareceEsoExeption("parece ser que Kira no es una Héroe, su altura debe ser igual a 3 metros, y tiene "+super.estatura+" metros.");
		}
		  
		}
	
	
	public String generarInformacionKira() {
		// La informacion enviada depende del resultado de la excepcion y el contenido de el atributo estatura
		try {
			generarExcepcionEstaturaKira();
		}catch(NoPareceEsoExeption e) {
			return "no hay informacion debido a que "+e.getMessage();
		}
	
		return "*****KIRA*****"+"\n"+"\n"+
                "Acerca de Kira: "+"\n"+
			    "-- Estatura: "+super.estatura+" metros. \n"+
                "-- Edad: "+super.edad+" años. \n"+
			    "-- Color de ojos: "+super.colorOjos+".\n"+
			    "-- Tipo de alma: "+super.alma+".\n"+
			    "-- Habitad: "+habitar()+"\n"+"\n"+
			    "Habilidades: "+ "\n"+
			    "\t-- "+volar()+"\n"+
                "\t-- "+crearFuego()+"\n"+
			    "\t-- "+detenerTiempo()+"\n"+
                "\t-- "+sentir()+"\n"+
			    "\t-- "+ejecutarOfensiva();
				      
	}

	
}
