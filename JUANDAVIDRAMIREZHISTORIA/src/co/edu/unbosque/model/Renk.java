package co.edu.unbosque.model;

public class Renk extends Desterrados {
	private String Ego;
	private String audacia;
	
	public Renk() {
		super.edad= 100;
		super.alma= false;
		super.colorojos= "Verde";
		super.estatura= 1.40;
		super.rencor="Este desterrado tiene mucho rencor hacia KublaKan";
		super.desespero="Este desterrado tiene mucho desespero ya que habita en la peor zona del planeta";
		this.Ego="Exeso de ego por su pasado turbio";
		this.audacia="este personaje es muy audaz por su personalidad";
	}
	
public String habitar() {
		
		return "habitan en el extremo sur del planeta";
	}


	
	public String getEgo() {
	return Ego;
}

public void setEgo(String ego) {
	Ego = ego;
}

public String getAudacia() {
	return audacia;
}

public void setAudacia(String audacia) {
	this.audacia = audacia;
}

	@Override
	public String arrastrar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Sentir() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Habitar() {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
