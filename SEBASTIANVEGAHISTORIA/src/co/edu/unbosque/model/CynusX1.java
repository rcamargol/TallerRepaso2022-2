package co.edu.unbosque.model;

public class CynusX1 {
	
	Sebastian sebas;
	Renk renk;
	Kira kira;
	Astar astar;
	
	public CynusX1(){
		
		sebas = new Sebastian(17,1.77,"","Verdadera","estudiante", "Padre, Madre y dos hermanos");
		renk = new Renk(1050,2.5,"Rojo","Falsa","rapido");
		kira = new Kira(30,1,"Verde","Verdadera","mucho");
		astar = new Astar(20,1,"Azul","Verdadera","poco");
		
	}
	
	public String buscarNombre(String nom) throws ExcepcionKublakan, ExcepcionOrtografia{
		
		String men = "";
		
		if(nom.equalsIgnoreCase("kira")) {
			
			men = "Descripcion:\nEdad: " + kira.getEdad() + "\nEstatura: " + kira.getEstatura()+"m" + "\nColor de ojos: " + kira.getColorO() + 
					"\nAlma: " + kira.getAlma() + "\nCaracteristicas:\nCreacion de fuego: " + kira.crearF() + "\nMovilidad: " + kira.volar() + 
					"\nControl del tiempo: " + kira.detenerF() + "\nLocalización: " +  kira.habitar() + "\nSentimientos: " + kira.sentir();
			
		}else if(nom.equalsIgnoreCase("astar")) {
			
			men = "Descripcion:\nEdad: " + astar.getEdad() + "\nEstatura: " + astar.getEstatura()+"m" + "\nColor de ojos: " + astar.getColorO() + 
					"\nAlma: " + astar.getAlma() + "\nCaracteristicas:\nCreacion de fuego: " + astar.crearF() + "\nMovilidad: " + astar.volar() + 
					"\nControl del tiempo: " + astar.detenerF() + "\nLocalización: " +  astar.habitar() + "\nSentimientos: " + astar.sentir();
			
		}else if(nom.equalsIgnoreCase("sebastian")) {
			
			men = "Descripcion:\nEdad: " + sebas.getEdad() + "\nEstatura: " + sebas.getEstatura()+"m" + "\nColor de ojos: " + sebas.getColorO() + 
					"\nAlma: " + sebas.getAlma() + "\nCaracteristicas:\nConocimientos: " + sebas.adquirirC() + "\nFamilia: " + sebas.tenerF() + 
					"\nProfesion: " + sebas.ejercerp() + "\nLocalización: " +  sebas.habitar() + "\nSentimientos: " + sebas.sentir();
			
		}else if(nom.equalsIgnoreCase("renk")) {
			
			men = "Descripcion:\nEdad: " + renk.getEdad() + "\nEstatura: " + renk.getEstatura()+"m" + "\nColor de ojos: " + renk.getColorO() + 
					"\nAlma: " + renk.getAlma() + "\nCaracteristicas:\nMovilidad: " + renk.arrastrar() + 
					"\nLocalización: " +  renk.habitar() + "\nSentimientos: " + renk.sentir();
			
		}else if(nom.equalsIgnoreCase("kublakan")) {
			
			throw new ExcepcionKublakan();
			
		}else{
			
			throw new ExcepcionOrtografia();
			
		}
		
		return men;
		
	}

}
