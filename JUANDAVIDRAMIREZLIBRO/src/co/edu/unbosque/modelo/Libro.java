package co.edu.unbosque.modelo;

public class Libro {
	
	String[]abecedario;
	String[] telefono;
	String[] meses;
	
	
	public Libro() {
		abecedario = new String [28];
		
		abecedario[0]= "La verdadera";
		abecedario[1]= "La exitante";
		abecedario[2]="La horripilantte";
		abecedario[3]=" La alegre";
		abecedario[4]="La fatal";
		abecedario[5]="La apasionante";
		abecedario[6]="La trágica";
		abecedario[7]="La sangrienta";
		abecedario[8]="La famosa";
		abecedario[9]="La gran";
		abecedario[10]="La penosa";
		abecedario[11]="La triste";
		abecedario[12]="La desastrosa";
		abecedario[13]="La hermosa";
		abecedario[14]="La oscura";
		abecedario[15]="La gloriosa";
		abecedario[16]="La oscura";
		abecedario[17]="La emocionate";
		abecedario[18]="La fantástica";
		abecedario[19]="La terrorífica";
		abecedario[20]="La aburrida";
		abecedario[21]="La increíble";
		abecedario[22]="La desgraciada";
		abecedario[23]="La lamentable";
		abecedario[24]="La cómica";
		abecedario[25]="La miserable";
		
	telefono= new String [10];
	
	telefono[0] ="De un bipolar ";
	telefono[1] ="De un asesino/a ";
	telefono[2] ="De un loco/a ";
	telefono[3] ="De un adicto/a los Memes ";
	telefono[4] ="De un soñador/a ";
	telefono[5] ="De un genio/a Incomprendido/a ";
	telefono[6] ="De un simbolo Sexual";
	telefono[7] ="De un alcoholico/a ";
	telefono[8] ="De un guerrero/a ";
	telefono[9] ="De un aventurero/a ";

	meses = new String[13];
	meses[1] =  " Hazaña ";
	meses[2] =  " Reencarnacion ";
	meses[3] =  " Batalla ";
	meses[4] =  " Existencia ";
	meses[5] =  " Muerte ";
	meses[6] =  " Mision ";
	meses[7] =  " Venganza ";
	meses[8] =  " Anecdota ";
	meses[9] =  " Vida ";
	meses[10] =  " Leyenda ";
	meses[11] = " Historia ";
	meses[12] =  " Biografia ";
		
	}
	public String abecedario(String t) {
		if(t.equals("A")) {
			t=abecedario[0];
		}else if(t.equals("B")) {
			t=abecedario[1];
		}
		else if(t.equals("C")) {
			t=abecedario[2];
		}
		else if(t.equals("D")) {
			t=abecedario[3];
		}
		else if(t.equals("E")) {
			t=abecedario[4];
		}
		else if(t.equals("F")) {
			t=abecedario[5];
		}
		else if(t.equals("G")) {
			t=abecedario[6];
		}
		else if(t.equals("H")) {
			t=abecedario[7];
		}
		else if(t.equals("I")) {
			t=abecedario[8];
		}
		else if(t.equals("J")) {
			t=abecedario[9];
		}
		else if(t.equals("K")) {
			t=abecedario[10];
		}
		else if(t.equals("L")) {
			t=abecedario[11];
		}
		else if(t.equals("M")) {
			t=abecedario[12];
		}
		else if(t.equals("N")) {
			t=abecedario[13];
		}
		else if(t.equals("O")) {
			t=abecedario[14];
		}
		else if(t.equals("P")) {
			t=abecedario[15];
		}
		else if(t.equals("Q")) {
			t=abecedario[16];
		}
		else if(t.equals("R")) {
			t=abecedario[17];
		}
		else if(t.equals("S")) {
			t=abecedario[18];
		}
		else if(t.equals("T")) {
			t=abecedario[19];
		}
		else if(t.equals("u")) {
			t=abecedario[20];
		}
		
		else if(t.equals("V")) {
			t=abecedario[21];
		}
		else if(t.equals("W")) {
			t=abecedario[22];
		}
		else if(t.equals("X")) {
			t=abecedario[23];
		}
		else if(t.equals("Y")) {
			t=abecedario[26];
		}
		else if(t.equals("Z")) {
			t=abecedario[27];
		}
	return t;
}
	public String meses(String t) {
		if(t.equals("ENERO")) {
			t=meses[1];
		}else if(t.equals("FEBRERO")) {
			t=meses[2];
		}
		else if(t.equals("MARZO")) {
			t=meses[3];
		}
		else if(t.equals("ABRIL")) {
			t=meses[4];
		}
		else if(t.equals("MAYO")) {
			t=meses[5];
		}
		else if(t.equals("JUNIO")) {
			t=meses[6];
		}
		else if(t.equals("JULIO")) {
			t=meses[7];
		}
		else if(t.equals("AGOSTO")) {
			t=meses[8];
		}
		else if(t.equals("SEPTIEMBRE")) {
			t=meses[9];
		}
		else if(t.equals("OCTUBRE")) {
			t=meses[10];
		}
		else if(t.equals("NOVIEMBRE")) {
			t=meses[11];
		}
		else if(t.equals("DICIEMBREL")) {
			t=meses[12];
		}
		return t;
}
	public String telefono(int n,String t) {
		if(n==0) {
			t=telefono[0];
		}else if(n==1) {
			t=telefono[1];
		}else if(n==2) {
			t=telefono[2];
		}else if(n==3) {
			t=telefono[3];
		}else if(n==4) {
			t=telefono[4];
		}else if(n==5) {
			t=telefono[5];
		}else if(n==6) {
			t=telefono[6];
		}else if(n==7) {
			t=telefono[7];
		}else if(n==8) {
			t=telefono[8];
		}else if(n==9) {
			t=telefono[9];
		}
		return t;
	}
	public String[] getAbecedario() {
		return abecedario;
	}
	public void setAbecedario(String[] abecedario) {
		this.abecedario = abecedario;
	}
	public String[] getTelefono() {
		return telefono;
	}
	public void setTelefono(String[] telefono) {
		this.telefono = telefono;
	}
	public String[] getMeses() {
		return meses;
	}
	public void setMeses(String[] meses) {
		this.meses = meses;
	}
}