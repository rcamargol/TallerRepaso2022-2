package co.edu.unbosque.model;

public class HidroAvion extends Avion{
	
	private String modeloTecnico;
	
	public HidroAvion(){
		super.velocidadMax= 170;
		super.tiempoVueloMax= 4;
		modeloTecnico = "hidroflotador";
	}
	
	public String especificarModelo() {
		String msj = "Este tipo de hidroavion por sus caracteristicas se le conoce como "+modeloTecnico+", supongo ha de ser de esos flotadores de piscina.";
		return msj;
	}

	@Override
	public String despegar() {
		String msj1 = "El hidroflotador despega de manera horizontal hasta poder elevarse, pero el que se termina elevando es el piloto y no con el avion precisamente.";
		return msj1;
	}

	@Override
	public String aterrizar() {
	    String msj2 = "El hidroflotador aterriza haciendo un descenso horizontal en la superficie acuatica, pero al piloto le gusta la vida marina asi que lo estampo vertical.";
		return msj2;
	}

	@Override
	public String volar() {
		String msj3 = "El hidroflotador puede volar a una altura maxima de 7000 metros, y debe tener cuidado cuando superman despegue.";
		return msj3;
	}

	@Override
	public String analizarTiempoVuelo() {
		String msj4 = "El hidroflotador al ser ligero puede volar por un tiempo de "+super.tiempoVueloMax+" horas maximo, al piloto le pagan por horas y no le quieren pagar de mas.";
		return msj4;
	}

	@Override
	public String subirVelocidad() {
		String msj5 = "El hidroflotador tiene la capcidad de volar a una velocidad maxima de "+super.velocidadMax+" kilometros por hora, el piloto respeta los velocimetros aereos.";
		return msj5;
	}
	
	public String generarInformacionHidroavion() {
		String msj6 = "****HIDROAVION****"+"\n"+
                "- "+especificarModelo()+"\n"+
			    "- "+despegar()+"\n"+
                "- "+aterrizar()+"\n"+
			    "- "+volar()+"\n"+
                "- "+analizarTiempoVuelo()+"\n"+
			    "- "+subirVelocidad();
	     return msj6;
	}

	

}
