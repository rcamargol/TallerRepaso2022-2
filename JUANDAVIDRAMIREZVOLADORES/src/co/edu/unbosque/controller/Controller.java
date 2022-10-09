package co.edu.unbosque.controller;

import co.edu.unbosque.model.Voladores;
import co.edu.unbosque.view.View;
public class Controller {
	
	private Voladores vo;
	private View vi;

	public Controller() {
		vo= new Voladores();
		vi=new View();
		funcionar();
}

	public void funcionar() {
		
		
		String menu= "Digite el numero del cual quiere saber su información\n"+
				 "1. Pajaro\n"+
			     "2. Helicóptero\n"+
			     "3. Superman\n"+
			     "4. Hidroavión\n"+
		         "5. Salir\n";
		int opc= (int) vi.leerdatoEntero(menu);
		switch (opc) {
		case 1:
			vi.mostrarInfo(" Los Pajaros son animales voladores los cuales tiene la capacidad de comer"+"\n"
					+ "aterrizar,Volar, despegar estos animales poseen plumas las cuales son de color naranja"+"\n"
					+ "Tambie tienen crias, ponen huevos, arman nidos y como todos los animales son muy bellos.");
			break;
		case 2:
			vi.mostrarInfo(" El helicoptero es un vehiculo el cual tiene la capacidad de movilizar al usuario "+"\n"
		             + "y tiene una gran comodidad, es muy costoso este tambien es aerodinamico y tiene una compensacion de vuelo,"+"\n"
					 + "este vehiculo puede despegar  volar y aterrizar." );
			break;
			
		case 3:
			vi.mostrarInfo(" Superman es un animla el cual tiene un nivel de belleza alto y 50 años, comer, posee una superfuerza"+"\n"
		              + " esta persona tiene la capacidad de respirar en el espacio y es muy valiente para su raza.Tambien"+"\n"
					  + " posee la capacidad de despegar, aterrizar volar, deterner balas y saltar edificio.");
			break;
		case 4:
			vi.mostrarInfo( "El hidroavion es un vehiculo el cual tiene una mala comodidad, movilizar, tambien "+"\n"
		               +  " puede aterrizar, despegar, volar y tiene una superficie la cuales son flotadores para aterrizar"+"\n"
					   +  "  este veiculo es muy costoso ya que es muy precioso. ");
	}if(opc != 5) {
		funcionar();
	}
}
}