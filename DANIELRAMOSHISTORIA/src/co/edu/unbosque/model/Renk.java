package co.edu.unbosque.model;

public class Renk extends Desterrados{
	
	private String contextura, expresionafectiva;

	public Renk(String contextura, String expresionafectiva) {
		super.edad = 25;
		super.estatura = 1.55;
		super.colordeojos = "azules";
		super.alma = "falsa";
		super.añosdevida = 1500;
		super.rangodetristeza = 10;
		this.contextura = "Gorda";
		this.expresionafectiva = "Negativa";
	}

	@Override
	public String habitar() {
		return "Habita en el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		return "No siente a nadie mas que a el mismo";
	}
	
	@Override
	public String arrastrar() {
		return "Se arrastra de un lugar a otro";
	}

	@Override
	public String ejecutarVenganza() {
		return "Ejecuta venganza sobre Kublakan por rechazarlo";
	}
	
	public String dormir() {
		return "duerme para descansar";
	}
	
	public String llorar() {
		return "llora para desahogar sus tristezas";
	}
	
	public String intervalarEstatura() throws EstaturaException{
		
		if (super.estatura >= 1.75) {
			throw new EstaturaException("El panita es alto");
		}
		
		else if (super.estatura >= 1.60 && super.estatura < 1.75) {
			throw new EstaturaException("El panita es de altura media");
		}
		
		else {
			throw new EstaturaException("El panita es bajito");
		}
	}
	
	public String recomendarSegunContextura() throws ContexturaException{
		
		if (this.contextura == "Flaca") {
			throw new ContexturaException("Hay que comer mas, ¡PILAS!");
		}
		
		else if (this.contextura == "Gorda") {
			throw new ContexturaException("Yo de usted voy inscribiendome al Boditech");
		}
		
		return "";
	}
	
	@Override
	public String toString() {
		return "RENK...\n"+
				"\n"+
				"CARACTERISTICAS.................\n"+
				"La edad es: " + super.edad + "\n"+
				"La estatura es: " + super.estatura + " metros\n"+
				"El color de ojos es: " + super.colordeojos +"\n"+
				"El alma es: " + super.alma + "\n"+
				"Vive: " + super.añosdevida +" años\n"+
				"El rango de tristeza del 1 a 10 es: " + super.rangodetristeza + "\n"+
				"La contextura de su cuerpo es: " + this.contextura +"\n"+
				"Por su tristeza la expresion afectiva es: " + this.expresionafectiva +"\n"+
				"\n"+
				"INFORMACION DE LOS DESTERRADOS.................\n";
	}
}