package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {
	private boolean pico;
	
	public Bird() {
		super.wings = true;
		this.pico = true;
	}

	@Override
	public String takeOff() {
		return "Puedo despegar al intentar volar\n";
	}

	@Override
	public String land() {
		return "Puedo aterrizar para darle de comer a mis polluelos\n";
	}

	@Override
	public String fly() {
		return "Puedo volar para emigrar o en busca de alimento\n";
	}

	@Override
	public String eat() {
		return "Suelo comer semillas, frutas o insectos, pero me encanta comer lombrices\n";
	}
	
	public String buildNest() {
		return "Puedo hacer un nido con ramas de arboles\n";
	}
	
	public String layEggs() {
		return"Puedo poner huevos para que posteriormente nazcan mis polluelos\n";
	}

	public String trinar() {
		return "Puedo trinar haciendo sonidos exóticos y agradables\n";
	}

	public boolean isPico() {
		return pico;
	}

	public void setPico(boolean pico) {
		this.pico = pico;
	}
}
