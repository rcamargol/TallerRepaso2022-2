package co.edu.unbosque.model;

public class SeaPlane extends Airplane {
	
	private String agua;
	
	public SeaPlane() {
		super.velocidad = "velocidad extrema.";
		super.transporte = "nuestra mision es transportar agua a los lugares que se requiera.";
		this.agua = "convivir con el agua.";
	}


	@Override
	public String despegar() {
	
		return "-Antes de despegar debemos cubrirnos de bloqueador y nos hidratamos bien con una buena coca cola.Empacamos golosinas y repelente";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Cuando vamos aterrizar ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "-Volar es de las mejores experiencias, amamos ver los atardeceres, los rayos y tormentas desde muy, muy lejano";
	}
	
	public String flotar () {
		return "-Aunque no lo crean no sabemos nadar, ni flotar por si solos. Por lo tanto, tenemos que usar flotadores cuando aterrizamos encima del agua";
	}
	@Override
	public String prenderMotor() {
		// TODO Auto-generated method stub
		return "-Antes de iniciar nuestra preparacion para despegar, debemos prender los motores. Son muy dormilones por lo tanto hay que hacerlo con una bocina (con las que se alienta a la seleccion cuando va al mundial)";
	}

	public String textoSeaPlane () {
		return "Soy el rey del agua " +transporte+ " Nuestro hobbie favorito es " +agua+ " Tambien alcanzamos una " +velocidad+ "\n" +
				"A continuacion te contare un poco de nuestra rutina como voladores " + "\n" + despegar() + "\n" + volar () + "\n" + flotar() + "\n" + aterrizar () ;
	}

	
}
