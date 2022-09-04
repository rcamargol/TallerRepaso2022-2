package Controller;

import Controller.Controlador;
import Model.EscogerApe;
import Model.EscogerCel;
import Model.EscogerMes;
import View.View;

public class Controlador {
		private EscogerApe Ape;
		private EscogerMes mes;
		private EscogerCel cel;
		private View view;

		public Controlador() {
			Ape = new EscogerApe();
			mes = new EscogerMes();
	    	cel = new EscogerCel();
	    	view = new View();
			funcionar();
		}

		private void funcionar() {
			String menu = "Bienvenido"+"\n"+
					"\t1. Descubrir el nombre del libro de tu vida" + 
					"\n"+"\t2. Salir" +
					"\n"
					+ "\n" +
					"Digite la opci�n a realizar" + "\n";
			
			int opcion = (int) view.leerEntero(menu);

			switch (opcion) {
			case 1:
				respuesta(letras(),cumpleaños(),numero());
				break;
			case 2:
				view.mostrarInfo("HASTA PRONTO");
				break;
			}

		}

		private String letras() {
			return view.leerString("Digita la primera letra de su primer apellido: "
					+ ""+"\n"+"A"+
					"\n"+"B "+
					"\n"+"C"+
					"\n"+"D "+
					"\n"+"E "+
					"\n"+"F "+
					"\n"+"G "+
					"\n"+"H "+
					"\n"+"I "+
					"\n"+"J "+
					"\n"+"K "+
					"\n"+"L "+
					"\n"+"M "+
					"\n"+"N "+
					"\n"+"O "+
					"\n"+"P "+
					"\n"+"Q "+
					"\n"+"R "+
					"\n"+"S "+
					"\n"+"T "+
					"\n"+"U "+
					"\n"+"V "+
					"\n"+"W "+
					"\n"+"X "+
					"\n"+"Y "+
					"\n"+"Z ");

		}

		private String cumpleaños() {
			return view.leerString
					("Digite el mes de su cumplea�os: \n"+
		              "1. Enero \n"+
					  "2.Febrero \n"+
		              "3.Marzo \n"+
					  "4.Abril \n"+
		              "5.Mayo \n"+
					  "6.Junio \n"+
		              "7.Julio\n"+
					  "8.Agosto \n"+
		              "9.Septiembre \n"+
					  "10.Octubre \n"+
		              "11.Noviembre\n" +
					  "12.Diciembre");
		}

		private int numero() {
			return view.leerEntero("Digite el ultimo digito de su numero de celular: ");

		}

		private void respuesta(String l, String m, int n) {
			view.mostrarInfo(Ape.Letra(l)+mes.Mes(m)+ cel.numero(n));

		}
	}



