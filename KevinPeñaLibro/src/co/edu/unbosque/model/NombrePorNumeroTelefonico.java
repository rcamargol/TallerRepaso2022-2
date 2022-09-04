package co.edu.unbosque.model;

public class NombrePorNumeroTelefonico {
	private String dato03;
	private String numero;
	
	public NombrePorNumeroTelefonico() {
		dato03 = "";
		numero = "";
	}
	
	public String evaluarNtelefono() {
		switch (numero) {
		case "0":
			dato03 ="DE UN BIPOLAR";
			break;
		case "1":
			dato03 ="DE UN ASESINO/A";
			break;
		case "2":
			dato03 ="DE UN LOCO/A";
			break;
		case "3":
			dato03 ="DE UN ADICTO/A A LOS MEMES";
			break;
		case "4":
			dato03 ="DE UN SOÑADOR/A";
			break;
		case "5":
			dato03 ="DE UN GENIO/A INCOMPRENDIDO/A";
			break;
		case "6":
			dato03 ="DE UN SÍMBOLO SEXUAL";
			break;
		case "7":
			dato03 ="DE UN ALCOHÓLICO/A";
			break;
		case "8":
			dato03 ="DE UN GUERRERO/A";
			break;
		case "9":
			dato03 ="DE UN AVENTURERO/A";
			break;
		}
		return dato03;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
