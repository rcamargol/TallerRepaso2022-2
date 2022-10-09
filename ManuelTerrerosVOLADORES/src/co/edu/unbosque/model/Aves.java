package co.edu.unbosque.model;

public class Aves extends Animal implements Volador  {
	
	private String huevos;

	public Aves(){
		super.defecar = "Se defeca hasta en la cabeza y almuerzo del programador";
		super.comida = "Come de to' menos carroña";
		this.huevos = "Deje de pensar en los huevos del gallo ome";
	}
	public String getHuevos() {
		return huevos;
	}
	public void setHuevos(String huevos) {
		this.huevos = huevos;
	}
	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Aterriza donde se le venga en gana";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Despega en cualquier lado siempre y cuando sus patas tengan donde apoyarse";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Vuela por todo lado";
	}

	@Override
	public String estrellarseDondeSea() {
		// TODO Auto-generated method stub
		return "Se estrella donde se le venga en gana, la mala pal que lo joda";
	}

	@Override
	String defecarDondeSea() {
		// TODO Auto-generated method stub
		return defecar;
	}
	@Override
	String comer() {
		// TODO Auto-generated method stub
		return comida;
	}
	
	String ponerHuevos() {
		return "Solo las masmis pueden poner huevos";
	}
	String construirNido() {
		return "Todo me toca a mi en esta casa, nadie ayuda, todo la mama, ehh";
	}
	@Override
	public String toString() {
		return "Aves: "+ " \n" + despegar() +" \n" + volar()+ " \n" + aterrizar()+ " \n" + comer() +"\n" +defecarDondeSea()+ "\n" +estrellarseDondeSea()+" \n"+ getHuevos()+","+ponerHuevos()+" \n"+construirNido()+"";
	}


	
}
