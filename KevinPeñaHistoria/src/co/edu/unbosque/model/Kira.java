package co.edu.unbosque.model;

public class Kira extends Heroes{

	private String belleza;
	private String llamativa;
	
	public Kira() {
		edad = 748;
		estatura = "3 metros.";
		colorDeOjos = "Azules.";
		colorDeFuego = "Verde.";
		poderEspecial = "Predecir el futuro.";
		alma = true;
		this.belleza = "Tiene una belleza inigualable.";
		this.llamativa = "No la puedes olvidar cuando la veas.";
		
	}
	public String proteger() {
		return "El mundo de lunes a viernes.";
		
	}
	
	public String celebrar() {
		return "Sus victorias durante dos meses.";
		
	}
	@Override
	String crearFuego() {
		// TODO Auto-generated method stub
		return "Crear fuego ilimitado.";
	}
	@Override
	String volarPorLosAires() {
		// TODO Auto-generated method stub
		return "Volar durante 5 segundos y tiene un tiempo de espera de 10 segundos.";
	}
	@Override
	String habitar() {
		// TODO Auto-generated method stub
		return "Al norte.";
	}
	@Override
	String sentir() {
		// TODO Auto-generated method stub
		return "A los demas heroes y a los demas seres del mundo.";
	}
	@Override
	String detenerTiempo() {
		// TODO Auto-generated method stub
		return "Solo pueden detener el tiempo una vez al mes";
	}
	public String heroes() {
		return "Edad: " + edad +" años." + "\n" + "Estatura: " + estatura + "\n" + "Color de ojos: "+ colorDeOjos + "\n"
				+"Alma: " + alma +"\n"+"Habitan: " + habitar() +"\n"+ "Sienten: " + sentir() +"\n"+ "Color de fuego: " +  colorDeFuego + "\n" + "Poder especial: "+ poderEspecial+ "\n"
				+"Crear fuego: " + crearFuego() + "\n"+ "Volar por los aires: " + volarPorLosAires() + "\n" + "Detener el tiempo: " + detenerTiempo();
	}
	
	public String kira() {
		return "Nombre: Kira" + "\n"+ "Edad: " + "1623" +" años." + "\n" + "Estatura: " + estatura + "\n" + "Color de ojos: "+ colorDeOjos + "\n"
				+"Alma: " + alma +"\n"+"Habitan: " + habitar() + "\n"+ "Sienten: " + sentir() + "\n"+ "Color de fuego: " +  colorDeFuego + "\n" + "Poder especial: "+ poderEspecial+ "\n"
				+"Crear fuego: " + crearFuego() + "\n"+ "Volar por los aires: " + volarPorLosAires() + "\n" + "Detener el tiempo: " + detenerTiempo()+ "\n"+ "Belleza: " + this.belleza+ "\n"
				+ "Llamativa: " + this.llamativa + "\n"+ "Protege: " + proteger() + "\n"+  "Celebra: " + celebrar();
	}

	
}
