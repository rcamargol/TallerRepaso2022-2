package co.edu.unbosque.model;

public class NoPuedeTenerMasHijos extends Exception {
	
	public NoPuedeTenerMasHijos(String msg) {
		msg = "Ya tiene muchos hijos,utilice Today";
	}
}
