package co.edu.unbosque.model;

public class Helicopter extends Airplane {

	private double velocidadMaxima;
	
	public Helicopter() {
		super.gasolina = "jet fuel";
		super.tamañoDeHelices = 4;
		this.velocidadMaxima = 278;
	}

	@Override
	public String toFly() {
		return "Son unos de los vehiculos mas estables al momento de volar.";
	}
	
	@Override
	public String toLand() {
		return "aterrizan verticalmente.";
	}

	@Override
	public String toTakeOff() {
		return "Se necesita estabilidad al despegar";
	}

	@Override
	public String movilizarCargamento() {
		return "desplazar mercancia y tambien a personas.";
	}
	
	@Override
	public String toString() {
		return "El helicoptero es uno de los medios de transporte mas importantes, hoy en dia."+"\n"+
				"Para poder funcionar usan como gasolina "+super.gasolina+"\n"+
				"Ademas el tamaño de sus helices es de "+super.tamañoDeHelices+" metros."+"\n"+
				"La velocidad maxima que puede alcanzar es de "+velocidadMaxima+" km/h."+"\n"+
				"Usualmente los helicopteros "+toLand()+"\n"+
				toTakeOff()+" para evitar que empice a dar vueltas."+"\n"+
				"Sirven para "+movilizarCargamento()+"\n"+
				toFly();
	}
	
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

}
