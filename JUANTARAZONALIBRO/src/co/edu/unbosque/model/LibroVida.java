package co.edu.unbosque.model;

public class LibroVida {
	
	private String[] abecedario;
	private String[] mes;
	private String[] num;
	
	public LibroVida() {
		
		abecedario = new String[26];
		
		abecedario[0] = "A. La verdadera";
		abecedario[1] = "B. La excitante";
		abecedario[2] = "C. La horripilante";
		abecedario[3] = "D. La alegre";
		abecedario[4] = "E. La fatal";
		abecedario[5] = "F. La apasionante";
		abecedario[6] = "G. La trágica";
		abecedario[7] = "H. La sangrienta";
		abecedario[8] = "I. La famosa";
		abecedario[9] = "J. La gran";
		abecedario[10] = "K. La penosa";
		abecedario[11] = "L. La triste";
		abecedario[12] = "M. La desastrosa";
		abecedario[13] = "N. La hermosa";
		abecedario[14] = "O. La oscura";
		abecedario[15] = "P. La gloriosa";
		abecedario[16] = "Q. La infeliz";
		abecedario[17] = "R. La emocionante";
		abecedario[18] = "S. La fantástica";
		abecedario[19] = "T. La terrorífica";
		abecedario[20] = "U. La aburrida";
		abecedario[21] = "V. La increíble";
		abecedario[22] = "W. La desgraciada";
		abecedario[23] = "X. La lamentable";
		abecedario[24] = "Y. La cómica";
		abecedario[25] = "Z. La miserable";
		
		
		mes = new String[12];
		
		mes[0] = "Enero. Hazaña";
		mes[1] = "Febrero. Reencarnación";
		mes[2] = "Marzo. Batalla";
		mes[3] = "Abril. Existencia";
		mes[4] = "Mayo. Muerte";
		mes[5] = "Junio. Misión";
		mes[6] = "Julio. Venganza";
		mes[7] = "Agosto. Anécdota";
		mes[8] = "Septiembre. Vida";
		mes[9] = "Octubre. Leyenda";
		mes[10] = "Noviembre. Historia";
		mes[11] = "Diciembre. Biografía";
		
		
		num = new String[10];
		
		num[0] = "0. De un Bipolar";
		num[1] = "1. De un asesino/a";
		num[2] = "2. De un loco/a";
		num[3] = "3. De un adicto/a a los memes";
		num[4] = "4. De un soñador/a";
		num[5] = "5. De un genio/a incomprendido";
		num[6] = "6. De un simbolo sexual";
		num[7] = "7. De un alcoholico/a";
		num[8] = "8. De un guerrero/a";
		num[9] = "9. De un aventurero/a";
	}

	public String[] getAbecedario() {
		return abecedario;
	}

	public void setAbecedario(String[] abecedario) {
		this.abecedario = abecedario;
	}

	public String[] getMes() {
		return mes;
	}

	public void setMes(String[] mes) {
		this.mes = mes;
	}

	public String[] getNum() {
		return num;
	}

	public void setNum(String[] num) {
		this.num = num;
	}
	
	
	
}
