package co.edu.unbosque.controller;


import co.edu.unbosque.model.LetraApellido;
import co.edu.unbosque.model.MesNacimiento;
import co.edu.unbosque.model.UltimoDigito;
import co.edu.unbosque.view.View;


public class Controller {
	
	private LetraApellido letra;
	private MesNacimiento mes;
	private UltimoDigito digito;
	private View view;
	
	public Controller() {
		letra = new LetraApellido();
		mes = new MesNacimiento();
		digito = new UltimoDigito();
		view = new View();
		funcionar();
	}

	private void funcionar() {
		String menu = ".:Selecciona una opcion:."+"\n"+
				"\t1. Saber cual es su libro de vida" + "\n"+"\t2. Salir" + "\n"
				+ "\n" + "Digite la opción a realizar" + "\n";
    int opcion = (int) view.leerDatoEntero(menu);
    
    switch (opcion) {
	case 1:
		letras();
		nacimiento();
		digito();
		respuesta();
		break;
	case 2:
		view.mostrarInformacion(".: Ten un lindo dia :.");
		break;
	}
	if(opcion!=2) {
		funcionar();
	}
		
	}
	
	private void letras() {
		int aux = view.leerDatoEntero("Digita la primera letra de tu primer apellido: "+"\n"+"a = 1"
				+"\n"+"b = 2"+"\n"+"c = 3"+"\n"+"d = 4"+"\n"+"e = 5"+"\n"+"f = 6"+"\n"+"g = 7"
				+"\n"+"h = 8"+"\n"+"i = 9"+"\n"+"j = 10"+"\n"+"k = 11"+"\n"+"l = 12"+"\n"+"m = 13"
				+"\n"+"n = 14"+"\n"+"o = 15"+"\n"+"p = 16"+"\n"+"q = 17"+"\n"+"r = 18"
				+"\n"+"s = 19"+"\n"+"t = 20"+"\n"+"u = 21"
				+"\n"+"v = 22"+"\n"+"w = 23"+"\n"+"x = 24"+"\n"+"y = 25"+"\n"+"z = 26");
		letra.setLetra(aux);
	}

	private void nacimiento() {
		int aux = view.leerDatoEntero("Digita el mes de tu nacimiento: "+"\n"+"Enero = 1"
				+"\n"+"Febrero = 2"+"\n"+"Marzo = 3"
				+"\n"+"Abril = 4"+"\n"+"Mayo = 5"
				+"\n"+"Junio = 6"+"\n"+"Julio = 7"
				+"\n"+"Agosto = 8"+"\n"+"Septiembre = 9"
				+"\n"+"Octubre = 10"+"\n"+"Noviembre = 11"+"\n"+"Diciembre = 12");
		mes.setMes(aux);
	}
	
	private void digito() {
		int aux = view.leerDatoEntero("Digita el ultimo digito de tu numero telefonico: ");
		digito.setDigito(aux);
		
	}
	
	private void respuesta() {
		view.mostrarInformacion(letra.ALetra()+mes.DiaMes()+digito.digito());
		
	}
}
