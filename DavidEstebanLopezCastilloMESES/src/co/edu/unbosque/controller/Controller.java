package co.edu.unbosque.controller;
import co.edu.unbosque.model.Meses;
import co.edu.unbosque.view.VerVentanas;

public class Controller {


	private VerVentanas vista;
	private Meses m;
	
	public Controller(){
	
		m = new Meses();
		vista = new VerVentanas();
		funcionar();
	}
	
	public void funcionar() {
		
	String menu = "****Seleccione una opcion****"+"\n"+"\n"+
	             
	              "\t1. Enero"+"\n"+
			      "\t2. Febrero"+"\n"+
	              "\t3. Marzo"+"\n"+
			      "\t4. Abril"+"\n"+
	              "\t5. Mayo"+"\n"+
			      "\t6. Junio"+"\n"+
			      "\t7. Julio"+"\n"+
			      "\t8. Agosto"+"\n"+
	              "\t9. Septiembre"+"\n"+
			      "\t10. Octubre"+"\n"+
	              "\t11. Noviembre"+"\n"+
			      "\t12. Diciembre";
	
	int opcion = vista.leerdatoEntero(menu);
	
	switch (opcion) {
	case 1:
		vista.mostrarInformacion(m.enero());
		break;
	case 2:
		vista.mostrarInformacion(m.febrero());
		break; 
	case 3:
		vista.mostrarInformacion(m.marzo());
		break; 	
	case 4:
		vista.mostrarInformacion(m.abril());
		break; 
	case 5:
		vista.mostrarInformacion(m.mayo());
		break;
	case 6:
		vista.mostrarInformacion(m.junio());
		break;
	case 7:
		vista.mostrarInformacion(m.julio());
		break;
	case 8:
		vista.mostrarInformacion(m.agosto());
		break; 
	case 9:
		vista.mostrarInformacion(m.septiembre());
		break; 	
	case 10:
		vista.mostrarInformacion(m.octubre());
		break; 
	case 11:
		vista.mostrarInformacion(m.noviembre());
		break;
	case 12:
		vista.mostrarInformacion(m.diciembre());
		break;	
		
	default:
		vista.mostrarInformacion("Intente de nuevo");
		break;
	}
	
	if (opcion != 4 || opcion ==4) {
		funcionar();
	}
}
}
