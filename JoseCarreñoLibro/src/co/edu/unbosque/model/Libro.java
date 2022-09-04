package co.edu.unbosque.model;

public class Libro {

	public String identificarApellido(String letraA) {
		if(letraA.equals("a")||letraA.equals("a")) {
			return "La verdadera";
		}if(letraA.equals("b")||letraA.equals("B")) {
			return "La excitante";
		}if(letraA.equals("c")||letraA.equals("C")) {
			return "La horripilante";
		}if(letraA.equals("d")||letraA.equals("D")) {
			return "La alegre";
		}if(letraA.equals("e")||letraA.equals("E")) {
			return "La fatal";
		}if(letraA.equals("f")||letraA.equals("F")) {
			return "La apasionante";
		}if(letraA.equals("g")||letraA.equals("G")) {
			return "La trágica";
		}if(letraA.equals("h")||letraA.equals("H")) {
			return "La sangrienta";
		}if(letraA.equals("i")||letraA.equals("I")) {
			return "La famosa";
		}if(letraA.equals("j")||letraA.equals("J")) {
			return "La gran";
		}if(letraA.equals("k")||letraA.equals("K")) {
			return "La penosa";
		}if(letraA.equals("l")||letraA.equals("L")) {
			return "La triste";
		}if(letraA.equals("m")||letraA.equals("M")) {
			return "La desastrosa";
		}if(letraA.equals("n")||letraA.equals("N")) {
			return "La hermosa";
		}if(letraA.equals("o")||letraA.equals("O")) {
			return "La oscura";
		}if(letraA.equals("p")||letraA.equals("P")) {
			return "La gloriosa";
		}if(letraA.equals("q")||letraA.equals("Q")) {
			return "La infeliz";
		}if(letraA.equals("r")||letraA.equals("R")) {
			return "La emocionante";
		}if(letraA.equals("s")||letraA.equals("S")) {
			return "La fantástica";
		}if(letraA.equals("t")||letraA.equals("T")) {
			return "La terrorífica";
		}if(letraA.equals("u")||letraA.equals("U")) {
			return "La aburrida";
		}if(letraA.equals("v")||letraA.equals("V")) {
			return "La increíble";
		}if(letraA.equals("w")||letraA.equals("W")) {
			return "La desgraciada";
		}if(letraA.equals("x")||letraA.equals("X")) {
			return "La lamentable";
		}if(letraA.equals("y")||letraA.equals("Y")) {
			return "La cómica";
		}if(letraA.equals("z")||letraA.equals("Z")) {
			return "La miserable";
		}
		return "no existe";
	}

	public String identificarMes(int mes) {
		if(mes == 1) {
			return "Hazaña";
		}if(mes == 2) {
			return "Reencarnación";
		}if(mes == 3) {
			return "Batalla";
		}if(mes == 4) {
			return "Existencia";
		}if(mes == 5) {
			return "Muerte";
		}if(mes == 6) {
			return "Misión";
		}if(mes == 7) {
			return "Venganza";
		}if(mes == 8) {
			return "Anecdota";
		}if(mes == 9) {
			return "Vida";
		}if(mes == 10) {
			return "Leyenda";
		}if(mes == 11) {
			return "Historia";
		}if(mes == 12) {
			return "Biografia";
		}
		return "Aprenda a seguir instrucciones";
	}

	public String identificarNumero(int ultimoDig) {
		if(ultimoDig == 1) {
			return "De un asesino/a";
		}if(ultimoDig == 2) {
			return "De un loco/a";
		}if(ultimoDig == 3) {
			return "De un adicto/a a los memes";
		}if(ultimoDig == 4) {
			return "De un soñador/a";
		}if(ultimoDig == 5) {
			return "De un genio/a imprendido/a";
		}if(ultimoDig == 6) {
			return "De un simbolo sexual";
		}if(ultimoDig == 7) {
			return "De un alcohólico/a";
		}if(ultimoDig == 8) {
			return "De un guerrero/a";
		}if(ultimoDig == 9) {
			return "De un aventorero/a";
		}if(ultimoDig == 0) {
			return "De un bipolar";
		}
		return "Aprenda a seguir instrucciones";
	}
}
