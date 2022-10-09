package co.edu.unbosque.model;

public class Renk extends Desterrados{
	private String colorpelo;
	private int platosaldia;
	
	public Renk () {
		super.edad = 138;
		super.estatura = 6.7;
		super.colorojos = "Cafe";
		super.alma =  "El tal *dios* KublaKan lo creo con un alma que no es autentica.";
		super.numojos = 6;
		super.hortalizafav = "Lechuga";
		this.colorpelo = colorpelo;
        platosaldia = platosaldia;
	}

	public String getColorpelo() {
		return "Rojo";
	}

	public void setColorpelo(String colorpelo) {
		this.colorpelo = colorpelo;
	}

	public int getPlatosaldia() {
		return 34;
	}

	public void setPlatosaldia(int platosaldia) {
		this.platosaldia = platosaldia;
	}

	@Override
	String habitar() {
		return  "Los desterrados habitan al extremo sur de Cynus X1.";
	}

	@Override
	String sentir() {
		return  "Solo puede sentir la presencia de otros desterrados... es  de lo mejor. ";
		
	}

	@Override
	String arrastrarse() {
		return  "Al no poder caminar, los desterrados tienen que arrastrarse por todo su reino. ";
	}

	@Override
	String cosechar() {
		return "Desde muy jovenes, los desterrados aprenden a cosechar sus alimentos para poder sobrevivir.";
	} 
	
	String tenenciaVertebras() {
		return "Tiene 60 Vertebras.";
	}
	public void muerteDeRenk() throws ExceptionPorAlgoV2 {
		if(super.edad>=1500) {
			throw new ExceptionPorAlgoV2("Renk ha llegado al final de su vida. \n"+
					                     "Continua tu busqueda, Vaquero." );
		}
	}
	
	public String brindarDatoDeste() {
		String linea;
		try {
			muerteDeRenk();
		}catch(ExceptionPorAlgoV2 e) {
			
			linea = e.getMessage();
			return linea;
		}
		linea = "Renk ..."+ " \n"+
				"Tiene " + super.edad + "  anios de 1500. \n"+
				"Mide " + super.estatura + " mts de largo. \n"+
				"Tiene " + super.numojos + " ojos y son de color " + super.colorojos+ " \n"+
				"Su pelo es de color " + getColorpelo()+ " \n"+
				"Consume mas de " + getPlatosaldia()+ " platos al dia de " +super.hortalizafav+ " \n"+
				arrastrarse()+ " \n" +
				super.alma + " \n"+
				cosechar() + " \n" +
				sentir() + " \n" +
				habitar() + " \n" +
				tenenciaVertebras() + " \n" +
                "Forma parte de la comunidad de desterrados supuestamente creada por KublaKan. " +" \n";
		return linea;
	}

}
