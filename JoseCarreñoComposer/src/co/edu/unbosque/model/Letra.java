package co.edu.unbosque.model;

public class Letra {
	String[] letras = new String[24];
	String aux, aux2, aux3;

	public Letra() {
		letras[0] = "Mami";
		letras[1] = "Bebé";
		letras[2] = "Princess";
		letras[3] = "Mami";
		letras[4] = "Yo quielo";
		letras[5] = "Yo puedo";
		letras[6] = "Yo vengo a";
		letras[7] = "Voy a";
		letras[8] = "Enceldelte";
		letras[9] = "Amalte";
		letras[10] = "Ligal";
		letras[11] = "Jugal";
		letras[12] = "Suave";
		letras[13] = "Lento";
		letras[14] = "Lapido";
		letras[15] = "Fuelte";
		letras[16] = "Hasta que salga el sol";
		letras[17] = "Toda la noche";
		letras[18] = "Hasta el amanecel";
		letras[19] = "Todo el día";
		letras[20] = "Sin anestesia";
		letras[21] = "Sin complomiso";
		letras[22] = "Feis to feis";
		letras[23] = "Sin miedo";
		aux = "";
		aux2 = "";
		aux3 = "";
	}

	public String generarEstrofa() {
		int i = 0;

		for (int z = 0; z < 12 + 1; z++) {
			i = (int) Math.floor(Math.random() * (23 - 0 + 1));
			aux += letras[i] + " ";
			if (z == 2 || z == 5 || z == 8) {
				i = (int) Math.floor(Math.random() * (23 - 0 + 1));
				aux += letras[i] + " " + "\n";
			}
		}
		return aux;
	}

	public String generarCancion() {

		for (int z = 0; z < 3; z++) {
			aux2 = generarEstrofa();
//			if (z == 2 || z == 5 || z == 8) {
//				aux2 +=  generarEstrofa()+"--------";
//			}
		}	

		return aux2;
	}
}
