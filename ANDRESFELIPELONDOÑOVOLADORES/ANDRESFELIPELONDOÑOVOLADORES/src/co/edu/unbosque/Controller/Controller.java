package co.edu.unbosque.Controller;
import co.edu.unbosque.Model.Voladores;
import co.edu.unbosque.View.View;


public class Controller {

	private Voladores h;
	private View v;
	
	public Controller(){
		
		h = new Voladores();
		v = new View();
		
		funcionar();
}
	
	public void funcionar() {
		
		String inicio = "A quien escogeras para conocer su informacion?"+ "\n"+
						"1 Superman" + "\n" +
						"2 Pajaro" + "\n" +
						"3 Helicoptero" + "\n" +
						"4 Hidroavion"+ "\n" +
						"5 Salir";
		
		int n = v.leerDatoEntero(inicio);
		
		if(n == 1) {
		v.mostrarInformacion(h.getSuperman().descSuperman());
			funcionar();
		}
		if(n == 2) {
			v.mostrarInformacion(h.getPajaro().descPajaro());
			funcionar();
		}
		
		if(n == 3) {
			v.mostrarInformacion(h.getHelicoptero().descHelicopero());
			funcionar();
		}
		if(n == 4) {
			v.mostrarInformacion(h.getHidroavion().descHidroavion());
			funcionar();
		}
		if(n == 5) {
			v.mostrarInformacion("Gracias :)");
		
		}
	
	}
	
}
