package co.edu.unbosque.model;

public class Astar extends Heroes{
	
	private String arma;
	private String tipo;

	public Astar() {
		edad = 5000;
		estatura = "3 metros.";
		colorDeOjos = "Azules";
		colorDeFuego = "Verde";
		poderEspecial = "Predecir el futuro";
		alma = true;
		this.arma = "Usa una Espada gancho ceremonial";
		this.tipo = "Espadachín";
	}
	public String entrenar() {
		return "todos los dias.";
		
	}
	
	public String enseñar() {
		return "Enseña a pelear a la nueva generacion de heroes.";
		
	}
	@Override
	String crearFuego() {
		// TODO Auto-generated method stub
		return "Crear fuego ilimitado";
	}
	@Override
	String volarPorLosAires() {
		// TODO Auto-generated method stub
		return "Volar durante 5 segundos y tiene un tiempo de espera de 10 segundos";
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
	
	public String Astar() {
		return "Nombre: Astar" +"\n"+ "Edad: " + "4560" +" años." + "\n" + "Estatura: " + estatura + "\n" + "Color de ojos: "+ colorDeOjos + "\n"
				+"Alma: " + alma + "\n"+"Habitan: " + habitar() + "\n"+ "Sienten: " + sentir() + "\n"+ "Color de fuego: " +  colorDeFuego + "\n" + "Poder especial: "+ poderEspecial+ "\n"
				+"Crear fuego: " + crearFuego() +"\n"+ "Volar por los aires: " + volarPorLosAires() + "\n" + "Detener el tiempo: " + detenerTiempo()+"\n"+ "Arma: " + this.arma +"\n"
				+ "Tipo: " + this.tipo + "\n"+ "Entrena: " + entrenar() + "\n"+  "Enseña: " + enseñar();
	}


}
