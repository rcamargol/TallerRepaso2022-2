package co.edu.unbosque.model;

public class Superman extends Kryptoniano implements Volador{
	
	private String adn = "el ADN es dificil de clonar porque la ciencia humana no puede descifrarlo";
	
	public Superman() {
		super.tipoComida="de todo lo que se le atravesara";
		super.anosdevida=17;
	}

	@Override
	public String despegar() {
		return "Superman despega hacia arriba";
	}

	@Override
	public String aterrizar() {
		return "Superman no aterriza, cae con estilo";
	}

	@Override
	public String volar() {
		return "Superman vuela con sus cervezas encima";
	}

	@Override
	public String clonarADN() {
		return "Superman por ser un ser kryptoniano, "+adn;
	}

	@Override
	public String comer() {
		return "Superman por tener "+anosdevida+" a�os estaba en su plena adolecencia por lo cual comia "+tipoComida;
	}
	
	public String saltarEdificio() {
		return "Superman salta los edificios como una cabra loca";
	}
	
	public String pararBala() {
		return "Superman tiene superpoderes �eristicos que hasta puede parar una bala";
	}

	public String pasarMensaje() {
		
		String mensaje = despegar()+"\n"+
				   aterrizar()+"\n"+
				   volar()+"\n"+
				   saltarEdificio()+"\n"+
				   pararBala()+"\n"+
				   clonarADN()+"\n"+
				   comer();
		
		return mensaje;
	}
}
