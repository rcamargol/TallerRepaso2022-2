package co.edu.unbosque.Model;

public class Kira extends Heroes{

	public Kira() {
		super.estatura = 3;
		super.edad = 30;
	}
	
	@Override
	String volar() {
		// TODO Auto-generated method stub
		return "Puedo volar a la velocidad del sonido.";
	}

	@Override
	String crearFuego() {
		// TODO Auto-generated method stub
		return "Puedo crear el fuego capaz de derretir el elemento mas fuerte "
				+ "(no le creas a mi hermano Astar, mi fuego es mas fuerte que el de el).";
	}

	@Override
	String detenerTiempo() {
		// TODO Auto-generated method stub
		return "Puedo detener el tiempo por 30 segundos.";
	}

	@Override
	String habitar() {
		// TODO Auto-generated method stub
		return "Habito en el norte del planeta junto con mi hermano Astar.";
	}

	@Override
	String sentir() {
		// TODO Auto-generated method stub
		return "Puedo sentirme a mi mismo y a seres de otros mundos.";
	}
	public String descKira() {
		return "Tengo "+ edad + " años"+"\n"+
				"Mido "+ estatura +" metros" +"\n"+ 
				volar()+ "\n" +
				crearFuego() + "\n" +
				detenerTiempo() + "\n" +
				habitar() + "\n" +
				sentir();
}
}