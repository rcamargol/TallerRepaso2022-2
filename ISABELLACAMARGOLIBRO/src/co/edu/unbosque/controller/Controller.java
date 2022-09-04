package co.edu.unbosque.controller;

import co.edu.unbosque.model.LetraPrimerApellido;
import co.edu.unbosque.model.MesNacimiento;
import co.edu.unbosque.model.UltimoDigitoTelefono;
import co.edu.unbosque.view.View;

public class Controller {

	private View vista;
	private LetraPrimerApellido letraPrimerApellido;
	private MesNacimiento mesNacimiento;
	private UltimoDigitoTelefono ultimoDigitoTelefono;

	public Controller() {
		vista = new View();

		letraPrimerApellido = new LetraPrimerApellido();
		letraPrimerApellido.setAllLetras();

		mesNacimiento = new MesNacimiento();
		mesNacimiento.setAllMeses();

		ultimoDigitoTelefono = new UltimoDigitoTelefono();
		ultimoDigitoTelefono.setAllDigitos();

	}

	public void run() {
		String title = "¿Cómo se llamaria el libro de tu vida?";
		String titleLetra = "Selecciona la primera letra de tu primer apellido";
		String titleMes = "Selecciona el mes de nacimiento";
		String titleDigito = "Selecciona el último dígito de tu número telefónico";
		String smsCancel = "Cancelaste la operacion o no seleccionaste ninguna opcion.";
		String inicio;
		String nudo;
		String desenlace;
		//
		String letraSelected = vista.sid(titleLetra, title, letraPrimerApellido.getAllLetras());
		if (letraSelected == null) {
			vista.smd(smsCancel);
			return;
		}
		//
		String mesSelected = vista.sid(titleMes, title, mesNacimiento.getAllMeses());
		if (mesSelected == null) {
			vista.smd(smsCancel);
			return;
		}
		//
		String digitoSelected = vista.sid(titleDigito, title, ultimoDigitoTelefono.getAllDigitos());
		if (digitoSelected == null) {
			vista.smd(smsCancel);
			return;
		}
		//
		System.out.println("Letra seleccionada: " + letraSelected);
		System.out.println("Mes seleccionado: " + mesSelected);
		System.out.println("Digito seleccionado: " + digitoSelected);
		//
		inicio = letraPrimerApellido.findInicioByLetra(letraSelected);
		nudo = mesNacimiento.findNudoByMes(mesSelected);
		desenlace = ultimoDigitoTelefono.findDesenlaceByDigito(digitoSelected);
		//
		vista.smd("¡" + inicio + " " + nudo + " " + desenlace + "!", title);
	}

}
