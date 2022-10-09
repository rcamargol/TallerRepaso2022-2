package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Cynusx1;
import co.edu.unbosque.model.numeroequivocado;
import co.edu.unbosque.view.View;

public class Controller {
	private View gui;
	private Cynusx1 cy;
public Controller() {
	gui= new View();
	cy= new Cynusx1();	
		funcionar ();
		
	}
public void funcionar () {
	  menu();
	
}
public  void menu() {
	String men;
	int num=0;
	men=	"seleccione su personaje\n"
			+"1.Astar \n"
			+"2.Kira\n"
			+"3.Fernando\n"
			+"4.Renk\n"
			+"5. Salir ";
	num=Integer.parseInt(gui.pedir(men));
	
		
	switch (num) {
	case 1: 
		investigar1();
	break;
	
	case 2:
		investigar2();
		break;
	case 3:
		investigar3();
		break;
	case 4:
		investigar4();
		break;
	case 5:
		investigar5();
		break;
	}
	}

private void investigar5() {
	System.exit(0);
	}
private void investigar4() {
	// TODO Auto-generated method stub
	gui.Mostrar(cy.getRe().toString()	);
	menu();
}
private void investigar3() {
	// TODO Auto-generated method stub
	gui.Mostrar(cy.getFer().toString()	);
	menu();
}
private void investigar2() {
	// TODO Auto-generated method stub
	gui.Mostrar(cy.getKir().toString()	);
	menu();
}
private void investigar1() {
	// TODO Auto-generated method stub
	gui.Mostrar(cy.getAst().toString()	);
	menu();

}

			
}



