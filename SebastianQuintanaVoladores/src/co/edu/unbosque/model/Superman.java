package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{
private String liderazgo;
	
	public Superman() {
		super.fuerza = "interplanetaria";
		super.puntoDebil = "Kriptonita";
		this.liderazgo = " compite con batman por el liderazgo de la liga de la justicia";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Superman puede despegar desde cualquer superficie solida";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "A travez de los años Superman a perfeccionado su aterrizaje, la primera vez que lo hizo dejo un crater en el suelo";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Superman puede volar a la velocidad de la luz , puede darle mas de 5 vueltas al mundo en un segundo";
	}

	@Override
	public String lanzarLaser() {
		// TODO Auto-generated method stub
		return "Superman puede lanzar un laser por sus ojos que puede alcanzar una temperatura de dos soles nacientes";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Superman Come su proteina que lo mantiene muy fuerte, en su dieta va incluida una buena ballena";
	}
	public String saltarEdificios() {
		return "Superman es capas de saltar desde los edificios nas altos sin temoe a estrellarce contra el suelo, gracias a que puede volar";
	}
	public String pararBalas() {
		return "Superman es capas de parar balas con su cuerpo, porque el es lo mas recistente del planeta , por eso le dicen el hombre de acero";
	}
	
		@Override
	public String toString() {
		return "Fuerza: " + fuerza + "\n" +"Punto debil: "+puntoDebil+ "\n" +
				"Liderazgo: " + liderazgo  + "\n" +
				despegar() + "\n" + 
				aterrizar() + "\n"  +
				volar() + "\n"  +
				lanzarLaser() + "\n" + 
				 comer() + "\n"+
				 saltarEdificios()+"\n"+
				 pararBalas()+ "\n";
	}
}
