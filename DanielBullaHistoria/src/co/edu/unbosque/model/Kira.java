package co.edu.unbosque.model;

public class Kira extends Heroes{

	private String seduccion;
	private String valentia;
	
	public Kira() {
		super.edad = 22;
		super.estatura = 3;
		super.colorDeOjos = "azul";
		super.alma = true;
		super.nobleza = " un corazon muy noble ";
		super.liderazgo = " no es una lider innata ";
		this.seduccion = " engañar a sus pretendientes ";
		this.valentia = " es muy valiente ";
	}

	public String engañar() {
		return "A kira le gusta " + this.seduccion;
	}
	
	public String proteger() {
		return "A Kira le gusta luchar por la proteccion de los habitantes porque es " + this.valentia;
	}
	
	@Override
	public String habitar() {
		
		return super.habitar();
	}
	
	@Override
	public String sentir() {
		
		return super.sentir();
	}

	@Override
	public String crearFuego() {
		return "Kira como los demas heroes tiene la habilidad de crear fuego, en la cual es la que mejor lo hace.";
	}

	@Override
	public String detenerTiempo() {
		return "Kira como los demas heroes tiene la habilidad de detener el tiempo, pero no es una de sus mejores habilidades.";
	}

	@Override
	public String volar() {
		return "Kira como los demas heroes tiene la habilidad de volar, la cual usualmente la usa para transportarse y tambien para ir de vacaciones.";
	}
	
	@Override
	public String toString() {
		return 	"Kira es una heroina" + "\n" +
				"La edad de Kira es: " + super.edad + " años." + "\n" + 
				"La estatura de Kira es: " + super.estatura + " metros " + "\n" + 
				"El color de ojos de kira es: " + super.colorDeOjos + "\n" + 
				"La alma de Kira es: " + super.alma + "\n" + 
				proteger() + "\n" + 
				engañar() + "\n" +
				"Kira tiene " + super.nobleza + "\n" +
				"Kira " + super.liderazgo + "\n" +
				"Kira como los demas heroes, " + sentir() + "\n" +
				"Kira como los demas heroes, " + habitar() + "\n" +
				crearFuego() + "\n" + 
				detenerTiempo() + "\n" +
				volar();
	}
}
