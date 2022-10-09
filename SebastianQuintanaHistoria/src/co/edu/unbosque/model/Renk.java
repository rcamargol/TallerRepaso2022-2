package co.edu.unbosque.model;


	public class Renk extends Desterrados{
		
		private String supervivencia;
		private String robo;
		
		public Renk() {
			super.edad = 670;
			super.estatura = 7.4;
			super.sufrimiento = "excesivo";
			super.rabia = "odio extremo";
			super.alma = false;
			super.colordeojos = "negros";
			this.supervivencia = "mas de 100 años sin comer";
			this.robo = "mas de 10 robos";
		}

		@Override
		public String Arrastrar() {
			return "El arrastarse de un lugar a otro hace que Renk quiera venganza ";
		}

		@Override
		public String herir() {
			return "para lastimar a sus victimas Renk utiliza sus sucias manos";
		}
		public String matar() {
			return "Renk puede llegar al punto de matar a sus victimas por placer";
		}
		public String robar() {
			return "Renk es un coleccionista, por lo que roba para comer y tener objetos valiosos";
		}

		public String getSupervivencia() {
			return supervivencia;
		}

		public void setSupervivencia(String supervivencia) {
			this.supervivencia = supervivencia;
		}

		public String getRobo() {
			return robo;
		}

		public void setRobo(String robo) {
			this.robo = robo;
		}

		@Override
		public String habitar() {
			// TODO Auto-generated method stub
			return "Renk,  habita el extremo sur del planeta ";
		}

		@Override
		public String sentir() {
			// TODO Auto-generated method stub
			return "Renk, solo es capaz de sentirse a el mismo, y no al resto de seres vivos";
		}
		@Override
		public String toString() {
			return "Edad: " + edad + " años" + "\n" +
					"Altura: " + estatura + " metros" + "\n" +
					"Color de ojos: " + colordeojos + "\n"+
					"Renk posee un alma falsa, por lo que lo hace un ser malo y lleno de venganza"  + "\n" + 
					habitar() + "\n"  +
					sentir() + "\n" +
					Arrastrar() + "\n" +
					herir() + "\n" + matar()+ "\n"+
					robar(); 
		}
		
	}

	