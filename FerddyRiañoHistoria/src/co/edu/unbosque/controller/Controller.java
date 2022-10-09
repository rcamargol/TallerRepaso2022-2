package co.edu.unbosque.controller;

import co.edu.unbosque.model.Descendientes;
import co.edu.unbosque.view.View;
import co.edu.unbosque.model.EdadException;
import co.edu.unbosque.model.EstaturaException;

public class Controller {
	
	private Descendientes d;
	private View v;
	
	public Controller() {
		d = new Descendientes();
		v = new View();
		funcionar();
	}
	
	public void funcionar() {
		try {
			d.probarExceptions();
		}catch(EdadException | EstaturaException e) {
			v.mostrarInformacion(e.getMessage());
		}
		
		
		String menu = ".: Seleccion de Descendiente :." + "\n" 
						+ "\t1. Kira" + "\n" + "\t2. Astar" + "\n" + "\t3. Renk" + "\n" + "\t4. Ferddy" + "\n" + "\t5. Salir" + "\n"
						+ "Digita la opcion correspondiente al descendiente del que quieres saber la informacion.";
		
		int opcion = (int) v.leerDatoEntero(menu);
		
		switch (opcion) {
		case 1:
			v.mostrarInformacion("Kira es una heroina que vive al norte de Cynus X1, es capaz de sentirse a si misma y sentir a seres de otros planetas," + "\n"
								+ "como todos los heroes del planeta, puede volar, crear fuego y detener el tiempo, pero ademas de esto, ella puede encantar a sus enemigos y curar a sus aliados." + "\n"
								+ "Ella se caracteriza por la gran belleza que tiene a sus 17 años con sus ojos color caramelo y por su estatura de 2 metros," + "\n"
								+ "también por la dura justicia que ha llevado a todos los rincones del planeta durante su vida." + "\n"
								+ "Ella tiene un alma verdadera, aunque suele ser mentirosa pero muy valiente.");
			break;
			
		case 2:
			v.mostrarInformacion("Astar es un heroe que vive al norte de Cynus X1, es capaz de sentirse a si mismo y sentir a seres de otros planetas," + "\n"
								+ "como todos los heroes del planeta, puede volar, crear fuego y detener el tiempo, pero ademas de esto, puede aplastar a sus enemigos y desaparecer para ser impredecible en la pelea." + "\n"
								+ "Astar se caracteriza por ser extremadamente fuerte a sus 50 años, tambien tiene unos curiosos ojos rojos y mide 1.75 metros." + "\n"
								+ "Una de sus debilidades es ser muy tonto y cobarde a pesar ser honesto y tener un alma verdadera.");
			break;
		case 3:
			v.mostrarInformacion("Renk es un desterrado que vive en el extremo sur de Cynus X1, solo es capaz de sentirse a si mismo," + "\n"
								+ "como todos los desterrados del planeta, esta condenado a arrastrarse y a herir a los demas habitantes, pero ademas de esto, tiene la habilidad de desintegrar a sus enemigos y de controlarlos mentalmente." + "\n"
								+ "Renk se caracteriza por su impresionante estatura de 7.4 metros; el tiene 1499 años, a solo un año de cumplir el ciclo de vida de los desterrados de 1500 años," + "\n"
								+ "ha sufrido excesivamente durante su vida y en su alma falsa, almacena un odio extremo, que se ve reflejado en sus ojos negros." + "\n"
								+ "El es muy revelde contra KublaKan porque su ignorancia es nula respecto a todos los asuntos del planeta.");
			break;
		case 4:
			v.mostrarInformacion("Ferddy es un mortal que vive en el este de Cynus X1 y es capaz de sentir la presencia de otros mortales," + "\n"
								+ "como todos los mortales del planeta, puede adquirir conocimientos, tener familia y ejercer profesion, pero ademas de esto, sabe programar y jugar videojuegos." + "\n"
								+ "El tiene un alma verdadera, y se caracteriza por ser muy humilde y respetuoso a sus 17 años, mide 1.70 metros y tiene los ojos cafes. Es catolico y la envidia que siente hacia los otros es nula." );
			break;
		case 5:
			v.mostrarInformacion("Que tengas un buen dia.");
		}
		if(opcion != 5) {
			funcionar();
		}
	}

}
