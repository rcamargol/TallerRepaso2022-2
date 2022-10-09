package co.edu.unbosque.model;

public class Helicopter extends Airplane {
	
	public Helicopter(String transporte, int numElices) {
		super(transporte, numElices);
		this.numElices = 1;
	}

	public String takeOff() {
		return "-Despegue: Un helicoptero tiene la posibilidad de despegar de forma vertical, de realizar"
				+"\n"+ "desplazamientos laterales y de ir hacia atras y hacia adelante. Ademas, tambien"
				+"\n"+ "puede permanecer en un solo punto en velocidad cero o vuelo estatico.";
	}
	
	public String fly() {
		return "-Vuelo: El rotor principal produce la fuerza para sustentarse y el empuje. Cuando las paletas "
				+"\n"+ "comienzan a girar, el aire hace presión contra ellas lo que permite el vuelo.";
	}
	
	public String land() {
		return "-Aterrizaje: Tiene la capacidad de aterrizar unicamente sobre tierra.";
	}


	@Override
	public String seePanoramic() {
		// TODO Auto-generated method stub
		return "-Vista Panoramica: Como no alcanza tanta altitud, entonces se puede contemplar mucho mas "
				+"\n"+ "la panoramica lo cual la hace mucho mas experiencial.";
	}
	
	
}

