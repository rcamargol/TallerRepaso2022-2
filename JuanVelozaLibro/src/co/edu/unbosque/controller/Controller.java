package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Letra;
import co.edu.unbosque.model.Mes;
import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.View;

public class Controller {

	private View vista;
	private Letra letra;
	private Mes mes;
	private Numero num;
	
	public Controller() {
		vista = new View();
		letra = new Letra();
		mes = new Mes();
		num = new Numero();
		funcionar();
		
	}
	
	public void funcionar() {
		
		
		int aux = vista.leerDato("Ingrese la primera letra de su primer apellido "+ "\n" + "\t1 A" + "\n" +"\t2 B" + "\n" + "\t3 C"
				+ "\n" +"\t4 D" + "\n" + "\t5 E" + "\n" + "\t6 F" + "\n" + "\t7 G" + "\n" + "\t8 H" + "\n" + 
				"\t9 I" + "\n" + "\t10 I" + "\n" + "\t11 J" + "\n" + "\t12 K" + "\n" + "\t13 L" + "\n" +"\t14 M" + "\n" + "\t15 N"
				+ "\n" +"\t16 O" + "\n" + "\t17 P" + "\n" + "\t18 Q" + "\n" + "\t19 R" + "\n" + "\t20 S" + "\n" + 
				"\t21 T" + "\n" + "\t22 U" + "\n" + "\t23 V" + "\n" + "\t23 W" + "\n" + "\t24 X" + "\n" + "\t25 Y" + "\n" + "\t26 Z");
		letra.setX(aux);
		int aux2 =vista.leerDato( "Ingrese su mes de nacimiento: " + "\n" + "\t1 Enero" + "\n" +"\t2 Febrero" + "\n" + "\t3 Marzo"
				+ "\n" +"\t4 Abril" + "\n" + "\t5 Mayo" + "\n" + "\t6 Junio" + "\n" + "\t7 Julio" + "\n" + "\t8 Agosto" + "\n" + 
				"\t9 Septiembre" + "\n" + "\t10 Octubre" + "\n" + "\t11 Noviembre" + "\n" + "\t12 Diciembre");
		mes.setMes(aux2);
		int aux3 = vista.leerDato("Ingrese el ultimo digito de su telefono celular: ");
		num.setA(aux3);
		if(letra.getX() <= 26 && mes.getMes() <= 12 && num.getA() < 10 ) {
		vista.devolverInformacion("El nombre del libro de tu vida es: " + "\n" + letra.LetraApellido() + mes.mesElegido()+ " " + num.UltimoDigito());
		}else {
			vista.devolverEror("Ingrese valores validos");
		}
	}
}
