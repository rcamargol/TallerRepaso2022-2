package co.edu.unbosque.model;

import java.util.Iterator;

public class Datos {
	private String[] letras;
	private String[] meses;
	private String[] numero;

	public Datos() {
		letras = new String[26];
		letras[0] = "LA VERDADERA";
		letras[1] = "LA EXCITANTE";
		letras[2] = "LA HORRIPILANTE";
		letras[3] = "LA ALEGRE";
		letras[4] = "LA FATAL";
		letras[5] = "LA APASIONANTE";
		letras[6] = "LA TRAGICA";
		letras[7] = "LA SANGRIENTA";
		letras[8] = "LA FAMOSA";
		letras[9] = "LA GRAN";
		letras[10] = "LA PENOSA";
		letras[11] = "LA TRISTE";
		letras[12] = "LA DESASTROSA";
		letras[13] = "LA HERMOSA";
		letras[14] = "LA OSCURA";
		letras[15] = "LA GLORIOSA";
		letras[16] = "LA INFELIZ";
		letras[17] = "LA EMOCIONANTE";
		letras[18] = "LA FANTASTICA";
		letras[19] = "LA TERRORIFICA";
		letras[20] = "LA ABURRIDA";
		letras[21] = "LA INCREIBLE";
		letras[22] = "LA DESGRACIADA";
		letras[23] = "LA LAMENTABLE";
		letras[24] = "LA COMICA";
		letras[25] = "LA MISERABLE";

		meses = new String[12];
		meses[0] = "HAZAÑA";
		meses[1] = "REENCARNACION";
		meses[2] = "BATALLA";
		meses[3] = "EXISTENCIA";
		meses[4] = "MUERTE";
		meses[5] = "MISION";
		meses[6] = "VENGANZA";
		meses[7] = "ANECDOTA";
		meses[8] = "VIDA";
		meses[9] = "LEYENDA";
		meses[10] = "HISTORIA";
		meses[11] = "BIOGRAFIA";

		numero = new String[10];
		numero[0] = "DE UN BIPOLAR";
		numero[1] = "DE UN ASESINO";
		numero[2] = "DE UN LOCO";
		numero[3] = "DE UN ADICTO A LOS MEMES";
		numero[4] = "DE UN SOÑADOR";
		numero[5] = "DE UN GENIO INCOMPRENDIDO";
		numero[6] = "DE UN SIMBOO SEXUAL";
		numero[7] = "DE UN ALCOHOLICO";
		numero[8] = "DE UN GUERRERO";
		numero[9] = "DE UN AVENTURERO";
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String[] getMeses() {
		return meses;
	}

	public void setMeses(String[] meses) {
		this.meses = meses;
	}

	public String[] getNumero() {
		return numero;
	}

	public void setNumero(String[] numero) {
		this.numero = numero;
	}
	
}
