package co.edu.unbosque.model;

public class Hidroavion extends Aeroplano   {
	
	private String flotadores;
	
	public Hidroavion() {
		super.pasajeros = "Solo puede llevar dos pasajeros";
		super.capacidad = "Puede cargar  mas de 5000 litros de agua para varios usos";
		this.flotadores = "Tiene dos flotadores";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Puede aterrizar sobre el agua, sobre edificios y sobre la tangente de la curva ";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return flotadores +" y despega en tierra y agua";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Puede volar por pocos kilometros";
	}

	@Override
	public String estrellarseDondeSea() {
		// TODO Auto-generated method stub
		return "Si el monte no va por Maoma, Maoma se estrellara con el monte ";
	}

	@Override
	public String tragarCombustible() {
		// TODO Auto-generated method stub
		return "Traga menos combustible que un avion comercial";
	}
	public String regarAgua() {
		return capacidad;
	}
	
	public String cargarPasajeros() {
		return pasajeros;
		
	}
	@Override
	public String toString() {
		return "Hidroavion: "+ " \n" + despegar() +" \n" + volar()+ " \n" + aterrizar()+ " \n" + cargarPasajeros() +"\n" +tragarCombustible()+ "\n" +estrellarseDondeSea()+" \n" + regarAgua()+" ";
	}

}
