package co.edu.unbosque.model;

public class CynusX1 {
	
	private Heroe kira;
	private Heroe astar;
	private Mortal juan;
	private Desterrado rek;
	
	public CynusX1() {
		
		this.kira = new Heroe();
		this.astar = new Heroe();
		this.juan = new Mortal();
		this.rek = new Desterrado();
		
		this.kira.estatura = 3;
		this.kira.setAlturadevuelo(1250);
		this.kira.setIntesidaddelfuego("Media");
		this.kira.setTiempodetenido(24);
		
		this.astar.estatura = 3;
		this.astar.setAlturadevuelo(785);
		this.astar.setIntesidaddelfuego("Baja");
		this.astar.setTiempodetenido(46);
		
		this.juan.colordeojos = "violeta";
		this.juan.setEspecializacion("Matemáticas");
		this.juan.setNumfamiliares(3);
		this.juan.setProfesion("Estudiante");
		
		this.rek.alma = false;
		this.rek.edad = 450;
		this.rek.setLugardedestino("Calle 134 con Carrera 9na");
		this.rek.setLugardeorigen("Banderas");
		
	}
	
	public Heroe getKira() {
		return kira;
	}
	public void setKira(Heroe kira) {
		this.kira = kira;
	}
	public Heroe getAstar() {
		return astar;
	}
	public void setAstar(Heroe astar) {
		this.astar = astar;
	}
	public Mortal getJuan() {
		return juan;
	}
	public void setJuan(Mortal juan) {
		this.juan = juan;
	}
	public Desterrado getRek() {
		return rek;
	}
	public void setRek(Desterrado rek) {
		this.rek = rek;
	}
	
	
	
	
	
	

}
