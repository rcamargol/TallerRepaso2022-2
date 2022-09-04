package co.edu.unbosque.controlador;
import co.edu.unbosque.vista.vista;
import co.edu.unbosque.modelo.Arreglo;
public class Controlador {
	private vista v;
	private Arreglo x;
	public Controlador() {
	v = new vista();
	x = new Arreglo();
	funcionar();
	}
	public void funcionar(){
		v.MostrarInfo(x.todo(v.pedirDatoabecedario(), v.pedirDatomeses(),  v.pedirDatotelefono()));
	}
}
