package co.edu.unbosque.model;

public class Astar extends Heroe {

	private int rescates;
	private int enemigos;
	
	public Astar() {
		super.edad= 900;
		super.estatura= 3;       //Dependiendo de este valor se genera la excepcion o no
		super.colorOjos= "Azul claro";
		super.alma= "Pura y verdadera";
		super.intervaloTiempo= 5;
		super.tiempoVuelo= 15;
		this.rescates= 378;
		this.enemigos= 56;
	}
	@Override
	public String volar() {
		String msj = "Astar tiene la habilidad de volar, pero debe saber usarlo ya que su tiempo maximo es "+super.tiempoVuelo+" minutos.";
		return msj;
	}

	@Override
	public String crearFuego() {
	    String msj = "Astar tiene la habilidad de crear fuego a voluntad solo con solo frotar sus manos o chasquear los dedos.";
		return msj;
	}

	@Override
	public String detenerTiempo() {
		String msj = "Astar tiene la capacidad de detener el tiempo en un intervalo medio de "+super.intervaloTiempo+" minutos.";
		return msj;
	}

	@Override
	public String habitar() {
		String msj = "Astar al ser catalogado como un H�ROE esta con los de su misma clase al norte del planeta.";
		return msj;
	}

	@Override
	public String sentir() {
		String msj = "Astar tiene la responsabilidad de defender el planeta y por ende tiene la capacidad de sentir la presencia de si mismo y la de seres de otros mundos.";
		return msj;
	}
	
	public String imponerJusticia() {
		String msj = "Astar a largo de su existencia ha tenido que disputar varias batllas. En promedio de un a�o Astar ha realizado "+this.rescates+" rescates"+"\n"+
	                 "    y ha enfrentado a "+this.enemigos+" enemigos.";
		return msj;
	}
	
	public void generarExcepcionEstaturaAstar() throws NoPareceEsoExeption {
		// Aqui se evalua si la estatura de Astar es menor o supera a la estatura normal de un h�roe  
		if (super.estatura < 3 || super.estatura > 3) {
			throw new NoPareceEsoExeption("parece ser que Astar no es un H�roe, su altura debe ser igual a 3 metros, y tiene "+super.estatura+" metros.");
		}
		  
		}
	
	public String generarInformacionAstar() {
		
		// La informacion enviada depende del resultado de la excepcion y el contenido de el atributo estatura
				try {
					generarExcepcionEstaturaAstar();
				}catch(NoPareceEsoExeption e) {
					return "no hay informacion debido a que "+e.getMessage();
				}
		return "*****ASTAR*****"+"\n"+"\n"+
                "Acerca de Astar: "+"\n"+
			    "-- Estatura: "+super.estatura+" metros. \n"+
                "-- Edad: "+super.edad+" a�os. \n"+
			    "-- Color de ojos: "+super.colorOjos+".\n"+
			    "-- Tipo de alma: "+super.alma+".\n"+
			    "-- Habitad: "+habitar()+"\n"+
			    "-- Historial de batalla: "+imponerJusticia()+"\n"+"\n"+
			    "Habilidades: "+ "\n"+
			    "\t-- "+volar()+"\n"+
                "\t-- "+crearFuego()+"\n"+
			    "\t-- "+detenerTiempo()+"\n"+
                "\t-- "+sentir();		      
	}
}
