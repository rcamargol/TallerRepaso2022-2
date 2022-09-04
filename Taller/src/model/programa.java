package model;

import java.util.Arrays;

import javax.swing.JOptionPane;
import model.usuario;
public class programa {
	private usuario usu;
	private String[] apellidos;
	private String[] meses;
	private String[] telefono;
	private char pos1;
	private String titulo;
	private int ap;
	private int ms;
	private int tl;
	char char1 = 'a';
	char char2 = 'b';
	char char3 = 'c';
	char char4 = 'd';
	char char5 = 'e';
	char char6 = 'f';
	char char7 = 'g';
	char char8 = 'h';
	char char9 = 'i';
	char char10 ='j';
	char char11= 'k';
	char char12= 'l';
	char char13= 'm';
	char char14= 'n';
	char char15= 'ñ';
	char char16= 'o';
	char char17= 'p';
	char char18= 'q';
	char char19= 'r';
	char char20= 's';
	char char21= 't';
	char char22= 'u';
	char char23= 'v';
	char char24= 'w';
	char char25 ='x';
	char char26= 'y';
	char char27 = 'z';
public programa() {
	
String apellidos[]={"la verdadera","la exitante ","la horripilante","la alegre","la fatal","la apasionante","la tragica"
		+ "la sangrienta ","la famosa","la gran","la penosa","la triste","la desastrosa","la hermosa","la oscura","la gloriosa","la infeliz"
		+"la emosionante","la fantastica","la terrorifica","la aburrida","la increible","la desgraciada","la lamentable","la comica","la miserable"};
String meses[]={"hazaña","reencarnacion","batalla","existencia","muerte","mision","venganza","anecdota","vida","leyenda","historia","biografia"};
String telefono[]={"de un bipolar","de un asesino/a","de un loco/a","de un adicto/ a los memes","de un soñador/a","de un genio/a incomprendido/a","de un simbolo sexual","de un alcoholico/a","de un gerrero/a","de un aventurero"};

}
public void trascripcion() {
	
	JOptionPane.showMessageDialog(null, "Bienvenido a su programa de creacion de titulo");
	pos1=JOptionPane.showInputDialog("dijite la primera letra de tu primer apellido(minusculas)").charAt(0);
	ms=Integer.parseInt(JOptionPane.showInputDialog("dijite su mes de nacimiento(numerico)"));
	tl=Integer.parseInt(JOptionPane.showInputDialog("ultimo dijito de tu numero telefonico"));
	convercion();
	crearnombre(ap, ap, ap); 
	JOptionPane.showMessageDialog(null, (ap));
	JOptionPane.showMessageDialog(null, (titulo));
	;
}
public int convercion () {
	if (pos1 == char1) {
        ap=0;
    } else if(pos1== char2) {
    	ap=1;
    } else if(pos1== char3) {
    	ap=2;
    } else if(pos1== char4) {
    	ap=3;
    } else if(pos1== char5) {
    	ap=4;
    } else if(pos1== char6) {
    	ap=5;
    } else if(pos1== char7) {
    	ap=6;
    } else if(pos1== char8) {
    	ap=7;
    } else if(pos1== char9) {
    	ap=8;
    } else if(pos1== char10) {
    	ap=9;
    } else if(pos1== char11) {
    	ap=10;
    } else if(pos1== char12) {
    	ap=11;
    } else if(pos1== char13) {
    	ap=12;
    } else if(pos1== char14) {
    	ap=13;
    } else if(pos1== char15) {
    	ap=14;
    } else if(pos1== char16) {
    	ap=15;
    } else if(pos1== char17) {
    	ap=16;
    } else if(pos1== char18) {
    	ap=17;
    } else if(pos1== char19) {
    	ap=18;
    } else if(pos1== char20) {
    	ap=19;
    } else if(pos1== char21) {
    	ap=20;
    } else if(pos1== char22) {
    	ap=21;
    } else if(pos1== char23) {
    	ap=22;
    } else if(pos1== char24) {
    	ap=23;
    } else if(pos1== char25) {
    	ap=24;
    } else if(pos1== char26) {
    	ap=25;
    } else if(pos1== char27) {
    	ap=26;
    
    }
	return ap;
}
public void crearnombre(int ap, int ms,int tl) {
	
	String x= apellidos[ap];
	 String y=meses[ms];
	 String z=telefono[tl];
	 titulo= x+y+z;
	 System.out.println(titulo);


}		



}


	




