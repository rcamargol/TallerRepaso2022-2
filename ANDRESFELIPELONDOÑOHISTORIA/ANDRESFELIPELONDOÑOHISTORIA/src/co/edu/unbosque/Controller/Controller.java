package co.edu.unbosque.Controller;
import co.edu.unbosque.Model.Habitantes;
import co.edu.unbosque.View.View;
import co.edu.unbosque.Model.ExcepcionarAlgo;
import co.edu.unbosque.Model.ExcepcionarAlgoMas;

public class Controller {

	private Habitantes h;
	private View v;
	
	public Controller(){
		
		h = new Habitantes();
		v = new View();
		
		funcionar();
}
	
	public void funcionar() {
		
		String inicio = "A quien escogeras para conocer su informacion?"+ "\n"+
						"1 Andres" + "\n" +
						"2 Renk" + "\n" +
						"3 Kira" + "\n" +
						"4 Astar"+ "\n" +
						"5 Salir";
		
		int n = v.leerDatoEntero(inicio);
		
		if(n == 1) {
		v.mostrarInformacion(h.getAndres().descAndres());
			funcionar();
		}
		if(n == 2) {
			v.mostrarInformacion(h.getRenk().descRenk());
			funcionar();
		}
		
		if(n == 3) {
			v.mostrarInformacion(h.getKira().descKira());
			funcionar();
		}
		if(n == 4) {
			v.mostrarInformacion(h.getAstar().descAstar());
			funcionar();
		}
		if(n == 5) {
			v.mostrarInformacion("Gracias :)");
		
		}
		try {
			if(n < 1) {
				throw new ExcepcionarAlgo();
			
			}
		}catch(ExcepcionarAlgo e) {
			e.printStackTrace();
			
		}
		try {
			
			if(n > 5) {
				throw new ExcepcionarAlgoMas();
			}
		}catch(ExcepcionarAlgoMas e) {
			e.printStackTrace();
			
		}
	}
	
}
