package co.edu.unbosque.model;

public class SeaPlane extends Airplane {

	
	private String distanciaRecorrida;
	
	public SeaPlane() {
		super.gasolina = "avtur";
		super.tamañoDeHelices = 3;
		this.distanciaRecorrida = "500";
	}
	
	@Override
	public String movilizarCargamento() {
		return "desplazar personas y cargamentos.";
	}
	
	@Override
	public String toFly() {
		return "Son uno de los aviones mas rapidos y estables al volar.";
	}
	
	@Override
	public String toLand() {
		return "despegar desde el agua.";
	}
	
	@Override
	public String toTakeOff() {
		return "aterrizar en el agua.";
	}

	@Override
	public String toString() {
		return "El hidroavion es uno de los aviones mas innovadores de los ultimos años."+"\n"+
				"Para poder funcionar usa como gasolina "+super.gasolina+"\n"+
				"El tamaño de sus helices es de "+super.tamañoDeHelices+" metros."+"\n"+
				"La distancia que se ha recorrido es de "+distanciaRecorrida+" km."+"\n"+
				"Se usan para "+movilizarCargamento()+"\n"+
				toFly()+"\n"+
				"Pueden "+toLand()+"\n"+
				"Pueden "+toTakeOff();
	}
	
	public String getDistanciaRecorrida() {
		return distanciaRecorrida;
	}
	public void setDistanciaRecorrida(String distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}
}
