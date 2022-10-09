package co.edu.unbosque.model;

public class CynusX1 {
	
	private Ivancarvajal ivan;
	private Kira k;
	private Astar As;
	private Renk R;
	
	public CynusX1() {
		ivan = new Ivancarvajal();
		k = new Kira();
		As = new Astar();
		R = new Renk();
	}
	
	public String mostrarMortal(String msj) {
		return msj = "El nombre del mortal es : "+ ivan.Nombre+"\n"+
				  "la estatura de los mortales son de :"+ivan.Estatura+"\n"+
				  "su edad es: "+ivan.Edad+"años "+ " su color de "+ivan.Colorojos +"\n"+
				  "kunblacan los hizo con un alma: "+ivan.Alma+"\n"+
				  "los mortales su mayoria de veces son: "+ivan.Comportamiento+"\n"+
				  "Y sus construmbres son: "+ivan.Costumbres+"\n"+
				  "los mortales viven en diferentes pueblos de Cynus en este caso nuestro mortal "+"\n"+
				  ivan.getPueblo()+"\n"+
				  " los mortales tienen las habilidades de: "+ivan.getHabiidades()+"\n"+
				  ivan.habitar()+ "\n"+
				  ivan.sentir()+" ademas de esto "+ivan.adquirirConocimiento()+"\n"+
				  "y de igual forma "+ivan.ejercerProfecion()+"\n"+
				  " ademas "+ivan.robarRiquezas()+"\n"+
				  "y su forma de vestir es "+ivan.vestir();  
	}
	
	public String mostrarHeroe1(String msj) {
		return msj= "El nombre del heroe es: "+k.Nombre+"\n"+
	                "La estatura de un heroe es de: "+k.Estatura+"\n"+
				    "vivian aproximadamente unos: "+k.Edad+"años"+"\n"+
	                "Su alma era: "+k.Alma+"\n"+
				    "tenian sus ojos de color: "+k.Colorojos+"\n"+
	                "Lo que caracterizaba a un heroe es por que: "+k.Valentia+"\n"+
				    "Y a kira "+k.Honestidad+ " Su poder era: "+k.getPoder()+"\n"+
	                "por ser heroe tenia muchos enemigos:"+k.getEnemigos()+"\n"+
				    "su habilidad era "+k.crearFuego()+"\n"+
	                "los heroes tenian su territorio por que "+k.habitar()+"\n"+
				    "su tecnica era "+k.detenerTiempo()+"\n"+
	                "Los heores podian "+k.sentir()+"\n"+ 
	                "ellos "+ k.volar()+"\n"+
	                "por otro lado "+k.soñar() +"\n"+
	                "es por eso que "+k.nutrirPoder();
	}
	
	public String mostrarHeroe2(String msj) {
		return msj = "El nombre del heroe es: "+As.Nombre+"\n"+
				     "La estatura de un heroe es de: "+As.Estatura+"\n"+
				     "vivian aproximadamente unos: "+As.Edad+"años"+"\n"+
				     "Su alma era: "+As.Alma+"\n"+
				     "tenian sus ojos de color: "+As.Colorojos+"\n"+
				     "Astar tenia un problema y es que sus fuerzas se estan hiyendo ya que hace"
				     + "años no salva a nadie entonces "+As.Valentia+"\n"+
				     "La codicia lo a "+As.Honestidad+"\n"+
				     "Astar se a vuelto muy interesado por "+As.getInteres()+"\n"+
				     "y a la hora de pelear "+As.getConfiados()+"\n"+
				     "su habilidad era "+k.crearFuego()+"\n"+
		             "los heroes tenian su territorio por que "+k.habitar()+"\n"+	
					 "su tecnica era "+k.detenerTiempo()+"\n"+
		             "Los heores podian "+k.sentir()+"\n"+ 
		             "el solia "+ k.volar()+"\n"+ 
		             "ya no se considera heroe por que "+As.seguirSalvando()+"\n"+ 
		             "y es por eso que "+As.construirVinculos();
	}	
	public String mostrarDesterrado(String msj) {
		return msj = "El nombre de el desterrado es: "+R.Nombre+"\n"+
	                 "La estatura de un desterrado es de: "+R.Estatura+"\n"+
				     "vivian aproximadamente unos: "+R.vivian+"\n"+
	                 "Su alma era: "+R.Alma+"\n"+
				     "tenian sus ojos de color: "+R.Colorojos+"\n"+
	                 "la edad de Renk es de: "+R.Edad+ "años"+"\n"+
				     "los desterrados se caracterizaban por ser de otro color como"+R.colordepiel+"\n"+
	                 "La cualidad que tenian los desterrados era que "+"\n"+
				     R.getAnimal()+" es por eso que kublacan los despreciaba mucho no eran seres unicos asi que"+"\n"+
	                 R.getCondena()+" Ellos por otra parte " + R.habitar()+"\n"+
				     "asi que ellos su habilidad era que "+R.sentir() +"\n"+
	                 "No caminaban comolos demas necesitaban "+R.Arrastar()+"\n"+
				     "Por el sufrimiento que los puso a padecer kublacan "+"\n"+
	                 R.ejercutarVenganza()+ "Algunos desterrados"+"\n"+
				     R.llorarPorserfalso()+"\n"+
	                 "Ademas para alimentarse el"+R.lucharConcriaturas();
	}

	public Ivancarvajal getIvan() {
		return ivan;
	}

	public void setIvan(Ivancarvajal ivan) {
		this.ivan = ivan;
	}

	public Kira getK() {
		return k;
	}

	public void setK(Kira k) {
		this.k = k;
	}

	public Astar getAs() {
		return As;
	}

	public void setAs(Astar as) {
		As = as;
	}

	public Renk getR() {
		return R;
	}

	public void setR(Renk r) {
		R = r;
	}
}

