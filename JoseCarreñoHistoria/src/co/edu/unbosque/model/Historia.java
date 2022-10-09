package co.edu.unbosque.model;

public class Historia {
	
	Kira kira = new Kira(1753, 3, "Gris", true, "Kira"); 
	Astar astar = new Astar(1475, 3, "Rojos", true, "Astar"); 
	Andres andres = new Andres(210, 1.76, "Violetas", true, "Andres"); 
	Renk renk = new Renk(992, 4.65, "negros", false, "Renk"); 

	public String mostrarKira() {
		return ""+kira.descripcion();
	}
	public String mostrarAstar() {
		return ""+astar.descripcion();
	}
	public String mostrarAndres() {
		return ""+andres.descripcion();
	}
	public String mostrarRenk() {
		return ""+renk.descripcion();
	}
	public String caractKira() {
		return ""+kira.caracteristicas();
	}
	public String caractAstar() {
		return ""+astar.caracteristicas();
	}
	public String caractAndres() {
		return ""+andres.caracteristicas();
	}
	public String caractRenk() {
		return ""+renk.caracteristicas();
	}
}
