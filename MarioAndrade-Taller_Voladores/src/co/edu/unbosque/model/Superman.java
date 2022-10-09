package co.edu.unbosque.model;

public class Superman extends Kryptonian {
	
	private String superFuerza;
	public Superman(String superFuerza) {
		super(superFuerza);
		this.superFuerza = superFuerza;
	}

	public String despegue() {
		return " Cuando despega este deja una onda expansiva que destruye todo a su alrededor ";
	}
	public String aterrizar() {
		return " y cuando aterriza este deja un crater en el suelo. ";
	}
	public String volar() {
	return " Vuela bastante bien, mejor que un avion drogado, ";
	}
	public String saltarEdificio() {
		return " puede salta edificiones como un canguro en celo.";
	}
	public String paraBala() {
		return " Es capaz de detener cuanquier bala cuando esta alcolizado ";
	}
	public String comer() {
	return " a demas come perros calientes con bastante queso ";
 }

	@Override
	public String absorber_energía_solar() {
		// TODO Auto-generated method stub
		return " y recarga sus poderes necesita absorbe la energia del sol ";
	}
}