package co.edu.unbosque.controller;
import co.edu.unbosque.model.Desterrado;
import co.edu.unbosque.model.Heroe;
import co.edu.unbosque.model.Mortal;
import co.edu.unbosque.view.View;


public class Controller {
	private View view; 

	private Heroe kira;
	private Heroe astar;
	private Mortal isabella; 
	private Desterrado renk; 
	
	
	public Controller() {
		
		view= new View () ; 
		
		kira= new Heroe ("Kira",3  , true, " 40 años ");
		kira.habitar();
		kira.sentir();
		kira.crearFuego();
		kira.volar();
		kira.detenerElTiempo();
		
	
		
		astar= new Heroe ("Astar",3, true,"33 años");
		astar.habitar();
		astar.sentir();
		astar.crearFuego();
		astar.volar();
		astar.detenerElTiempo();
		
		isabella = new Mortal ("Isabella", 1.65, "Ojos violetas", true, "19 años");
	
		isabella.aprender();
		isabella.adquirirConocimientos();
		isabella.habitar();
		isabella.tenerFamilia();
		isabella.sentir();
		isabella.profesion();
		
		renk= new Desterrado("Renk", 1.50, false, "1500años ");
		renk.arrastrar();
		renk.habitar();
		renk.sentir();
		renk.alma();
		
	
		view.smd(kira.habitar() +"\n" + kira.sentir()+ "\n"+ kira.detenerElTiempo()+ "\n" +kira.crearFuego()+"\n"+kira.volar()+ "\n" +"mi alma es: "+ kira.alma()+ "\n" +kira.altura());
		view.smd(astar.habitar()+"\n"+ astar.sentir()+"\n"+astar.detenerElTiempo() +"\n"+ astar.crearFuego()+"\n"+ astar.volar()+ "\n" +"mi alma es: "+ astar.alma()+ "\n" + astar.altura());
		view.smd(isabella.habitar()+"\n"+ isabella.sentir()+"\n"+ isabella.profesion()+"\n"+isabella.tenerFamilia()+"\n"+isabella.aprender()+ "\n" +"mi alma es: "+ isabella.alma()+ "\n" + isabella.colorOjos());
		view.smd(renk.habitar()+"\n"+ renk.sentir()+"\n"+ "mi alma es: "+renk.alma()+"\n"+ renk.arrastrar());
		
	}
	
	
	
}
