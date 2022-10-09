package co.edu.unbosque.model;

public class Superman extends Kryptoniano implements Volador{
	
	private String amor;
	
	public Superman() {
		amor = "Es asesinada por el Guason.";
		pelaje = "Tiene pelo en la cabeza, de resto es de acero.";
		especie = "De la especie de Superman solo quedan 100.000 vivos.";
	}
	
	public String venganza() {
		return "Mata al Guazon y empieza a matar a todos los criminales que se encuentra.";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Puede despegar cuando hay sol.";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Rompe todo a su alrededor cuando aterriza.";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Tiene que recargar energia solar para podel volar.";
	}

	@Override
	public String recorrerDistancia() {
		// TODO Auto-generated method stub
		return "Puede ir donde quiera, pero en el espacio se vuelve mas lento.";
	}

	@Override
	public String adquirirPoderes() {
		// TODO Auto-generated method stub
		return "Obtiene poderes mediante el sol.";
	}
	
	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Come solo borojo y la espinaca de Popeye el marino.";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "Duerme de noche en la fortaleza de la soledad porque no quieren que lo jodan.";
	}
	
	public String saltarEdificios() {
		return "El no salta edificios, los atraviesa.";
	}
	
	public String detenerBala() {
		return "No solo detiene la bala, sino que tambien se las devuelve.";
	}
	
	public String escribirMsgSuperman() {
		return " -Pelaje: " + pelaje + "\n" +  " -Amor (pareja): " + amor + "\n" + " -Especie: " + especie + "\n"
			  +" -Venganza: " + venganza() + "\n" +  " -Despegar: " + despegar() + "\n" + " -Aterrizar: " + aterrizar() + "\n"
			  +" -Volar: " + volar() + "\n" +  " -Recorrer distancia: " + recorrerDistancia()  + "\n" + " -Adquirir poderes: " + adquirirPoderes()
			  +"\n" + " -Comer: " + comer() + "\n" + " -Dormir" + dormir() +"\n" + " -Saltar edificios: " + saltarEdificios()
			  +"\n" + " -Detener bala: " + detenerBala();

	}

}
