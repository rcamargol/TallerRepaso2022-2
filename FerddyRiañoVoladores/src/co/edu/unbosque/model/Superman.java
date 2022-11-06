package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{
	
	private String colorRayoLaser;
	
	public Superman() {
		super.anosDeVida = 50;
		super.ropa = "Traje con capa en colores rojo y azul, muy resistente";
		this.colorRayoLaser = "Rojo";
	}

	@Override
	public String toTakeOff() {
		
		return "Despega levantando el brazo sin razon.";
	}

	@Override
	public String toLand() {
		
		return "Aterriza destrozando todo 10 metros a la redonda.";
	}

	@Override
	public String toFly() {
		
		return "Vuela rompiendo las leyes de la fisica.";
	}

	@Override
	public String toEat() {
		
		return "Pareciera que no come nada.";
	}

	@Override
	public String viajarInterestelarmente() {
		
		return "Se va y vuelve a la tierra todo el tiempo.";
	}
	
	public String toLeapBuiding() {
		
		return "Salta de monumento en monumento de manera increible.";
	}
	
	public String toStopBullet() {
		
		return "Para las balas con las manos y ni parpadea.";
	}
	@Override
	public String toString() {
		
		return "Superman como todo animal puede comer y tiene aproximadamente 50 a�os y tambien como todo kryptoniano" + "\n"
			 + "utiliza ropa resistente, que en su caso es un traje con capa de color rojo y azul principalmente," + "\n"
	   	     + "ademas de esto, su caracteristica especial es que puede lanzar un rayo laser de color rojo por medio de sus ojos," + "\n"
	 	     + "saltar edificios y parar balas.";
	}

	public String getColorrayolaser() {
		return colorRayoLaser;
	}

	public void setColorrayolaser(String colorrayolaser) {
		this.colorRayoLaser = colorrayolaser;
	}
}
