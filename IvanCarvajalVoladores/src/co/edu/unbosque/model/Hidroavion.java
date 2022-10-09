package co.edu.unbosque.model;

public class Hidroavion extends Avion{

	private String superficie;
	
	public Hidroavion() {
		superficie = "su lugar donde vive es el mar ";
		super.peso = "es muy ligero, pero no atrae la atencion de superman";
		super.frenos = "sus frenos son de tractomula osea malos";
	}
	
	@Override
	public String despegar() {
		return "el despega tanto de aeopuertos como del mar";
	}

	@Override
	public String aterrizar() {
		return "aterriza en las zonas acuaticas para recojer agua";
	}

	@Override
	public String volar() {
		return "vuela sin control y atropella a cualquier pajaro";
	}

	@Override
	public String motor() {
		return "funciona a base de carbon";
	}

	@Override
	public String transladar() {
		return "su principal translado es agua y personas a la vez";
	}
	
	public String accederZona() {
		return "tiene la capacidad de entrar en una zona donde hay un incendio";
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
}
