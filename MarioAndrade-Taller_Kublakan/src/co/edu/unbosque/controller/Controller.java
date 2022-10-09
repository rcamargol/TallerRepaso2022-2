package co.edu.unbosque.controller;

import co.edu.unbosque.model.Dios;
import co.edu.unbosque.view.View;

public class Controller {
	Dios d;
	View v;
	public Controller() {
		d= new Dios();
		v= new View();
		init();
	}
	public void init(){

		//Numero que cambia el menu//
		int n=v.leerDato(v.menu());
		while(true) {
			switch(n) {
			case 1:
				v.MostrarInfo(d.kira(1000, 2.00 , "violetas como flor", null, "poderosa magia que intimida a cualquir mortal","luz que segaba a sus enemigos"));
				break;
			case 2:
				v.MostrarInfo(d.Renk(900, 2.25, "azules como el mar azul", null,"guardián de una poderosa fuerza", "el jefe que gobierna al pueblo o a los habitantes de los desterrados"));
				break;
			case 3:
				v.MostrarInfo(d.astar(1200, 2.65, "rojos como el rubi", null, "una surperfuerza superior que a sus enemigos", "poderosa telequinesis que tanto asi sus enemigos lo respetaban"));
				break;
			case 4:
				v.MostrarInfo(d.mario(20, 1.60, "cafes como la madera", null, null, null, "leer textos o parrafos en diferentes idiomas", "de escribir libros fantasticos", "tienda donde vendía sus libros vasados en las hazañas de los héroes"));
				break;
			case 0:
				v.MostrarInfo("Hasta luego que la fuerza te acompañe!!!");
				System.exit(0);
				break;
			default:
				v.MostrarInfo("Digita una opcion valida");
			}
			n=n=v.leerDato(v.menu());

		}
	}
}


