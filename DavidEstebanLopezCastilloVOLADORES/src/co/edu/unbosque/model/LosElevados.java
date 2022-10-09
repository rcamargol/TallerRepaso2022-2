package co.edu.unbosque.model;

public class LosElevados {
	
	private Superman superman;
	private Pajaro pajaro;
	private Helicoptero helicoptero;
	private HidroAvion hidroavion;
	
	public LosElevados() {
		superman = new Superman();
		pajaro = new Pajaro();
		helicoptero = new Helicoptero();
		hidroavion = new HidroAvion();
	}
	
	public String unirTodaInformacion() {
		String informacion = superman.generarInformacionSuperman()+"\n"+"\n"+
	                         pajaro.generarInformacionPajaro()+"\n"+"\n"+
				             helicoptero.generarInformacionHelicoptero()+"\n"+"\n"+
	                         hidroavion.generarInformacionHidroavion();
		return informacion;
	}

}
