package co.edu.unbosque.controller;
import co.edu.unbosque.view.View;
import co.edu.unbosque.model.AlturaException;
import co.edu.unbosque.model.Cynusx1;
import co.edu.unbosque.model.AlturaException;
import co.edu.unbosque.model.ColorOjosException;



public class Controller {
	private Cynusx1 fa;
	private View vi;
	
	
	Controller(){
		fa= new Cynusx1();
		vi = new View();
		funcionar();
	}
	private void funcionar() {
		// TODO Auto-generated method stub
		
			try {
				fa.probarExceptions();
			}catch(AlturaException | ColorOjosException e) {
				vi.devolverInformacion(e.getMessage());
			}
		
	
	
			String menu = "Digite el numero del personaje el cual quiere saber su magnifica historia\n"+
					 "1. Astral\n"+
				     "2. Kira\n"+
				     "3. Renk\n"+
				     "4. Juan David\n"+
			         "5. Salir\n";
			 int opc= (int) vi.leerdatoEntero(menu);
			switch (opc) {
			case 1:
			vi.mostrarHistoria("Astral es un h�roe que habita en el planeta Cynusx1. Tiene 69 a�os y un alma muy pura,"+"\n"
						+ " mide tres metros como todos los h�roes del planeta. Tiene   las habilidades de Volar, crear fuego, detener el tiempo,"+"\n"
						+ " este h�roe puede llegar a ser m�s r�pido que los aviones gracias a su super velocidad y como Arama tiene la mism�sima espada de bol�var."
						+ " Tambi�n posee ojos de color gris,se sienten s� mismo y a seres de otros mundos. "+"\n"
						+ " tiene mucha personalidad a la hora de liderar gracias a su fuerte car�cter."+"\n"
						+ " tiene mucha sabidur�a gracias a sus padres. y habita al nosrte del planeta.");

				break;
				
			case 2:
			vi.mostrarHistoria("Kira es una hero�na que habita en el planeta Cynusx1. Tiene 50 a�os y un alma muy pura,"+"\n"
						+ "	 mide tres metros como todos los h�roes del planeta. Tiene   las habilidades de Volar, crear fuego, detener el tiempo,"+"\n"
						+ " esta hero�na posee rayos l�ser y un incre�ble super salto gracias a su suro entrenamiento. "+"\n"
						+ " Tambi�n posee ojos de color naranja,se sienten s� misma y a seres de otros mundos"+"\n"
						+ " tiene mucha personalidad a la hora de liderar gracias a su fuerte car�cter."+"\n"
						+ " tiene mucha sabidur�a gracias a sus padres y habita al nosrte del planeta.");
				
				break;
				
			case 3:
			vi.mostrarHistoria("Renk es un Desterrado que habita en el plantena Cynusx1. tiene 100 a�os no posee un alma."+"\n"
									+ " mide un metro con cuarenta sentimetros siendo el unico desterrado conocido del planeta CynusX1."+"\n"
									+ " Este desterrado tiene mucho rencor hacia KublaKan."+"\n"
									+ " Tambi�n posee ojos de color verdes.no sienten a nadie m�s que a el mismo."+"\n"
									+ " Renk tiene mucho desespero ya que habita en la peor zona del planeta, siendo esta el extremo sur del planeta."+"\n"
									+ " tiene exeso de ego por su pasado turbio y es muy audaz por su personalidad."
									+ " Este se arrastra por el planeta ya que no tiene piernas.");
	
				break;
				
			case 4:
			vi.mostrarHistoria(" Juan David es un mortal el cual habita en el planeta Cynusx1. tiene 17 a�os y posee el alma mas pura del planeta."+"\n"
			                      +" mide 1,81 siendo este el unico mortal conocido del planeta CynusX1. mortales del planeta,"+"\n"
					              +" puede adquirir conocimientos, tener familia y ejercer profesion "+"\n"
					              +" Juan David tiene ojos color violeta y es un poco cari�oso con los otros habitantes."+"\n"
					              +" Este mortal pesse un rasgo el cual es el Liderazgo,mosrtal tiene un nivel de honestidad muy alto."+"\n"
					              +" Juan David tambien  posse mucha nobleza en su corazon.pod�an sentir la presencia de otros mortales y vive en el este del planeta.");
				break;
		
			case 5:
				vi.mostrarHistoria("espero que te haya gustado la historia de estos habitantes. Vuelve pronto");
			}
			if(opc != 5) {
				funcionar();

		}
}
}