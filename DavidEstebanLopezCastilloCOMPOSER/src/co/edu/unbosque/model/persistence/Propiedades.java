package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop;
	private int estrofas;
	private int frases;
	private String archivoprop;
	
	public Propiedades() {
		prop = new Properties();
		archivoprop = "c:\\data\\archivo.properties";
		estrofas = 0;
		frases = 0;
	}
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("estrofasPorCancion", "3");
			prop.setProperty("frasesPorEstrofa", "4");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch(IOException e) {
			return -1;
		}
		return 0;
	}
	
	public int tomarValoresPropiedades() {
		String propi1 = "";
		String propi2 = "";
     	try {
			prop.load(new FileInputStream(archivoprop));
			propi1 = prop.getProperty("estrofasPorCancion");
			propi2 = prop.getProperty("frasesPorEstrofa");
			convertirValorPropiedades(propi1, propi2);
		} catch (IOException ex) {
			return -1;
		}
     	return 0;
	}
	
	public void convertirValorPropiedades(String a, String b) {
		estrofas = Integer.parseInt(a);
		frases = Integer.parseInt(b);
 	}
	

	public int getEstrofas() {
		return estrofas;
	}

	public void setEstrofas(int estrofas) {
		this.estrofas = estrofas;
	}

	public int getFrases() {
		return frases;
	}

	public void setFrases(int frases) {
		this.frases = frases;
	}
	
	
}
