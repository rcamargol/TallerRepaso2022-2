package co.edu.unbosque.model;

public class Telefono {
	
	private int telefono;
	
	public Telefono() {
		telefono = 0;
	}
	
	public String digitoTelefono() {
		String rta3 = "";
		if(telefono == 0) {
			rta3 = "de un bipolar.";
		}else if(telefono == 1) {
			rta3 = "de un asesino/a.";
		}else if(telefono == 2) {
			rta3 = "de un loco/a.";
		}else if(telefono == 3) {
			rta3 = "de un adicto/a a los memes.";
		}else if(telefono == 4) {
			rta3 = "de un soñador/a.";
		}else if(telefono == 5) {
			rta3 = "de un genio/a imcomprendido/a.";
		}else if(telefono == 6) {
			rta3 = "de un simbolo sexual.";
		}else if(telefono == 7) {
			rta3 = "de un alcoholico/a.";
		}else if(telefono == 8) {
			rta3 = "de un guerrero/a.";
		}else if(telefono == 9) {
			rta3 = "de un aventurero/a.";
		}else {
			rta3 = "";
		}
		return rta3;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
