package co.edu.unbosque.model;

public class Hidroavion extends Avion{

	private int capacidadAgua = 6000;
	
	public Hidroavion() {
		super.motor = "turbohelice";
		super.categoria = "hidrocanoas";
	}

	@Override
	public String despegar() {
		return "El hidroavion despega desde el agua";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "El hidroavion aterriza con suavena y pitillo";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "El hidroavion vuela porque tiene un motor " + motor;
	}

	@Override
	public String activarTrenDeAterrizaje() {
		// TODO Auto-generated method stub
		return "No falta el bobo que active el tren de aterrizaje sobre el agua";
	}

	@Override
	public String desplazarVehiculo() {
		// TODO Auto-generated method stub
		return "El Hidroavion alcanza una velocidad maxima 3200 km/h";
	}
	
	public String transportarAgua() {
		return "El hidroavion puede cargar "+ capacidadAgua +" litros de agua o en su efecto coca cola :)";
	}
	
	public String categorizar() {
		return "Los hidroaviones se categorizan por " +categoria+" e hidroaviones";
	}
	
	public String pasarMensaje() {
		String mensaje = despegar()+"\n"+
						 aterrizar()+"\n"+
						 volar()+"\n"+
						 activarTrenDeAterrizaje()+"\n"+
						 desplazarVehiculo()+"\n"+
						 transportarAgua()+"\n"+
						 categorizar();
		
		return mensaje;
	}
	
	
}
