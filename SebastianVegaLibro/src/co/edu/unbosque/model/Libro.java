package co.edu.unbosque.model;

public class Libro {

	String [][] opciones1 = {{"a", "La verdadera "}, {"b", "La exitante "}, {"c", "La horripilante "},
			{"d","La alegre "},{"e", "La fatal "},{"f", "La apasionante "},{"g", "La tragica "},{"h", "La sangienta "},
			{"i", "La famosa "},{"j", "La gran "},{"k", "La penosa "},{"l", "La triste "},{"m", "La desastroza "},
			{"n", "La hermosa "},{"o", "La oscura "},{"p", "La gloriosa "},{"q", "La infeliz "},{"r", "La emocionante "},
			{"s", "La fantastica "},{"t", "La terrorifica "},{"u", "La aburrida "},{"v", "La increible "},{"w", "La desgraciada "},
			{"x", "La lamentable "},{"y", "La comica "},{"z", "La miserable "}};
	String [][] opciones2 = {{"Enero", "hazaña "}, {"Febrero", "reencarnacion "},{"Marzo", "batalla "},
			{"Abril", "existencia "},{"Mayo", "muerte "},{"Junio", "mision "},{"Julio", "venganza "},{"Agosto", "anecdota "},
			{"Septiembre", "vida "},{"Octubre", "leyenda "},{"Noviembre", "historia "},{"Diciembre", "biografia "}};
	String[] opciones3 = {"de un bipolar", "de un asesino/a", "de un loco/a","de un adicto/a a los memes","de un soñador",
			"de un genio/a incomprendido/a","de un simbolo sexual","de un alcoholico","de un gerrero/a", "de un aventurero/a"};
	
	public String NombreL(String l, String m, int n){
		
		String resultado = "¿El nombre de tu libro sería?: ";
		String p1 = "no se seleccionó una opcion correcta ";
		String p2 = "no se seleccionó una opcion correct ";
		String p3 = "no se seleccionó una opcion correcta ";
		
		for(int i = 0; i < 26; i++) {
			if(opciones1[i][0].equalsIgnoreCase(l)) {
				
				p1 = opciones1[i][1];
				
			}
			
		}
		for(int j = 0; j < 12; j++) {
			
			if(opciones2[j][0].equalsIgnoreCase(m)) {
				
				p2 = opciones2[j][1];
				
			}
			
		}
		
		if(n >= 0 && n <= 9) {
			
			p3 = opciones3[n];
			
		}
		
		return resultado + p1 + p2 + p3;
		
	}

}
