package co.edu.unbosque.model;

import java.util.HashMap;
import java.util.Map;

public class UltimoDigitoTelefono {
	public Integer digito;
	public String desenlace;
	public HashMap<Integer, UltimoDigitoTelefono> lista = new HashMap<>();
	public String[] todosLosDigitos = new String[10];
	public UltimoDigitoTelefono(Integer digito, String desenlace) {
		super();
		this.digito = digito;
		this.desenlace = desenlace;
	}

	public UltimoDigitoTelefono() {
		super();
	}

	public Integer getDigito() {
		return digito;
	}

	public void setDigito(Integer digito) {
		this.digito = digito;
	}

	public String getDesenlace() {
		return desenlace;
	}

	public void setDesenlace(String desenlace) {
		this.desenlace = desenlace;
	}
	public void setAllDigitos() {
		lista.put(1, new UltimoDigitoTelefono(0, "DE UN/A BIPOLAR"));
		lista.put(2, new UltimoDigitoTelefono(1, "DE UN/A ASESINO/A"));
		lista.put(3, new UltimoDigitoTelefono(2, "DE UN/A LOCO/A"));
		lista.put(4, new UltimoDigitoTelefono(3, "DE UN/A ADICTO/A A LOS MEMES"));
		lista.put(5, new UltimoDigitoTelefono(4, "DE UN/A SOÑADOR/A"));
		lista.put(6, new UltimoDigitoTelefono(5, "DE UN/A GENIO INCOMPRENDIDO/A"));
		lista.put(7, new UltimoDigitoTelefono(6, "DE UN SIMBOLO SEXUAL"));
		lista.put(8, new UltimoDigitoTelefono(7, "DE UN/A ALCOHÓLICO/A"));
		lista.put(9, new UltimoDigitoTelefono(8, "DE UN/A GUERRERA"));
		lista.put(10, new UltimoDigitoTelefono(9, "DE UNA/A AVENTURO/A"));
		
		
	}
	public String[] getAllDigitos() {
		for (Map.Entry<Integer, UltimoDigitoTelefono> digito : lista.entrySet()) {
			UltimoDigitoTelefono tempDigito = digito.getValue();
			todosLosDigitos[digito.getKey() - 1] = tempDigito.getDigito().toString();
		}
		return todosLosDigitos;
	}
	public String findDesenlaceByDigito(String find) {
		for (Map.Entry<Integer, UltimoDigitoTelefono> digito : lista.entrySet()) {
			UltimoDigitoTelefono tempDigito = digito.getValue();
			if (find.equals(tempDigito.getDigito().toString())) {
				return tempDigito.getDesenlace();
			}
		}

		return "No existe el digito";
	}
}
