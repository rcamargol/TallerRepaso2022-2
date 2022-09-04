package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.NombrePorLetraApellido;
import co.edu.unbosque.model.NombrePorMesNacimiento;
import co.edu.unbosque.model.NombrePorNumeroTelefonico;
import co.edu.unbosque.view.Vista;

public class Controller {
	private Vista vista;
	private NombrePorMesNacimiento datoMes;
	private NombrePorNumeroTelefonico datoTelefono;
	private NombrePorLetraApellido datoApellido;
	private String opcion1;
	private String opcion2;
	private String opcion3;
	private int resp;
	
	public Controller() {
		vista = new Vista();
		datoMes = new NombrePorMesNacimiento();
		datoTelefono = new NombrePorNumeroTelefonico();
		datoApellido = new NombrePorLetraApellido();
		opcion1 = "";
		opcion2 = "";
		opcion3 = "";
		funcionar();
	}

	private void funcionar() {
		do {
			opcion1 = vista.pedirPrimeraLetraApellido("Seleccione la primera letra de su apellido:");
			
			if(opcion1 != "c") {
				pedirMostrarResultadoApellido();
				
				opcion2 = vista.pedirMesNacimiento("Seleccione su mes de nacimiento");

				if(opcion2 != "c") {
					pedirMostrarResultadoMes();
					
					opcion3 = vista.pedirUltimoDigitoNumeroTelefono("Seleccione el ultimo numero digito de su numero de telefono:");
					
					if(opcion3 != "c") {
						pedirMostrarResultadoTelefono();
						
						mostrarResultadoFinal();
						
					}
				}
			}
			
		
			if ( opcion1 == "c" || opcion2 == "c" || opcion3 == "c" ) {
				vista.mostrarNombreDelLibro("GRACIAS");
				resp = 2;
			} else if ( opcion1 != "c" || opcion2 != "c" || opcion3 != "c" ) {
				resp= vista.otraOpcion();
			}
			
		}while (JOptionPane.OK_OPTION == resp);
	}

	private void pedirMostrarResultadoApellido() {
		
		datoApellido.setLetra(opcion1);
		vista.mostrarNombreDelLibro(datoApellido.evaluarApellido());
		
	}

	private void pedirMostrarResultadoMes() {
		datoMes.setMes(opcion2);
		vista.mostrarNombreDelLibro(datoMes.evaluarMes());
		
	}

	private void pedirMostrarResultadoTelefono() {
		datoTelefono.setNumero(opcion3);
		vista.mostrarNombreDelLibro(datoTelefono.evaluarNtelefono());
	}
	
	private void mostrarResultadoFinal() {
		vista.mostrarNombreDelLibro("El nombre del libro de su vida es: "+ "\n " + datoApellido.evaluarApellido() + datoMes.evaluarMes() + datoTelefono.evaluarNtelefono());
	}

	
	

}
