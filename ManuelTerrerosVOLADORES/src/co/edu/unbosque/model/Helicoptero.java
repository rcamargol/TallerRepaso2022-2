package co.edu.unbosque.model;

public class Helicoptero extends Aeroplano  {
	
	private String resistencia;
	
	public Helicoptero() {
		this.resistencia = "Resiste balas para repeler los ataques terroristas contra mi lord Petrosky";
		super.capacidad = "Tiene la capacidad de 673 litros de combustible";
		super.pasajeros = "Pueden llevar hasta 20 personas";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Puede aterrizar sobre edificios, en tierra firme y en medio de tiroteos";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Despega por donde el Presidente y/o dueño lo ordene";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Vuela por donde la luz es capaz de llegar";
	}

	@Override
	public String estrellarseDondeSea() {
		// TODO Auto-generated method stub
		return "Se usa hasta para tumbar edificios ";
	}

	@Override
	public String tragarCombustible() {
		// TODO Auto-generated method stub
		return capacidad;
	}
	
	public String protegerImpotantes() {
		return resistencia;
	}
	
	@Override
	String cargarPasajeros() {
		// TODO Auto-generated method stub
		return pasajeros;
	}
	@Override
	public String toString() {
		return "Helicoptero: "+ " \n" + despegar() +" \n" + volar()+ " \n" + aterrizar()+ " \n" + cargarPasajeros() +"\n" +tragarCombustible()+ "\n" +estrellarseDondeSea()+" \n" + protegerImpotantes()+" \n" + cargarPasajeros()+"";
	}



}
