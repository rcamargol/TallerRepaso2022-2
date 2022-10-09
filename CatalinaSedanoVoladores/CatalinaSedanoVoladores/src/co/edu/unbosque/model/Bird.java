package co.edu.unbosque.model;

public class Bird implements Flyer{

	private String Calor;
	
	public Bird () {
		
	}
	public String construirNido() {
		return "-Antes de poner los huevos debemos construir un nido.Normalmente, lo hacemos con cabuyas, hojas, palitos de los arboles y hasta cabello. ¡HAY QUE TRABAJAR! ";
		
	}

	public String ponerHuevos () {
		return "-En lo personal poner huevos no es de mis actividades favoritas. Cuando ponemos huevos no podemos ir a bailar a la 85, tampoco podemos ver netflix porque se puede caer, se los pueden comer o enfriar.  ";
	}
	public String comer () {
		return "-Nos encanta comer papitas fritas, hamburguesas y todo lo que tenga que ver con lo dulce. ¿Quien dijo que solo comemos alpiste?";
	}
	
	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "-Antes de despegar tomamos una copita de cafe, estiramos las alas y nos limpiamos el pico ¡Ante todo la presentacion!";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "-Normalmente para aterrizar solo estiramos las patas y abrimos las alas totalmente y bajamos con calma, a menos de que tengamos una urgencia santaria." + "\n" + "Aunque hacer las necesidades en el aire es mas divertido ¡Claro que para ustedes no!";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "-Mientras volamos llevamos un aparato electronico para ir viendo netflix. Por cierto, pasion de gabilanes esta imperdible, pero ¡OJO CON LOS LADRONES!";
	}
	
	public String textoBird () {
		return "Me llamo piolin y hoy vengo a contarte algunas cosas que nos caracterizan de los demas voladores" + "\n" + despegar() + "\n" + volar () + "\n" + aterrizar () + "\n" + comer() + "\n" + ponerHuevos() + "\n" + construirNido();
	}
}