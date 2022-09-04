package co.edu.unbosque.model;

import java.util.HashMap;
import java.util.Map;

public class MesNacimiento {
	public String mes;
	public String nudo;
	public HashMap<Integer, MesNacimiento> lista = new HashMap<>();
	public String[] todosLosMeses = new String[12];

	public MesNacimiento(String mes, String nudo) {
		super();
		this.mes = mes;
		this.nudo = nudo;
	}

	public MesNacimiento() {
		super();
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getNudo() {
		return nudo;
	}

	public void setNudo(String nudo) {
		this.nudo = nudo;
	}

	public String[] getAllMeses() {
		for (Map.Entry<Integer, MesNacimiento> mes : lista.entrySet()) {
			MesNacimiento tempMes = mes.getValue();
			todosLosMeses[mes.getKey() - 1] = tempMes.getMes();
		}
		return todosLosMeses;
	}

	public void setAllMeses() {
		lista.put(1, new MesNacimiento("enero", "HAZAÑA"));
		lista.put(2, new MesNacimiento("febrero", "REENCARNACIÓN"));
		lista.put(3, new MesNacimiento("marzo", "BATALLA"));
		lista.put(4, new MesNacimiento("abril", "EXISTENCIA"));
		lista.put(5, new MesNacimiento("mayo", "MUERTE"));
		lista.put(6, new MesNacimiento("junio", "MISIÓN"));
		lista.put(7, new MesNacimiento("julio", "VENGANZA"));
		lista.put(8, new MesNacimiento("agosto", "ANÉCDOTA"));
		lista.put(9, new MesNacimiento("septiembre", "VIDA"));
		lista.put(10, new MesNacimiento("octubre", "LEYENDA"));
		lista.put(11, new MesNacimiento("noviembre", "HISTORIA"));
		lista.put(12, new MesNacimiento("diciembre", "BIOGRAFÍA"));
	}

	public String findNudoByMes(String find) {
		for (Map.Entry<Integer, MesNacimiento> mesIterable : lista.entrySet()) {
			MesNacimiento tempMes = mesIterable.getValue();
			
			if (find == tempMes.getMes()) {
				return tempMes.getNudo();
			}
		}

		return "No existe el mes";
	}
}
