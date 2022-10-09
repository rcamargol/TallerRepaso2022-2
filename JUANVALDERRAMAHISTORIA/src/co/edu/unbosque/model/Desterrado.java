package co.edu.unbosque.model;

public class Desterrado extends Descendiente{
	
	private String lugardeorigen;
	private String lugardedestino;
	private int vidarestante;
	
	public Desterrado() {
		this.lugardeorigen = "";
		this.lugardedestino = "";
		this.vidarestante = 0;
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habita en el sur del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Solo siente a si mismo";
	}

	public String getLugardeorigen() {
		return lugardeorigen;
	}

	public void setLugardeorigen(String lugardeorigen) {
		this.lugardeorigen = lugardeorigen;
	}

	public String getLugardedestino() {
		return lugardedestino;
	}

	public void setLugardedestino(String lugardedestino) {
		this.lugardedestino = lugardedestino;
	}

	public int getVidarestante() {
		return vidarestante;
	}

	public int calcularVidaRest() throws SupervivienteException {
		SupervivienteException e = new SupervivienteException(null);
		int edadfinal = 0;
		if (edadfinal >= 0) {
			edadfinal = 1500 - this.edad;
		}
		else {
			e.printStackTrace();
		}
		return (edadfinal);
	}

	@Override
	public String toString() {
		return "Tengo " + edad + " años, y mi alma es " + alma;
	}
	
	
	
	
	
	
	
	
	
	
	
}
