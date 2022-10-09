package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View vi;
	private CynusX1 Cy;
	
	public Controller() {
		vi = new View();
		Cy = new CynusX1();
		funcionar();
	}

	private void funcionar() {
		
		int opc;
		   String menu = "Bienvenid@ \n ¿Que desea ver? \n"+
		                 "1. Los Heroes\n"+
				         "2. Los Mortales\n"+
		                 "3. Los Desterrados\n"+
				         "4. Salir\n";
		   do {
		     vi.mostrarDatos(menu);
		     opc = vi.pedirDatoEntero("Seleccione su opcion:");
	         switch (opc) {
	         case 1:
	        	 int op;
	        	 String mn =  "Elija \n"+
		                 "1. Heroe 1\n"+
				         "2. Heroe 2\n"+
				         "3. Salir\n";
	        	 vi.mostrarDatos(mn);
	        	 op = vi.pedirDatoEntero("Seleccione su opcion:");
	        	if(op==1) {
	        		vi.mostrarDatos(Cy.getAs().toString());
	        		} else if(op==2) {
	        			vi.mostrarDatos(Cy.getK().toString());
	        		}
	        	break;
	         case 2:
	        	 vi.mostrarDatos(Cy.getL().toString());
	        	 break;
	         case 3:
	        	 vi.mostrarDatos(Cy.getRe().toString());
	        	 break;
	         case 4:
	        	 JOptionPane.showMessageDialog(null, "Adios pai");
	    	    break;
	         default:
	    	    vi.mostrarDatos("Opcion incorrecta");
	    	    }
		   } while (opc!=4);
	}
}
