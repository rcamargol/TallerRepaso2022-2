package co.edu.unbosque.model;

public class CynuxX1 {

	private Kira kira;
	private Astar astar;
	private Diana diana;
	private Renk renk;

	public CynuxX1() {
		kira = new Kira();
		astar = new Astar();
		diana = new Diana();
		renk = new Renk();
	}

	public String pasarAlmaBooleanAString(boolean alma) throws ExcepcionPorAlmaDeRenk {
		String almafalsa = "";
		if (renk.alma == false) {
			almafalsa = "Falsa";
		} else {
			throw new ExcepcionPorAlmaDeRenk("Renk debe tener alma falsa porque es un desterrado.");
		}
		return almafalsa;
	}

	public int VerificarEdadDeRenk(int edad) throws ExcepcionPorEdadDeRenk {
		int edadRenk = 0;
		if (renk.edad < 1500) {
			edadRenk = renk.edad;
		} else {
			throw new ExcepcionPorEdadDeRenk(
					"Un desterrado no puede tener mas de 1500 años, en este caso Renk ya fallecio.");
		}
		return edadRenk;
	}

	public Kira getKira() {
		return kira;
	}

	public void setKira(Kira kira) {
		this.kira = kira;
	}

	public Astar getAstar() {
		return astar;
	}

	public void setAstar(Astar astar) {
		this.astar = astar;
	}

	public Diana getDiana() {
		return diana;
	}

	public void setDiana(Diana diana) {
		this.diana = diana;
	}

	public Renk getRenk() {
		return renk;
	}

	public void setRenk(Renk renk) {
		this.renk = renk;
	}
}
