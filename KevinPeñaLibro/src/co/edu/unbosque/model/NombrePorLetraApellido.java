package co.edu.unbosque.model;

public class NombrePorLetraApellido {

	private String letra;
	private String dato01;
	
	public NombrePorLetraApellido () {
		
		letra = "";
		dato01 = "";
		
	}
	
	public String evaluarApellido () {
		switch (letra) {
		case "A":
			dato01="LA VERDADERA ";
			break;
		case "B":
			dato01="LA EXCITANTE ";
			break;
		case "C":
			dato01="LA HORRIPILANTE ";
			break;
		case "D":
			dato01="LA ALEGRE ";
			break;
		case "E":
			dato01="LA FATAL ";
			break;
		case "F":
			dato01="LA APASIONANTE ";
			break;
		case "G":
			dato01="LA TRÁGICA ";
			break;
		case "H":
			dato01="LA SANGRIENTA ";
			break;
		case "I":
			dato01="LA FAMOSA ";
			break;
		case "J":
			dato01="LA GRAN ";
			break;
		case "K":
			dato01="LA PENOSA ";
			break;
		case "L":
			dato01="LA TRISTE ";
			break;
		case "M":
			dato01="LA DESASTROSA ";
			break;
		case "N":
			dato01="LA HERMOSA ";
			break;
		case "O":
			dato01="LA OSCURA ";
			break;
		case "P":
			dato01="LA GLORIOSA ";
			break;
		case "Q":
			dato01="LA INFELIZ ";
			break;
		case "R":
			dato01="LA EMOCIONANTE ";
			break;
		case "S":
			dato01="LA FANTÁSTICA ";
			break;
		case "T":
			dato01="LA TERRORÍFICA ";
			break;
		case "U":
			dato01="LA ABURRIDA ";
			break;
		case "V":
			dato01="LA INCREÍBLE ";
			break;
		case "W":
			dato01="LA DESGRACIADA ";
			break;
		case "X":
			dato01="LA LAMENTABLE ";
			break;
		case "Y":
			dato01="LA CÓMICA ";
			break;
		case "Z":
			dato01="LA MISERABLE ";
			break;
		}
		
		return dato01;
		
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}
	
}
