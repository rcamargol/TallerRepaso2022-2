package co.edu.unbosque.model;

public class Renk extends Desterrado {
	
	private String EstiloCaza;
	private String limitaciones;
	
	public Renk() {
		super.edad= 1370;  //Dependiendo de este valor se genera la excepcion o no
		super.estatura= 1;
		super.colorOjos= "Rojo oscuro";
		super.alma= "Falsa (no autentica)";
		super.tormento= "recordar todo el tiempo que no era digno";
		super.vidaMax= 1500;
		this.EstiloCaza= "trampas";
		this.limitaciones= "no posee brazos ni piernas";
	}

	@Override
	public String arrastrarse() {
		String msj = "Renk es un ser clasificado como DESTERRADO, por lo tanto, "+this.limitaciones+" y debe arrastrarse todo el tiempo";
		return msj;
	}

	@Override
	public String atormentarse() {
		String msj = "Renk suele llorar al "+super.tormento+" y por ende su estado animico es pesimo";
		return msj;
	}

	@Override
	public String habitar() {
		String msj= "Renk al ser catalogado como DESTERRADO habita en el extremo sur del planeta";
		return msj;
	}

	@Override
	public String sentir() {
		String msj = "Renk es incapaz de sentir a otros seres y solo puede sentirse a si mismo";
		return msj;
	}
	
	public String alimentarse() {
		String msj= "Renk debido a su condicion y limitaciones ha tenido que alimentarse algunos insectos o pequeños animales, pero para ello"+"\n"+
	                "     ha tenido que crear "+this.EstiloCaza+" para poder sobrevivir en los duros inviernos";
		return msj;
	}
	
	public void generarExcepcionEdadRenk() throws EstaMuertoElParceroExeption{
		// aqui se evalua si la edad que tiene Renk supera la edad maxima de los desterrados.
	    if(super.edad > super.vidaMax){
				throw new EstaMuertoElParceroExeption("Renk murio, supero la edad limite del desterrado de "+super.vidaMax+" años con "+super.edad+" años, esperemos este con KublaKan :) .");
	    }
	    
		}

	public String generarInformacionRenk() {
	 // aqui la información que se envia depende del resultado de la exepcion
		try {
			generarExcepcionEdadRenk();
		} catch (EstaMuertoElParceroExeption e) {
			return "Lo sentimos no hay información debido a que "+e.getMessage();	 
			
		}
		return "*****RENK*****"+"\n"+"\n"+
                  "Acerca de Renk: "+"\n"+
			      "-- Estatura: "+super.estatura+" metros. \n"+
                  "-- Edad: "+super.edad+" años.\n"+
			      "-- Color de ojos: "+super.colorOjos+".\n"+
			      "-- Tipo de alma: "+super.alma+".\n"+
			      "-- Habitad: "+habitar()+"\n"+
			      "-- tormento: "+atormentarse()+"\n"+"\n"+
			      "Habilidades o acciones: "+ "\n"+
			      "\t-- "+arrastrarse()+"\n"+
                  "\t-- "+sentir()+"\n"+
				  "\t-- "+alimentarse();
	}
	

}
