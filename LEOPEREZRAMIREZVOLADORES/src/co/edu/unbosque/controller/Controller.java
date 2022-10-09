package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Mundovolador;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View gui;
	private Mundovolador mu;
	public Controller() {
		gui = new View();
		mu = new Mundovolador();
		funcionar();
	}
	private void funcionar() {
		int opc;
		   String menu = "Bienvenid@ \n"+
		                 "1. Mostrar vehiculos\n"+
				         "2. Mostrar ave\n"+
		                 "3. Mostrar Superman\n"+
				         "4. Salir\n";
		   do {
		     gui.mostrar(menu);
		     opc = gui.pedirDatoEntero("Seleccione su opcion:");
	         switch (opc) {
	         case 1:
	        	 int op;
	        	 String mn =  "Elija \n"+
		                 "1. Helicoptero\n"+
				         "2. Hidroavion\n"+
				         "3. Salir\n";
	        	 gui.mostrar(mn);
	        	 op = gui.pedirDatoEntero("Seleccione su opcion:");
	        	if(op==1) {
	   
	    		     		gui.mostrar("Helicoptero"+"\n"+"-Transporte: "+mu.getHe().getTransport()+"\n"+mu.getHe().takeOff()+"\n"+mu.getHe().land()+"\n"+
	    		     				mu.getHe().fly()+"\n"+mu.getHe().seePanoramic()+"\n"+"-Cantidad de elices: "+mu.getHe().getNumElices());
	        	}
	        	else if(op==2) {
	    		     		gui.mostrar("Hidroavion"+"\n"+"-Transporte: "+mu.getSea().getTransport()+"\n"+mu.getSea().takeOff()+"\n"+mu.getSea().land()+"\n"+
	    		     				mu.getSea().fly()+"\n"+mu.getSea().seePanoramic()+"\n"+"-Cantidad de elices: "+mu.getSea().getNumElices());;
 
	    	         }
	    	    break;
	         case 2:
	        	 
		     		gui.mostrar("Ave"+"\n"+mu.getBi().takeOff()+"\n"+mu.getBi().land()+"\n"+mu.getBi().eat()+"\n"+
		     				mu.getBi().fly()+"\n"+mu.getBi().buildNest()+"\n"+mu.getBi().layEggs()+"\n");	
	           break;
	         case 3:
	        	
	        	 gui.mostrar("Superman"+"\n"+"-Poderes: "+mu.getSu().getPowers()+"\n"+"-Afiliaciones: "+mu.getSu().getAffiliations()+"\n"+mu.getSu().takeOff()+"\n"+mu.getSu().land()+"\n"+mu.getSu().fly()+"\n"+
	        			 mu.getSu().eat()+"\n"+ mu.getSu().leapBuilding()+"\n"+mu.getSu().stopBullet()+"\n"+mu.getSu().
	        			 hideIdentity());
	    	    break;
	         case 4:
	        	 JOptionPane.showMessageDialog(null, "Adios pa");
	    	    break;
	         default:
	    	    gui.mostrar("Opcion incorrecta");
	         }
		   }while(opc!=4);
		
	}
}
		
	
	
	


