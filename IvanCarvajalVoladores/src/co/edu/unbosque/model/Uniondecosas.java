package co.edu.unbosque.model;

public class Uniondecosas {

	private Superman S;
	private Pajaro P;
	private Helicoptero H;
	private Hidroavion Ha;
	
	public Uniondecosas() {
		S = new Superman();
		P = new Pajaro();
	    H = new Helicoptero();
	    Ha = new Hidroavion();    
	}
	
	public String mostrarSuperman(String A) {
		A = S.getNovia()+" ademas de esto el es vulnerable a no"+"\n"+
	        S.vulneravilidad+" por estas circunstancias el no puede "+S.camina+"\n"+
			" entonces por estos motivos al momento de volar "+"\n"+
			S.despegar()+" es por eso que "+ S.volar()+ "\n"+
			" al momento cuando el quiere ver a las personas "+"\n"+
			S.aterrizar() +" algo que le admiran a superman es que es que al momento de salvar vidas el "+"\n"+
			S.salvarVidas()+" es por eso que ese trabajo es muy duro y para toda la vida"+"\n"+
			" entonces el "+S.comer()+ " ademas "+S.saltarEdificios();
		return A;
	}
	
	public String mostrarHelicoptero(String A) {
		
		A = "Un helicoptero puede "+H.getLugar()+ "\n"+
		    "algunos helicopteros pueden "+H.frenos+"\n"+
			"y es por eso que si miramos algunos son de papel por que "+"\n"+
		    H.peso+ " entonces preguntemonos como despega ellos"+"\n"+
			H.despegar()+" ademas una vez en el aire ellos"+"\n"+
		    H.volar()+ " es por eso que no le tienen a nada entonces su forma de aterriar es unica "+"\n"+
			"por que ellos "+H.aterrizar()+" su motor "+H.motor()+"\n"+
		    "y para que son utilizados estos para nada no mentiras para" +"\n"+
			"se usan para "+H.transladar()+
			H.girarElises();
		
		return A;
	}
	
	public String mostrarPajaro(String A) {
		
		A = "Una de las cosas mas importantes de los pajaros es que "+"\n"+
		    P.getDrogarse()+ " su forma de caminar es muy peculiar ya que estos animales"+"\n"+
			P.camina + " son las victimas con mas accidentavilidad ya que ellas"+"\n"+
		    P.despegar()+" y tambien los caracteriza por su forma de volar ya que"+"\n"+
			P.volar() + P.aterrizar()+"\n"+
		    "para alimentarse tiene que salir a buscar su alimento entonces" +"\n"+
			P.comer()+" es por eso que deja sus huevos solos y por ese motivo ellos"+"\n"+
		    P.ponerHuevos();
		
		return A;
	}
	
	public String mostrarHidroavion(String A) {
		
		A = "En donde se encuentra el hidroavion "+Ha.getSuperficie()+"\n"+
		    "como todo avion el peso de este "+ Ha.peso+"\n"+
			"y como es muy ligero, osea cafetera "+Ha.frenos+"\n"+
		    "a la hora de despegar, "+Ha.despegar()+"\n"+
			"el hidroavion "+Ha.volar()+"\n"+
		    "pero al momento de aterrizar este "+Ha.aterrizar()+"\n"+
			"como es un avion tan viejo "+Ha.motor()+" pero como es un avion acuatico su principal "+"\n"+
		    "funcionamiento es estar quieto"+Ha.transladar()+"\n"+
			"pero para carga agua por que"+Ha.accederZona();
		
		return A;
	}
}
