package co.edu.unbosque.model;

public class SeaPlane extends Airplane {

	public SeaPlane(String transporte, int numElices) {
		super(transporte, numElices);
		this.numElices = 4;
	}

	public String takeOff() {
		return "-Despegue: Los hidroaviones realizan ascenso y descenso, el viraje de izquierda o derecha y "
				+"\n"+ "la guiñada movimiento del avión respecto del eje imaginario vertical que pasa por el "
				+"\n"+ "centro de gravedad de la aeronave)";
	}
	public String land() {
		return "-Acuatizaje: Tiene la capacidad de aterrizar sobre el agua y tambien en tierra";
	}
	
	public String fly() {
		// TODO Auto-generated method stub
		return "-Vuelo: En el hidroavion la sustentacion se genera por las alas cuando este avanza a traves "
				+"\n"+ "del aire y el empuje es generado por el motor.";
	}

	@Override
	public String seePanoramic() {
		// TODO Auto-generated method stub
		return "-Vista Panoramica: al viajar en hidroavión se viaja dentro de un habitáculo cerrado que aunque "
				+"\n"+ "permite ver las nubes y la panorámica desde el aire, no brinda los alcances sorprendentes";
	}
	
}
