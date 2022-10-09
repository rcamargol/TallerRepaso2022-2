package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{
	private boolean superForce;
	
	public Superman() {
		this.superForce = true;
	}

	@Override
	public String takeOff() {
		return "Puedo despegar como un cohete hacia donde quiera\n";
	}

	@Override
	public String land() {
		return "Puedo aterrizar dejando una gran huella\n";
	}

	@Override
	public String fly() {
		return "Puedo volar hacia donde quiera\n";
	}

	@Override
	public String absorberEnergiaSolar() {
		return "Cuando mi cuerpo absorbe energía solar adquiero super poderes\n";
	}
	
	@Override
	public String eat() {
		return "En el desayuno, me como unos 18 huevos frescos fritos en mantequilla, \n" + 
		"Pan de trigo entero recién horneado, \n" +
		"Y, por último, jugo de naranja hecho de toronjas enteras con todo y cáscara.\n";
	}
	
	public String LeapBuilding() {
		return "Puedo saltar entre edificios con el más mínimo esfuerzo\n";
	}
	
	public String stopBullet() {
		return "Puedo detener cualquier tipo de bala, excepto si tiene Kriptonita\n";
	}

	public boolean isSuperForce() {
		return superForce;
	}

	public void setSuperForce(boolean superForce) {
		this.superForce = superForce;
	}
}
