package co.edu.unbosque.model;

public class Isabella extends Mortales{
	
	private String humildad;
	private String respeto;
	
	public Isabella() {
		super.edad = 17;
		super.estatura = 1.70;
		super.envidia = "Nula";
		super.religion = "Catolico";
		super.alma = true;
		super.colordeojos = "Cafes";
		this.humildad = "Humilde";
		this.respeto = "Muy Respetuoso";
	}

	@Override
	public void adquirirConocimientos() {
		
	}

	@Override
	public void tenerFamilia() {
		
	}

	@Override
	public void ejercerProfesion() {
		
	}
	
	public void programar() {
		
	}
	
	public void jugarVideojuegos() {
		
	}

	public String getHumildad() {
		return humildad;
	}

	public void setHumildad(String humildad) {
		this.humildad = humildad;
	}

	public String getRespeto() {
		return respeto;
	}

	public void setRespeto(String respeto) {
		this.respeto = respeto;
	}

}
