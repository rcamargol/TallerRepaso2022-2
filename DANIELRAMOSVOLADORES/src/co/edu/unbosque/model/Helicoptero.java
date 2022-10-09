package co.edu.unbosque.model;

public class Helicoptero extends Avion{
	
	private String ventaja = "Una de las ventajas del helicoptero es ingresar en zonas congestionadas a inaccesibles para los aviones";
	
	public Helicoptero() {
		super.categoria = "Existen los helicopteros militares y los civiles";
		super.motor = "turboeje";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "El helicoptero despega de manera vertical";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "El helicoptero aterriza hacia abajo";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Un helicoptero vuela por su motor "+motor+ "porque ni modos de que volara con la imaginacion";
	}

	@Override
	public String activarTrenDeAterrizaje() {
		// TODO Auto-generated method stub
		return "Hay que funar al que diga que necesita activar el tren de aterrizaje para aterrizar el helicoptero";
	}

	@Override
	public String desplazarVehiculo() {
		// TODO Auto-generated method stub
		return "El helicoptero no puede desplazarse a mas de 10000 metros de altura porque si no los tripulantes se petean";
	}
	
	public String reconocerVentajas() {
		return ventaja;
	}
	
	public String pasarMensaje() {
		String mensaje = despegar()+"\n"+
						 aterrizar()+"\n"+
						 volar()+"\n"+
						 activarTrenDeAterrizaje()+"\n"+
						 desplazarVehiculo()+"\n"+
						 reconocerVentajas();
		
		return mensaje;
	}

}
