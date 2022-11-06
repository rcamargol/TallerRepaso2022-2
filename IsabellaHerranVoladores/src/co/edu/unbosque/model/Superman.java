package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{
	
	private String colorrayolaser;
	
	public Superman() {
		super.anosdevida = 50;
		super.ropa = "Traje con capa en colores rojo y azul, muy resistente";
		this.colorrayolaser = "Rojo";
	}

	@Override
	public String toTakeOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toLand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toFly() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toEat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viajarInterestelarmente() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getColorrayolaser() {
		return colorrayolaser;
	}

	public void setColorrayolaser(String colorrayolaser) {
		this.colorrayolaser = colorrayolaser;
	}
}
