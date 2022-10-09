package co.edu.unbosque.model;

public class Kira extends Heroe{
	
	private String dulsura;
	private String coraje;
	
	public Kira() {
		super.edad = 235;
		super.estatura = 3;
		super.bondad = "es buena con los niños y demas heroes";
		super.nivelPoder = "por encima de cualquer heroe de clase baja";
		super.alma = true;
		super.colordeojos = "galacticos";
		this.dulsura = "es muy gtentil con los niños y muy piadosa";
		this.coraje = "no le teme a nada ";
	}
	public String establecerAlma() {
		String rta = "";
		if(alma = true) {
			rta = "Kira posee un alma verdadera, lo que quiere decir que es puro y siempre busca lo mejor para todos ";
		}
		return rta;
		}
	@Override
	public String Volar() {
		return "Kira puede volar a grandes velosidades al rededor del planeta ";
	}

	@Override
	public String crearFuego() {
		return "Kira genera fuego de sus manos ";
	}
	
	@Override
	public String detenerTiempo() {
		return "Kira puede detener el tiempo cuando lo necesite ";
	}
	
	
	
	public String transformar() {
		return "Kira puede alterar cualquier pobjeto para transformarlo en lo que sea ";
	}
	
	public String liderar() {
		return "Kira compite con Astar para demostrar quien es mejor lider ";
	}

	

	public String getDulsura() {
		return dulsura;
	}

	public void setDulsura(String dulsura) {
		this.dulsura = dulsura;
	}

	public String getCoraje() {
		return coraje;
	}

	public void setCoraje(String coraje) {
		this.coraje = coraje;
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Kira habita en la zona norte del planeta ";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Kira siente a los demas heroes y a los seres de otros mundos ";
	}


	@Override
	public String toString() {
		return "Edad: " + edad + " años" + "\n" +
				"Altura: " + estatura + " metros" + "\n" +
				"Color de ojos: " + colordeojos + "\n"+
				establecerAlma() + "\n" + 
				Habitar() + "\n"  +
				Sentir() + "\n"  +
				"Kira posee 5 poderes: " + "\n" + 
				" \t1. " + crearFuego() + "\n"  +
				" \t2. " + detenerTiempo() + "\n" +
				" \t3. " + Volar() + "\n" + "\n" +
				" \t4. " +transformar() +"\n" +
				" \t5. " +liderar();
	}
	
	
}


