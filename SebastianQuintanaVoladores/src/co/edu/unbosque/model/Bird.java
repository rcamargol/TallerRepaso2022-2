package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {
private String canto;
	
	public Bird() {
		super.fuerza ="pueden alzar hasta el doble de su peso ";
		this.canto = "el canto de los pajaros es moy lindo, ellos tienden a hacerlo en las mañanas";
}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "los pajaros al despegar agitan sus alas hasta el punto de separar sus patas del suelo";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "ellos al aterrizar reducen la velocidad de sus alas hasta que sus patas tocan el suelo";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "ya en el aire , ellos direccionan su cuerpo para poder volar, agitando sus alas para no perder el impulso";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "generalmente se alimentan de insectos y de frutas ";
	}
	public String construirNido() {
		return"Al construir sus nidos los pajaros recogen ramas y las agrupan, para formar sus nidos";
	}
	public String ponerHuevos() {
		return "los pajaros pueden poner todo tipo de huevos, de diferentes tamaños y colores, para poder reprodocirse";
		
	}
	@Override
public String toString() {
	return "Fuerza: " + fuerza + "\n" +"canto: "+canto+ "\n" +
		    despegar() + "\n" + 
			aterrizar() + "\n"  +
			volar() + "\n"  +
			 comer() + "\n"+
			 construirNido()+"\n"+
			 ponerHuevos()+ "\n";
}
}