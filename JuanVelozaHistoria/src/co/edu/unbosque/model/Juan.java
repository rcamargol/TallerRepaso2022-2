package co.edu.unbosque.model;

public class Juan extends Mortal{

	private String meta;
	private String colorpelo;
	
	public Juan () {
		super.edad = 18;
		super.estatura = 1.72;
		super.colorojos = "violeta";
		super.alma = true;
		this.colorpelo = "Cafe oscuro";
		this.meta = "Director del Area de Tecnologia ";
	}
	
	public String establecerAlma() {
		String rta = "";
		if(alma = true) {
			rta = "Juan posee un alma verdadera ";
		}
		return rta;
	}
	
	public String declararMeta() {
		return "Juan quiere, algun dia, llegar a ser el " + meta + " en el centro de inteligencia de la parte este del planeta";
	}
	public String determinarPelo() {
		return "Juan posee un color de pelo " + colorpelo;
	}
	@Override
	public String adquirirConocimientos() {
		return "Juan busca conocer cada día mas sobre la tecnologia y la computacion";
	}

	@Override
	public String tenerFamilia() {
		return "Juan vive junto a sus padres y su hermana ";
	}

	@Override
	public String ejercerProfesion() {
		return "Juan trabaja ayudando a sus padres en el negocio familiar heredado por generaciones, mientras que este culmina definitivamente sus estudios ";
	}
	@Override
	public String habitar() {
		return "Juan, junto con los otros mortales, habita en la parte este del planeta";
	}
	@Override
	public String sentir() {
		return "Juan puede sentir la presencia de otros mortales";
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getColorpelo() {
		return colorpelo;
	}

	public void setColorpelo(String colorpelo) {
		this.colorpelo = colorpelo;
	}

	@Override
	public String toString() {
		return "Edad: " + edad + " años" + "\n" +
				"Altura: " + estatura + " metros" + "\n" +
				"Color de ojos: " + colorojos + "\n"+
				establecerAlma() + "\n" + 
				habitar() + "\n"  +
				sentir() + "\n"  +
				determinarPelo() + "\n"+
				tenerFamilia() +  "\n" +
				adquirirConocimientos() + "\n" +
				ejercerProfesion() + "\n" +
				declararMeta();

	}
	
	

}
