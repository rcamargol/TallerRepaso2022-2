package co.edu.unbosque.Controller;
import co.edu.unbosque.Model.datosUsuario;
import co.edu.unbosque.View.Vista;

public class Controlador {

	private datosUsuario daUs;
	private Vista view;

	public Controlador()  {
	daUs = new datosUsuario();
	view = new Vista();
	resultadosFinal( );
	}
	
	private void resultadosFinal() {
		String letrApellido = asignarApellido();
		String mesCumple =asignarCumple();
		String numeroTel = asignarTel();
		view.mostrarResultados("El libro de tu vida llamará: "+ letrApellido + mesCumple  +numeroTel);
	}

	// metodo encargado para el ult. digito 
	public String asignarTel(  ) {
		int i;
		i =view.pedirTel();
		String numero1 = null;
		
		  if(i==0) {  
			  numero1 = "De un bipolar.";
		  }
		  if(i==1) {  
			  numero1 = "De un asesino/a.";
		  }
		  if(i==2) {  
			  numero1 = "De un/a loco/a.";
		  }
		  if(i==3) {  
			  numero1 = "De un adicto/a a los memes.";
		  }
		  if(i==4) {  
			  numero1 = "De un soñador/a.";
		  }
		  if(i==5) {  
			  numero1 = "De un genio/a Incomprendido/a.";
		  }
		  if(i==6) {  
			  numero1 = "De un símbolo sexual.";
		  }
		  if(i==7) {  
			  numero1 = "De un alchólico/a.";
		  }
		  if(i==8) {  
			  numero1 = "De un guerrero/a.";
		  }
		  if(i==9) {  
			  numero1 = "De un aventurero/a.";
		  }
	  while(i>9) {
		  view.mensajeTerminal();
		  return numero1;
		  
	  }
	  while(i<0) {
		  view.mensajeTerminal();
		  break;
	  }
		
	
	  return numero1;
	}
	// metodo encargado para el mes de nacimiento
		  public String asignarCumple( ) {
			String mes;
			mes = view.pedirmesNaci();
			
			  if(mes=="Enero") {  
				  mes = "Hazaña  ";
			  }
			  if(mes=="Febrero") {  
				  mes = "Reencarnación  ";
			  }
			  if(mes=="Marzo") {  
				  mes = "Batalla  ";
			  }
			  if(mes=="Abril") {  
				  mes = "Existencia  ";
			  }
			  if(mes=="Mayo") {  
				  mes = "Muerte  ";
			  }
			  if(mes=="Junio") {  
				  mes = "Misión  ";
			  }
			  if(mes=="Julio") {  
				  mes = "Venganza  ";
			  }
			  if(mes=="Agosto") {  
				  mes = "Anécdota  ";
			  }
			  if(mes=="Septiembre") {  
				  mes = "Vida  ";
			  }
			  if(mes=="Octubre") {  
				  mes = "Leyenda  ";
			  }
			  if(mes=="Noviembre") {  
				  mes = "Historia  ";
			  }
			  if(mes=="Diciembre") {  
				  mes = "Biografía  ";
			  }
			return mes;					
		  }
	
		  public String asignarApellido() {
			  String ape;
			  ape = view.pedirApellido();
			  
			  if(ape=="Aa") {  
				  ape = "La verdadera ";
			  }
			  if(ape=="Bb") {  
				  ape = "La excitante ";
			  }
			  if(ape=="Cc") {  
				  ape = "La Horripilante ";
			  }
			  if(ape=="Dd") {  
				  ape = "La alegre ";
			  }
			  if(ape=="Ee") {  
				  ape = "La fatal ";
			  }
			  if(ape=="Ff") {  
				  ape = "La apasionante ";
			  }
			  if(ape=="Gg") {  
				  ape = "La trágica ";
			  }
			  if(ape=="Hh") {  
				  ape = "La sangrienta ";
			  }
			  if(ape=="Ii") {  
				  ape = "La famosa ";
			  }
			  if(ape=="Jj") {  
				  ape = "La gran ";
			  }
			  if(ape=="Kk") {  
				  ape = "La penosa ";
			  }
			  if(ape=="Ll") {  
				  ape = "La triste ";
			  }
			  if(ape=="Mm") {  
				  ape = "La desastrosa";
			  }
			  if(ape=="Nn") {  
				  ape = "La hermosa ";
			  }
			  if(ape=="Oo") {  
				  ape = "La oscura ";
			  }
			  if(ape=="Pp") {  
				  ape = "La gloriosa ";
			  }
			  if(ape=="Qq") {  
				  ape = "La infeliz";
			  }
			  if(ape=="Rr") {  
				  ape = "La emocionante";
			  }
			  if(ape=="Ss") {  
				  ape = "La fantástica";
			  }
			  if(ape=="Tt") {  
				  ape = "La terrorífica";
			  }
			  if(ape=="Uu") {  
				  ape = "La aburrida";
			  }
			  if(ape=="Vv") {  
				  ape = "La increíble";
			  }
			  if(ape=="Ww") {  
				  ape = "La desgraciada";
			  }
			  if(ape=="Xx") {  
				  ape = "La lamentable";
			  }
			  if(ape=="Yy") {  
				  ape = "La cómica";
			  }
			  if(ape=="Zz") {  
				  ape = "La miserable";
			  }
			  
			return ape;
			  
		  }
	
	
}
