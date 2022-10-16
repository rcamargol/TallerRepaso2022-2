package co.edu.unbosque.model;

public class CynusX1 {
	
	private Renk renk;
	private Kira kira;
	private Astar astar;
	private Juan juan;

	public CynusX1() {	
		renk = new Renk();
		kira = new Kira();
		astar = new Astar();
		juan = new Juan();
	}
	public String listarAstar() throws EstaturaHeroeException {
		if(astar.getEstatura() != 3) {
			throw new EstaturaHeroeException();
		}
		else {
			String msg = "Nombre: " + astar.getNombre() + " Edad: " + astar.getEdad() + " Estatura: " + astar.estatura + "m" + " Color de ojos: "+ astar.getColordeojos()+ "\n"+
				     "Estado: " + astar.adquirirConocimientos()+"\n"+
				      astar.contarHazañas()+"\n"+
					  astar.contarElementosDominados() + "\n" +
					 "Habilidades: "+"\n"+
				      astar.crearFuego() + "\n"+
					  astar.detenerElTiempo()+"\n"+
				      astar.volar()+ "\n" + "\n";	
			return msg;
		}				
	}
	public String listarKira() throws EstaturaHeroeException {
		if(kira.getEstatura() != 3) {
			throw new EstaturaHeroeException();
		}
		else {
			String msg = "Nombre: " + kira.getNombre() + " Edad: " + kira.getEdad() + " Estatura: " + kira.estatura + "m" + " Color de ojos: "+ kira.getColordeojos()+ "\n"+
			"Estado: " + kira.luchar()+"\n"+ 
			kira.contarHazañas()+"\n"+
			kira.contarElementosDominados() + "\n" +
			"Habilidades: "+"\n"+
			kira.crearFuego() + "\n"+
			kira.detenerElTiempo()+"\n"+
			kira.volar()+ "\n" + "\n";
			return msg;
		}
			     
	}
	public String listarJuan() {
		String msg = "Nombre: " + juan.getNombre() + " Edad: " + juan.getEdad() + " Estatura: " + juan.estatura + "m" + " Color de ojos: "+ juan.getColordeojos()+ " Profesion: " + juan.getProfesion() + "\n"+
					 "Estado: " + juan.dormir()+ "\n"+
					 juan.tenerFamilia() + "\n" +
					 juan.ejercerProfesion() + "\n" +
					 juan.estudiar()+ "\n" + "\n";
		return msg;
	}
	public String listarRenk() throws EdadDesterradoException {
		String msg;
		if (renk.getEdad()>1500) {
			throw new EdadDesterradoException();
		}
		else {
			msg = "Nombre: " + renk.getNombre() +  " Edad: " + renk.getEdad() + " Estatura: " + renk.estatura + "m" + " Color de ojos: "  + renk.getColordeojos() + "\n"+
			"Estado: " + renk.arrastrarElCuerpo()+"\n"+ 
			renk.sentir() +"\n"+
			renk.odiar() +"\n"+
			renk.renegar();
			return msg;
		}
				  
	} 
	
		
}
