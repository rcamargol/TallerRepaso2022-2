package co.edu.unbosque.model;

public class Letra {
	
	private String palabra1 [] = {"mami ","bebe ","princess ","mami "};
	private String palabra2 [] = {"yo quielo ","yo puedo ","yo vengo a ","voy a "};
	private String palabra3 [] = {"entendelte ","amalte ","ligal ","jugal "};
	private String palabra4 [] = {"suave ","lento ","rapido ","fuelte "};
	private String palabra5 [] = {"hasta que salga el sol ","toda la noche ","hasta el amanecel ","todo el dia "};
	private String palabra6 [] = {"sin anestesia","sin compromiso","feis to feis","sin miedo"};
	private String e1 = "";
	private String e2 = "";
	private String e3 = "";
	private String lt;
	
	public String getLt() {
		return lt;
	}

	public void setLt(String lt) {
		this.lt = lt;
	}

	public String crearFrase() {
		int i=(int)(Math.random()*4);
		String p1;
		p1=palabra1[i];
		int j=(int)(Math.random()*4);
		String p2;
		p2=palabra2[j];
		int q=(int)(Math.random()*4);
		String p3;
		p3=palabra3[q];
		int r=(int)(Math.random()*4);
		String p4;
		p4=palabra4[r];
		int c=(int)(Math.random()*4);
		String p5;
		p5=palabra5[c];
		int v=(int)(Math.random()*4);
		String p6;
		p6=palabra6[v];
		return p1+p2+p3+p4+p5+p6;
	}
	
	public String crearTodasEstrofas() {
		for (int i=0; i<=3;i++) {
			e1 += crearFrase()+"\n";
			e2 += crearFrase()+ "\n";
			e3 += crearFrase()+ "\n";
		}
		lt=e1+"\n"+e2+"\n"+e3;
		return lt;
	}
	
	
	
}
