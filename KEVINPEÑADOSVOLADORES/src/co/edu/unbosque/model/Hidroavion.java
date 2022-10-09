package co.edu.unbosque.model;

public class Hidroavion extends Avion implements Volador{
	
	private String flotadores;
	
	public Hidroavion() {
		flotadores = "Toca comprar flotadores.";
		motor = "Para el motor tiene a un hamster como rueda.";
		horario = "24/7";
	}
	
	public String planear() {
		return "En caso de quedarse sin gasolina, el hidroavion tiene un sistema para planear";
	}
	
	@Override
	public String cargarComida() {
		// TODO Auto-generated method stub
		return "LLevan cocos para comer.";
	}
	
	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Despega cuando sale del mar.";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Puede aterrizar en el mar o en el fondo del mar, pero no en rios.";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Vuela con clase.";
	}

	@Override
	public String recorrerDistancia() {
		// TODO Auto-generated method stub
		return "Puede ir de Colombia a Japon.";
	}

	@Override
	public String tragarGasolina() {
		// TODO Auto-generated method stub
		return "Traga 29024 galones de gasolina.";
	}

	
	public String escribirMsgHidroavion() {
		return " -Motor: " + motor + "\n" +  " -Flotadores: " + flotadores + "\n" + " -Horario: " + horario + "\n"
			  +" -Cargar comida: " + cargarComida() + "\n" +  " -Despegar: " + despegar() + "\n" + " -Aterrizar: " + aterrizar() + "\n"
			  +" -Volar: " + volar() + "\n" +  " -Recorrer distancia: " + recorrerDistancia()  + "\n" + " -Tragar gazolina: " + tragarGasolina()
			  + "\n" + " -Planear: " + planear();

	}


}
