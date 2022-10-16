package co.edu.unbosque.model;

public class JuanDavid extends Mortales {
	private String nobleza;
	private String honestidad;
	
	JuanDavid(){
		super.edad= 17;
		super.alma= true;
		super.colorojos= "violeta";
		super.estatura= 1.81;
		super.cariñoso= "es un poco cari�oso ";
		super.Liderazgo ="Este mortal pesse un rasgo el cual es el Liderazgo ";
		this.honestidad="este mosrtal tiene un nivel de honestidad muy alto ";
		this.nobleza="Este H�roe posse mucha nobleza";
		
	}
	
	
	public String habitar() {
		
		return "Habitan en el este del planeta";
	}


	public String getNobleza() {
		return nobleza;
	}


	public void setNobleza(String nobleza) {
		this.nobleza = nobleza;
	}


	public String getHonestidad() {
		return honestidad;
	}


	public void setHonestidad(String honestidad) {
		this.honestidad = honestidad;
	}


	@Override
	public String tenerunafamilia() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String adquirirconocimientos() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String ejercerprofesion() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String Sentir() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String Habitar() {
		// TODO Auto-generated method stub
		return null;
	}




}
