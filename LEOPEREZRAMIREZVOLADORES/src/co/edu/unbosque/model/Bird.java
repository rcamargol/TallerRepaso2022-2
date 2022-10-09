package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "-Despuegue: Se lanzan desde la rama de un arbol, una roca o cualquier otro lugar elevado,"
				+"\n"+ " para ganar cierta velocidad, aprovechando la caida libre, e iniciar el vuelo de aleteo.";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "-Aterrizaje: consiste en darse la vuelta y descender con las alas al reves, generando "
				+"\n"+ "empuje hacia abajo.";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "-Vuelo: consiste en desplazarse con velocidad moviendo las alas y este es un modo "
				+"\n"+ "de vuelo que todas las aves voladoras practican.";
	}
	
	public String buildNest() {
		return "-Las aves construyen nidos donde puedan proteger a sus huevos y, a través del aporte "
				+"\n"+ "de calor (incubacion), regular su desarrollo.";
	}
	
	public String layEggs() {
		return "-Son considerados vertebrados oviparos ya que tienen la capacidad de poner huevos.";
	}
	
	public String eat() {
		return "-Alimentacion: las aves suelen comer trigo, arroz, maíz, cebada, avena, sorgo, coracán "
				+"\n"+ "y panizo de Daimiel o salvado de arroz y de otros granos.";
	}
}
