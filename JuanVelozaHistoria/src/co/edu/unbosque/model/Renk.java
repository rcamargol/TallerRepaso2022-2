package co.edu.unbosque.model;

public class Renk extends Desterrados{

	private String ropas;
	private String maldición;
	
	public Renk() {
		super.edad = 1500;
		super.estatura = 2.10;
		super.colorojos = "Negros";
		super.alma = false;
		this.ropas = "tunica negra desgastada, y un par de sandalias blancas";
		this.maldición = "destinar a vivir solo por el resto de su vida a quien sea maldecido";
	}
	
	public String lanzarMaldicion() {
		return "Renk puede lanzar sobre alguien una maldicion que es: " + maldición ;
	}
	public String mirarRopa() {
		return "Renk posee una " + ropas + " , las cuales lleva cargando por mas de 1000 años";
	}
	
	@Override
	public String arrastrar() {
		return "El arrastarse de un lugar a otro le ah permitido a Renk encontrar una gran cantidad de tesoros abandonados y escondidos en el suelo";
	}

	@Override
	public String habitar() {
		return "Renk, al igual que los demas desterrados, solia habitar el extremo sur del planeta ";
	}

	@Override
	public String sentir() {
		return "Renk, solo es capaz de sentirse a el mismo, y no al resto de seres vivos";
	}

	
	public String getRopas() {
		return ropas;
	}

	public void setRopas(String ropas) {
		this.ropas = ropas;
	}

	public String getMaldición() {
		return maldición;
	}

	public void setMaldición(String maldición) {
		this.maldición = maldición;
	}

	@Override
	public String toString() {
		return "Edad: " + edad + " años" + "\n" +
				"Altura: " + estatura + " metros" + "\n" +
				"Color de ojos: " + colorojos + "\n"+
				"Renk posee un alma falsa, lo que quiere decir que es una persona impura y de mal corazon"  + "\n" + 
				habitar() + "\n"  +
				sentir() + "\n" +
				arrastrar() + "\n" +
				mirarRopa() + "\n" + "\n"+
				lanzarMaldicion(); 
	}

	
}
