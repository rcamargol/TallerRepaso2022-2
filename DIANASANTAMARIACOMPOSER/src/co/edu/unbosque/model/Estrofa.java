package co.edu.unbosque.model;

import java.util.Random;

public class Estrofa {

	private String verso1;
	private String verso2;
	private String verso3;
	private String verso4;

	public Estrofa() {
		this.verso1 = "";
		this.verso2 = "";
		this.verso3 = "";
		this.verso4 = "";
	}

	public String generarEstrofa() {
		String estrofa = "";
		String[][] versos = {
				{ "Mami ", "yo quielo ", "encendelte ", "suave ", "hasta que salga el sol ", "sin anestesia " },
				{ "Bebe ", "yo puedo ", "amalte ", "lento ", "toda la noche ", "sin complomiso " },
				{ "Plincess ", "yo vengo a ", "ligal ", "lapido ", "hasta el amanecel ", "feis to feis " },
				{ "Mami ", "voy a ", "jugal ", "fuelte ", "todo el dia ", "sin miedo " } };

		Random r = new Random();

		this.verso1 = versos[r.nextInt(4)][0] + versos[r.nextInt(4)][1] + versos[r.nextInt(4)][2]
				+ versos[r.nextInt(4)][3] + versos[r.nextInt(4)][4] + versos[r.nextInt(4)][5];
		this.verso2 = versos[r.nextInt(4)][0] + versos[r.nextInt(4)][1] + versos[r.nextInt(4)][2]
				+ versos[r.nextInt(4)][3] + versos[r.nextInt(4)][4] + versos[r.nextInt(4)][5];
		this.verso3 = versos[r.nextInt(4)][0] + versos[r.nextInt(4)][1] + versos[r.nextInt(4)][2]
				+ versos[r.nextInt(4)][3] + versos[r.nextInt(4)][4] + versos[r.nextInt(4)][5];
		this.verso4 = versos[r.nextInt(4)][0] + versos[r.nextInt(4)][1] + versos[r.nextInt(4)][2]
				+ versos[r.nextInt(4)][3] + versos[r.nextInt(4)][4] + versos[r.nextInt(4)][5];

		estrofa = verso1 + "\n" + verso2 + "\n" + verso3 + "\n" + verso4;
		return estrofa;
	}

	public String getVerso1() {
		return verso1;
	}

	public void setVerso1(String verso1) {
		this.verso1 = verso1;
	}

	public String getVerso2() {
		return verso2;
	}

	public void setVerso2(String verso2) {
		this.verso2 = verso2;
	}

	public String getVerso3() {
		return verso3;
	}

	public void setVerso3(String verso3) {
		this.verso3 = verso3;
	}

	public String getVerso4() {
		return verso4;
	}

	public void setVerso4(String verso4) {
		this.verso4 = verso4;
	}

}
