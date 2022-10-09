package co.edu.unbosque.model;

public class Renk extends Desterrados{
	
	private String venganza;
	private String rencor;
	
	public Renk() throws ExceptionNoseQuePaso {
		venganza = "Planean destruir lo que Kublakan creo.";
		rencor = "Sienten odio por Kublakan.";
		animo = "Son los mas tristes.";
		moverse = "Se mueven arrastrandose";
		edad = 1500;
		estatura = "1 metros.";
		colorDeOjos = "Negros";
		alma = true;
	}
	public String liderar() {
		return "Lideran un ejercito contra los heroes y los mortales";
	}
	public String pelear() {
		return "Se preparan para pelear";
	}
	@Override
	String querer() {
		// TODO Auto-generated method stub
		return "Nadie los quiere";
	}
	@Override
	boolean comer() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	String habitar() {
		// TODO Auto-generated method stub
		return "Al extremo sur";
	}
	@Override
	String sentir() {
		// TODO Auto-generated method stub
		return "No sienten a nadie mas que a ellos mismos";
	}
	
	public String desterrados () {
		return "Edad: " + edad +" años." + "\n" + "Estatura: " + estatura + "\n" + "Color de ojos: "+ colorDeOjos + "\n"
				+"Alma: " + alma + "\n"+"Habitan: " + habitar() + "\n"+ "Sienten:" + sentir() + "\n"+ "Animo: "+ animo + "\n"+"Moverse: "+ moverse+ "\n"
				+"Querer: "+querer() + "\n"+ "Comer: " + comer();
	}
	public String Renk () {
		return "Nombre: Renk " +"\n"+ "Edad: " + edad +" años." + "\n" + "Estatura: " + estatura + "\n" + "Color de ojos: "+ colorDeOjos + "\n"
				+"Alma: " + alma + "\n"+"Habitan: " + habitar() + "\n"+ "Sienten: " + sentir() + "\n"+ "Animo: "+ animo + "\n"+"Moverse: "+ moverse+ "\n"
				+"Querer: "+querer() + "\n"+ "Comer: " + comer() + "\n"+ "Venganza: " + this.venganza + "\n"+ "Rencor: "+this.rencor + "\n"+ 
				"Liderar: "+ liderar()+ "\n" + "Pelear: " + pelear();
	}

}
