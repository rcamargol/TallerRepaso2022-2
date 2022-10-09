package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.model.SupervivienteException;
import co.edu.unbosque.view.View;

public class Controller {
	
	private CynusX1 cx1;
	private View v;
	
	public Controller() throws SupervivienteException {
		cx1 = new CynusX1();
		v = new View();
		funcionar();
	}
	
	public void funcionar() throws SupervivienteException {
		
		v.mostrarMensaje("Hola! Mi nombre es Kira! \n"+
						 "Soy una heroína del planeta Cynus X1 \n"+
				         cx1.getKira().toString() + "\n" +
						 "Lo más alto que he volado es: " + cx1.getKira().getAlturadevuelo() + " metros \n" +
				         "Usualmente, la intensidad de mi llama es: " + cx1.getKira().getIntesidaddelfuego() + "\n" +
						 "La mayor cantidad de horas que he detenido han sido: " + cx1.getKira().getTiempodetenido() + "\n" +
						 cx1.getKira().sentir() + "\n" + cx1.getKira().habitar());
		
		v.mostrarMensaje("Hola! Mi nombre es Astar! \n"+
						 "Soy un héroe del planeta Cynus X1 \n"+
						 cx1.getAstar().toString() + "\n" +
					 	 "Lo más alto que he volado es: " + cx1.getAstar().getAlturadevuelo() + " metros \n" +
						 "Usualmente, la intensidad de mi llama es: " + cx1.getAstar().getIntesidaddelfuego() + "\n" +
						 "La mayor cantidad de horas que he detenido han sido: " + cx1.getAstar().getTiempodetenido() + "\n" +
						 cx1.getAstar().sentir() + "\n" + cx1.getAstar().habitar());
		
		v.mostrarMensaje("Hola! Mi nombre es Juan Diego! \n"+
		                 "Soy un mortal del planeta Cynus X1 \n"+
				         cx1.getJuan().toString() + "\n" +
		                 "En mi familia hay " + cx1.getJuan().getNumfamiliares() + " personas \n" +
				         "Me especializo en " + cx1.getJuan().getEspecializacion() + "\n" +
		                 "Mi profesión es: " + cx1.getJuan().getProfesion() + "\n" + 
				         cx1.getJuan().sentir() + "\n" + cx1.getJuan().habitar());
		
		v.mostrarMensaje("Hola! Mi nombre es Renk! \n" +
		                 "Soy un desterrado del planera Cynus X1 \n" +
				         cx1.getRek().toString() + "\n" +
		                 "Usualmente me arrastro desde " + cx1.getRek().getLugardeorigen() + " hasta " + cx1.getRek().getLugardedestino() + "\n" +
				         "Me quedan " + cx1.getRek().calcularVidaRest() + " años \n" +
		                 cx1.getRek().sentir() + "\n" + cx1.getRek().habitar());
		
	}
	
	
	
	
	
}
