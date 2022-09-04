package co.edu.unbosque.model;

import java.util.HashMap;
import java.util.Map;

public class LetraPrimerApellido {
	public String letra;
	public String inicio;
	public HashMap<Integer, LetraPrimerApellido> lista = new HashMap<>();
	public String[] todasLasLetras = new String[26];

	public LetraPrimerApellido(String letra, String inicio) {
		super();
		this.letra = letra;
		this.inicio = inicio;
	}

	public LetraPrimerApellido() {
		super();
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public void setAllLetras() {
		lista.put(1, new LetraPrimerApellido("A", "LA VERDADERA"));
		lista.put(2, new LetraPrimerApellido("B", "LA EXITANTE"));
		lista.put(3, new LetraPrimerApellido("C", "LA HORRIPILANTE"));
		lista.put(4, new LetraPrimerApellido("D", "LA ALEGRE"));
		lista.put(5, new LetraPrimerApellido("E", "LA FATAL"));
		lista.put(6, new LetraPrimerApellido("F", "LA APASIONANTE"));
		lista.put(7, new LetraPrimerApellido("G", "LA TRÁGICA"));
		lista.put(8, new LetraPrimerApellido("H", "LA SANGRIENTA"));
		lista.put(9, new LetraPrimerApellido("I", "LA FAMOSA"));
		lista.put(10, new LetraPrimerApellido("J", "LA GRAN"));
		lista.put(11, new LetraPrimerApellido("K", "LA PENOSA"));
		lista.put(12, new LetraPrimerApellido("L", "LA TRISTE"));
		lista.put(13, new LetraPrimerApellido("M", "LA DESASTROSA"));
		lista.put(14, new LetraPrimerApellido("N", "LA HERMOSA"));
		lista.put(15, new LetraPrimerApellido("O", "LA OSCURA"));
		lista.put(16, new LetraPrimerApellido("P", "LA GLORIOSA"));
		lista.put(17, new LetraPrimerApellido("Q", "LA INFELIZ"));
		lista.put(18, new LetraPrimerApellido("R", "LA EMOCIONANTE"));
		lista.put(19, new LetraPrimerApellido("S", "LA FANTÁSTICA"));
		lista.put(20, new LetraPrimerApellido("T", "LA TERRORÍFICA"));
		lista.put(21, new LetraPrimerApellido("U", "LA ABURRIDA"));
		lista.put(22, new LetraPrimerApellido("V", "LA INCREÍBLE"));
		lista.put(23, new LetraPrimerApellido("W", "LA DESGRACIADA"));
		lista.put(24, new LetraPrimerApellido("X", "LA LAMENTABLE"));
		lista.put(25, new LetraPrimerApellido("Y", "LA CÓMICA"));
		lista.put(26, new LetraPrimerApellido("Z", "LA MISERABLE"));
		
	}

	public String[] getAllLetras() {
		for (Map.Entry<Integer, LetraPrimerApellido> letra : lista.entrySet()) {
			LetraPrimerApellido tempLetra = letra.getValue();
			todasLasLetras[letra.getKey() - 1] = tempLetra.getLetra();
		}
		return todasLasLetras;
	}

	public String findInicioByLetra(String find) {
		for (Map.Entry<Integer, LetraPrimerApellido> letra : lista.entrySet()) {
			LetraPrimerApellido tempLetra = letra.getValue();
			if (find == tempLetra.getLetra()) {
				return tempLetra.getInicio();
			}
		}

		return "No existe la letra";
	}

}
