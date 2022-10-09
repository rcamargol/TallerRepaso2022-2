package co.edu.unbosque.Model;

public class Astar extends Heroes{

	public Astar() {
		super.estatura = 3;
		super.edad = 25;
	}
	
	@Override
	String volar() {
		// TODO Auto-generated method stub
		return "Puedo volar aunque no soy tan veloz como mi hermano Kira.";
	}

	@Override
	String crearFuego() {
		// TODO Auto-generated method stub
		return "Puedo crear el fuego mas caliente de todo el mundo.";
	}

	@Override
	String detenerTiempo() {
		// TODO Auto-generated method stub
		return "Puedo detener el tiempo por 1 minuto.";
	}

	@Override
	String habitar() {
		// TODO Auto-generated method stub
		return "Habito en el norte del planeta junto con mi hermanos Kira.";
	}

	@Override
	String sentir() {
		// TODO Auto-generated method stub
		return "Puedo sentirme a mi mismo y a seres de otros mundos.";
	}
	public String descAstar() {
		return	"Tengo "+ edad + " años"+"\n"+
				"Mido "+ estatura +" metros"+"\n"+ 
				volar()+ "\n" +
				crearFuego() + "\n" +
				detenerTiempo() + "\n" +
				habitar() + "\n" +
				sentir();
}
}