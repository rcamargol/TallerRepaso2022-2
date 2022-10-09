package co.edu.unbosque.model;

public class Pajaro extends Animal implements Volador{
	
	private String cantidaddehuevos = "en promedio de 2-5 huevos";
	
	public Pajaro() {
		super.tipoComida="Semillas e insectos";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "El pajaro despega de su nido en busca de alimento";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "El pajaro padre aterriza en el nido con gusanitos para sus hijos";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Los pajaros aprenden a volar en tan solo 12 dias";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Los pajaros comen "+tipoComida+ " porque no hay plata pa mas, la economia esta dura hasta para los pajaros";
	}
	
	public String construirNido() {
		return "Los pajaros son tremendos arquitectos construyendos sus nidos,¿De que universidad son egresados?";
	}
	
	public String ponerHuevos() {
		return "Los pajaros ponen "+cantidaddehuevos;
	}
	
	public String aprenderAVolar() {
		return "Los pajaros son una pepas cuando se trata de volar, pues en 12 dias ya son habiles en el vuelo";
	}
	
	public String pasarMensaje() {
		String mensaje = despegar()+"\n"+
				   aterrizar()+"\n"+
				   volar()+"\n"+
				   construirNido()+"\n"+
				   aprenderAVolar()+"\n"+
				   comer();
		
		return mensaje;
	}
}
