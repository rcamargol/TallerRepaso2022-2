package controller;

import javax.swing.JOptionPane;

import model.Libro;

public class Controlador {
	
	private Libro lib;
	
	public Controlador() {
		lib = new Libro();
		funcional();
	}
	
	public void funcional() {
		int opc;
		String menu = "BIENVENIDO AL CREADOR DEL LIBRO DE TU VIDA\n"+
				"1. Crea tu libro\n"+
				"2. Salir\n"+
				"\n"+
				"Seleccione la opcion que desee: \n";
		
		do {
		    opc = Integer.parseInt(JOptionPane.showInputDialog(menu,"Escriba aqui "));
			switch (opc) {
			case 1:
				crearLibro();		
			}
		}while (opc!=2);
	}
	
	public void crearLibro() {
		
		String letra;
		String mes = null;
		int telefono;
		String numero = null;
		
		letra = JOptionPane.showInputDialog("Digite la primera letra de su apellido: ");
		
		if (letra.equalsIgnoreCase("a")) {
			letra = "La verdadera";
		}
		if (letra.equalsIgnoreCase("b")) {
			letra = "La excitante";
		}
		if (letra.equalsIgnoreCase("c")) {
			letra = "La horripilante";
		}
		if (letra.equalsIgnoreCase("d")) {
			letra = "La alegre";
		}
		if (letra.equalsIgnoreCase("e")) {
			letra = "La fatal";
		}
		if (letra.equalsIgnoreCase("f")) {
			letra = "La apasionante";
		}
		if (letra.equalsIgnoreCase("g")) {
			letra = "La tragica";
		}
		if (letra.equalsIgnoreCase("h")) {
			letra = "La sangrienta";
		}
		if (letra.equalsIgnoreCase("i")) {
			letra = "La famosa";
		}
		if (letra.equalsIgnoreCase("j")) {
			letra = "La gran";
		}
		if (letra.equalsIgnoreCase("k")) {
			letra = "La penosa";
		}
		if (letra.equalsIgnoreCase("l")) {
			letra = "La triste";
		}
		if (letra.equalsIgnoreCase("m")) {
			letra = "La desastrosa";
		}
		if (letra.equalsIgnoreCase("n")) {
			letra = "La hermosa";
		}
		if (letra.equalsIgnoreCase("o")) {
			letra = "La oscura";
		}
		if (letra.equalsIgnoreCase("p")) {
			letra = "La gloriosa";
		}
		if (letra.equalsIgnoreCase("q")) {
			letra = "La infeliz";
		}
		if (letra.equalsIgnoreCase("r")) {
			letra = "La emocionante";
		}
		if (letra.equalsIgnoreCase("s")) {
			letra = "La fantastica";
		}
		if (letra.equalsIgnoreCase("t")) {
			letra = "La terrorifica";
		}
		if (letra.equalsIgnoreCase("u")) {
			letra = "La aburrida";
		}
		if (letra.equalsIgnoreCase("v")) {
			letra = "La increible";
		}
		if (letra.equalsIgnoreCase("w")) {
			letra = "La desgraciada";
		}
		if (letra.equalsIgnoreCase("x")) {
			letra = "La lamentable";
		}
		if (letra.equalsIgnoreCase("y")) {
			letra = "La comica";
		}	
		if (letra.equalsIgnoreCase("z")) {
			letra = "La miserable";
		}
		
		int opc;
		String menu = "Eliga su mes de nacimiento\n"+
				"1. Enero\n"+
				"2. Febrero\n"+
				"3. Marzo\n"+
				"4. Abril\n"+
				"5. Mayo\n"+
				"6. Junio\n"+
				"7. Julio\n"+
				"8. Agosto\n"+
				"9. Septiembre\n"+
				"10. Octubre\n"+
				"11. Noviembre\n"+
				"12. Diciembre\n"+
				"\n"+
				"Seleccione la opcion que desee: ";
		    opc = Integer.parseInt(JOptionPane.showInputDialog(menu,"Escriba aqui "));
			
				if(opc == 1) {
					mes = "Hazaña";
				}
				if(opc == 2) {
					mes = "Reencarnacion";
				}
				if(opc == 3) {
					mes = "Batalla";
				}
				if(opc == 4) {
					mes = "Existencia";
				}
				if(opc == 5) {
					mes = "Muerte";
				}
				if(opc == 6) {
					mes = "Mision";
				}
				if(opc == 7) {
					mes = "Venganza";
				}
				if(opc == 8) {
					mes = "Anecdota";
				}
				if(opc == 9) {
					mes = "Vida";
				}
				if(opc == 10) {
					mes = "Leyenda";
				}
				if(opc == 11) {
					mes = "Historia";
				}
				if(opc == 12) {
					mes = "Biografia";
				}
				
			telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el ultimo digito del numero de telefono: "));
			if (telefono >=0 && telefono <=9) {
				if (telefono == 0) {
					numero = "De un bipolar.";
				}
				if (telefono == 1) {
					numero = "de un asesino/a.";
				}
				if (telefono == 2) {
					numero = "de un loco/a.";
				}
				if (telefono == 3) {
					numero = "De un adicto/a a memes.";
				}
				if (telefono == 4) {
					numero = "De un soñador/a.";
				}
				if (telefono == 5) {
					numero = "De un genio/a incomprendido/a.";
				}
				if (telefono == 6) {
					numero = "De un simbolo sexual.";
				}
				if (telefono == 7) {
					numero = "De un alcoholico/a.";
				}
				if (telefono == 8) {
					numero = "De un guerrero/a.";
				}
				if (telefono == 9) {
					numero = "De un aventurero/a.";
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "El numero digitado no puede ser mayor a nueve");
			}
			
			JOptionPane.showMessageDialog(null, "El libro de tu vida es: "+letra+" "+mes+" "+numero);
	}
	

}
