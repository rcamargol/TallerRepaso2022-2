
package co.edu.unbosque.model;

public class Desterrado extends Kublakan {

	protected String velocidad;
	
	public Desterrado(int edad, double estatura, String colorO, String alma,  String velocidad) {
		super(edad, estatura, colorO, alma);
		this.alma = "Falsa";
		this.velocidad = velocidad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habita el sur del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Solo se siente a si mismo";
	}
	
	public String arrastrar() {
		
		return "Solo se puede arrastrar" + velocidad;
		
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return this.edad;
	}

	@Override
	public double getEstatura() {
		// TODO Auto-generated method stub
		return this.estatura;
	}

	@Override
	public String getColorO() {
		// TODO Auto-generated method stub
		return this.colorO;
	}

	@Override
	public String getAlma() {
		// TODO Auto-generated method stub
		return this.alma;
	}

}
