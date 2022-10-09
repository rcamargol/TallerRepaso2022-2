package co.edu.unbosque.Model;

public class Superman extends Kriptoniano implements Volador{

	private double estatura;
	
	public Superman() {
	super.corazon = true;
	super.indestructible = "Mi cuerpo es indestructible";
	this.estatura = 1.87;
	}
	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Para volar tengo que despegar "
				+ "pero cuando despego hago tanta fuerza que dejo grietas en el suelo";
	}
	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Cuando aterrizo creo hondas sonicas del golpe en suelo"
				+ " asi que ten cuidado si aterrizo cerca tuyo :)";
	}
	String detenerBalas() {
		// TODO Auto-generated method stub
		return "Mi piel es impenetrable, lo que me permite detener las balas con mi cuerpo ";
	}
	String saltarEdificios() {
		// TODO Auto-generated method stub
		return "Tengo tanta fuerza que puedo saltar edificios con mis piernas "
				+ "tambien puedo saltar de estos hacia el suelo sin hacerme daño";
	}

	@Override
	String comer() {
		// TODO Auto-generated method stub
		return "Como todos los animales y seres vivos necesito "
				+ "comer para sobrevivir, eso si, como demasiado :p ";
	}

	@Override
	String lanzarRayosLaser() {
		// TODO Auto-generated method stub
		return "Puedo lanzar rayos laser de mis ojos capaces de cortar los materiales mas duros";
	}
	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Puedo volar a la velocidad del sonido";
	}
		
	
	public String descSuperman() {
		return "Soy superman, mido "+estatura+  " metros un heroe que tiene un corazon puro" + "\n" +
				"Yo soy el ultimo descendiente de Kripton, mi planeta natal"
				+ "debido a esto tengo habilidades especiales que los humanos no tienen"  + "\n" + 
				volar()+ "\n" +
				despegar() + "\n"  +
				aterrizar() + "\n"  +
				lanzarRayosLaser() + "\n"  +
				saltarEdificios() + "\n"  +
				detenerBalas() + "\n"  +
				indestructible+ "\n"  +
				comer();
				 

}
}