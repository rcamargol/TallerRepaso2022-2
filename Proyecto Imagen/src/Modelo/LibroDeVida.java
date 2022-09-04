package Modelo;

import java.util.Iterator;

public class LibroDeVida {
	
	private char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private String[] abecedarioRespuesta = {"La verdadera", "la excitante", "la horripilante", "la alegre", "la fatal", "la apacionante", "la tragica", "la sangrienta", "la famosa", "la gran", "la penosa ", "la triste", "la desastrosa", "la hermosa", "la oscura", "la gloriosa", "la infeliz", "la emocionante", "la fantastica", "la terrorifica", "la aburrida", "la increible", "la desgraciada", "la lamentable", "la comica", "la miserable"};
	private String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	private String[] mesRespuesta = {"hazaña", "reencarnacion", "batalla", "existencia", "muerte", "mision", "venganza", "anecdota", "vida", "leyenda", "historia", "biografia"};
	private int[] telefono = {0,1,2,3,4,5,6,7,8,9};
	private String[] telefonoRespuesta = {"de un bipolar","de un asesino/a","de un loco/a","de un adicto/a a los memes","de un soñador/a","de un genio/a incomprendido/a","de un simbolo sexual","de un alcoholico/a","de un guerrero/a","de un aventurero/a"};
	
	public LibroDeVida(char[] abecedario, String[] mes, int[] telefono) {
		this.abecedario = abecedario;
		this.mes = mes;
		this.telefono = telefono;
	}
	
	public LibroDeVida() {}

	public char[] getAbecedario() {
		return abecedario;
	}

	public void setAbecedario(char[] abecedario) {
		this.abecedario = abecedario;
	}

	public String[] getMes() {
		return mes;
	}

	public void setMes(String[] mes) {
		this.mes = mes;
	}

	public int[] getTelefono() {
		return telefono;
	}

	public void setTelefono(int[] telefono) {
		this.telefono = telefono;
	}
	
	public String ArmarRespuesta(char Abecedario, String Mes, int Telefono) {
		String respuesta = "";

		for (int i = 0; i < this.abecedario.length; i++) {
			if (Abecedario == abecedario[i]) {
				respuesta += abecedarioRespuesta[i];
			}
		}
		for (int i = 0; i < this.mes.length; i++) {
			if (Mes == mes[i]) {
				respuesta += " " + mesRespuesta[i];
			}
		}
		for (int i = 0; i < this.telefono.length; i++) {
			if (Telefono == telefono[i]) {
				respuesta += " " + telefonoRespuesta[i];
			}
		}
		
		return respuesta;
	}
	
}
