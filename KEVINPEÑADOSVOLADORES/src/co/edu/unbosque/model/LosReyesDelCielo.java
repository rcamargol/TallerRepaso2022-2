package co.edu.unbosque.model;

public class LosReyesDelCielo {
	
	private Aves aves;
	private Helicoptero heli;
	private Hidroavion hidro;
	private Superman man;
	
	public LosReyesDelCielo() {
		aves = new Aves();
		heli = new Helicoptero();
		hidro = new Hidroavion();
		man = new Superman();
	}
	
	public String recibirMsgAves() {
		return aves.escribirMensajeAves();
	}
	public String recibirMsgHelicoptero() {
		return heli.escribirMsgHelicoptero();
	}
	public String recibirMsgHidroavion() {
		return hidro.escribirMsgHidroavion();
	}
	public String recibirMsgSuperman() {
		return man.escribirMsgSuperman();
	}

}
