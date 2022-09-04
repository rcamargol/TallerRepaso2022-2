package co.edu.unbosque.controller;



import co.edu.unbosque.model.DigitoCel;
import co.edu.unbosque.model.Frase;
import co.edu.unbosque.model.LetraApellido;
import co.edu.unbosque.model.MesNacimiento;
import co.edu.unbosque.view.VerVentanas;

public class Controller {

	private VerVentanas vista1;
	private LetraApellido ap;
	private Frase f;
	private MesNacimiento m;
	private DigitoCel c;
	
	public Controller() {
		
		vista1 = new VerVentanas();
		ap = new LetraApellido();
		f = new Frase();
		m = new MesNacimiento(); 
		c = new DigitoCel();
		funcionar();
		
	}
	
	public void funcionar() {
		
		    letraApellido();
		    mesNacimiento();
		    numeroTelefonico();
		    vista1.mostrarInformacion(f.fraseCompleta());
		    funcionar();
	}
	  
	public void letraApellido() {
		String menu1 = "******SELECCIONE LA PRIMERA LETRA DE SU APELLIDO******"+"\n"+"\n"+
	              "\tA. LA VERDADERA"+"                    "+"J. LA GRAN"+"                              "+"S. LA FANTÁSTICA"+"\n"+
			      "\tB. LA EXITANTE "+"                       "+"K. LA PENOSA"+"                          "+"T. LA TERRORÍFICA"+"\n"+
	              "\tC. LA HORRIPILANTE"+"               "+"L. LA TRISTE"+"                            "+"U. LA ABURRIDA"+"\n"+
			      "\tD. LA ALEGRE"+"                           "+"M. LA DESASTROSA"+"               "+"V. LA INCREIBLE"+"\n"+
	              "\tE. LA FATAL"+"                               "+"N. LA HERMOSA"+"                     "+"W. LA DESGRACIADA"+"\n"+
 		          "\tF. LA APASIONANTE"+"                "+"O. LA OSCURA"+"                         "+"X. LA LAMENTABLE"+"\n"+
	              "\tG. LA TRÁGICA"+"                          "+"P. LA GLORIOSA"+"                      "+"Y. LA CÓMICA"+"\n"+
			      "\tH. LA SANGRIENTA"+"                  "+"Q. LA INFELIZ"+"                            "+"Z. LA MISERABLE"+"\n"+
	              "\tI. LA FAMOSA"+"                            "+"R. LA EMOCINANTE";
		
		String opci = vista1.leerDato(menu1);
		char opcion2 = Character.toUpperCase(opci.charAt(0));
	     
		switch (opcion2) {
		case 'A':
			f.incializarParte1(ap.a());
          
			break;

		case 'B':
			f.incializarParte1(ap.b());
			
			break;
			
		case 'C':
			f.incializarParte1(ap.c());
			
			break;
			
		case 'D':
			f.incializarParte1(ap.d());
			
			break;
			
		case 'E':
			f.incializarParte1(ap.e());
			
			break;
		case 'F':
			f.incializarParte1(ap.f());
			
			break;
		case 'G':
			f.incializarParte1(ap.g());
			
			break;
		case 'H':
			f.incializarParte1(ap.h());
			
			break;
		case 'I':
			f.incializarParte1(ap.i());
			
			break;
		case 'J':
			f.incializarParte1(ap.j());
			
			break;
		case 'K':
			f.incializarParte1(ap.k());
			
			break;
		case 'L':
			f.incializarParte1(ap.l());
			
			break;
		case 'M':
			f.incializarParte1(ap.m());
			
			break;
		case 'N':
			f.incializarParte1(ap.n());
			
			break;
		case 'O':
			f.incializarParte1(ap.o());
			
			break;
		case 'P':
			f.incializarParte1(ap.p());
			
			break;
		case 'Q':
			f.incializarParte1(ap.q());
			
			break;
		case 'R':
			f.incializarParte1(ap.r());
			
			break;
		case 'S':
			f.incializarParte1(ap.s());
			
			break;
		case 'T':
			f.incializarParte1(ap.t());
			
			break;
		case 'U':
			f.incializarParte1(ap.u());
			
			break;
		case 'V':
			f.incializarParte1(ap.v());
			
			break;
		case 'W':
			f.incializarParte1(ap.w());
			
			break;
		case 'X':
			f.incializarParte1(ap.x());
			
			break;
		case 'Y':
			f.incializarParte1(ap.y());
			
			break;
		case 'Z':
			f.incializarParte1(ap.z());
			
			break;
			
		default:
			vista1.mostrarInformacion("PORFAVOR INTENTE DE NUEVO");
			letraApellido();
			break;
		}
  
	}
	
	public void mesNacimiento() {
		String menu = "****SELECCIONE EL DIGITO QUE CORRESPONDE A SU MES DE NACIMIENTO****"+"\n"+"\n"+
	             
	              "\t1. ENERO"+"\n"+
			      "\t2. FEBRERO"+"\n"+
	              "\t3. MARZO"+"\n"+
			      "\t4. ABRIL"+"\n"+
	              "\t5. MAYO"+"\n"+
			      "\t6. JUNIO"+"\n"+
			      "\t7. JULIO"+"\n"+
			      "\t8. AGOSTO"+"\n"+
	              "\t9. SEPTIEMBRE"+"\n"+
			      "\t10. OCTUBRE"+"\n"+
	              "\t11. NOVIEMBRE"+"\n"+
			      "\t12. DICIEMBRE";
	  int num = vista1.leerdatoEntero(menu);
	  
	  switch (num) {
	 
		case 1:
			f.incializarParte2(m.enero());
			break;
		case 2:
			f.incializarParte2(m.febrero());
			break; 
		case 3:
			f.incializarParte2(m.marzo());
			break; 	
		case 4:
			f.incializarParte2(m.abril());
			break; 
		case 5:
			f.incializarParte2(m.mayo());
			break;
		case 6:
			f.incializarParte2(m.junio());
			break;
		case 7:
			f.incializarParte2(m.julio());
			break;
		case 8:
			f.incializarParte2(m.agosto());
			break; 
		case 9:
			f.incializarParte2(m.septiembre());
			break; 	
		case 10:
			f.incializarParte2(m.octubre());
			break; 
		case 11:
			f.incializarParte2(m.noviembre());
			break;
		case 12:
			f.incializarParte2(m.diciembre());
			break;	
			
		default:
			vista1.mostrarInformacion("PORFAVOR INTENTE DE NUEVO");
			mesNacimiento();
			break;
	}
	  
		  
	}
	
	public void numeroTelefonico() {
		String menu2 = "****SELECCIONE EL ULTIMO DIGITO DE SU NUMERO TELEFONICO ****"+"\n"+"\n"+
	             
                  "\t0. DE UN BIPOLAR"+"\n"+
	              "\t1. DE UN ASESINO/A"+"\n"+
			      "\t2. DE UN LOCO/A"+"\n"+
	              "\t3. DE UN ADICTO/A LOS MEMES"+"\n"+
			      "\t4. DE UN SOÑADOR/A"+"\n"+
	              "\t5. DE UN GENIO/A INCOMPRENDIDO/A"+"\n"+
			      "\t6. DE UN SIMBOLO SEXUAL"+"\n"+
			      "\t7. DE UN ALCOHÓLICO/A"+"\n"+
			      "\t8. DE UN GUERRERO/A"+"\n"+
	              "\t9. DE UN AVENTURERO/A";
	  int num2 = vista1.leerdatoEntero(menu2);
	  
	  switch (num2) {
		
		case 0:
			f.incializarParte3(c.d0());
			break;
		case 1:
			f.incializarParte3(c.d1());
			break; 
		case 2:
			f.incializarParte3(c.d2());
			break; 	
		case 3:
			f.incializarParte3(c.d3());
			break; 
		case 4:
			f.incializarParte3(c.d4());
			break;
		case 5:
			f.incializarParte3(c.d5());
			break;
		case 6:
			f.incializarParte3(c.d6());
			break;
		case 7:
			f.incializarParte3(c.d7());
			break; 
		case 8:
			f.incializarParte3(c.d8());
			break; 	
		case 9:
			f.incializarParte3(c.d9());
			break; 
			
			
		default:
			vista1.mostrarInformacion("PORFAVOR INTENTE DE NUEVO");
			numeroTelefonico();
			break;
	}
	  
	
	  
	  }
	
        }
		
		
		
	  


	
	
	
	

