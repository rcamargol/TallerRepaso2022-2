package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	private String colorDePlumas;
	
	public Bird() {
		super.aniosDeVida = 10;
		this.colorDePlumas = "azules";
	}
	
	public String toBuildNest() {
		return "contruyen nidos para sus hijos.";
	}
	
	public String toLayEggs() {
		return "poner sus huevos en el nido.";
	}

	@Override
	public String toEat() {
		return "los gusanos.";
	}

	@Override
	public String toTakeOff() {
		// TODO Auto-generated method stub
		return "para despegar abren sus alas y se impulsan para volar.";
	}

	@Override
	public String toLand() {
		// TODO Auto-generated method stub
		return "Al momento de aterrizar se fijan que no hayan depredadores.";
	}

	@Override
	public String toFly() {
		// TODO Auto-generated method stub
		return "coordinacion al volar.";
	}

	@Override
	public String toString() {
		return "Los pajaros son unos increibles animales, con sus hermosos sonidos"+"\n"+
				"Una media de la vida de los pajaros es de "+super.aniosDeVida+" anios."+"\n"+
				"Los colores de las plumas estos animales son muy hermosos, pero uno de los mas bonitos son las plumas "+colorDePlumas+"\n"+
				"Estos animales son muy familiares por lo que "+toBuildNest()+"\n"+
				"Son muy protectores al momento de "+toLayEggs()+"\n"+
				"La comida favorita tanto de las crias como la de los adultos son "+toEat()+"\n"+
				"Los pajaros "+toTakeOff()+"\n"+
				toLand()+"\n"+
				"Son unos de los animales con mejor "+toFly();
	}
	
	public String getColorDePlumas() {
		return colorDePlumas;
	}

	public void setColorDePlumas(String colorDePlumas) {
		this.colorDePlumas = colorDePlumas;
	}

}
