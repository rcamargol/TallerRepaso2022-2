package co.edu.unbosque.model;


	public class Astar extends Heroe{
		
		private String valor;
		private String autoridad;
		
		public Astar() {
			super.edad =345;
			super.estatura = 3;
			super.bondad = "no la tiene, solo busca justicia";
			super.nivelPoder = "es uno de los 10 heroes mas poderosos de la creacion";
			super.alma = true;
			super.colordeojos = "morados";
			this.valor = "no le teme a nada ";
			this.autoridad = "es el mas destacado de los heroes, apesar de su orgullo";
		}

		public String establecerAlma() {
			String rta = "";
			if(alma = true) {
				rta = "Astar posee un alma verdadera, anque solo busque justicia ";
			}
			return rta;
			}
		@Override
		public String Volar() {
			return "Astar puede volar a grandes velosidades al rededor del planeta ";
		}

		@Override
		public String crearFuego() {
			return "Astar genera fuego de sus manos ";
		}
		
		@Override
		public String detenerTiempo() {
			return "Astar puede detener el tiempo cuando lo necesite ";
		}
			
		
		
		public String incrementarPoder() {
			return "Astar puede multiplicsr su puder original mil veces ";
		}
		
		public String congelar() {
			return "puede congelar a sus oponentes a su antojo ";
		}

		public String getValor() {
			return valor;
		}

		public void setValor(String valor) {
			this.valor = valor;
		}

		public String getAutoridad() {
			return autoridad;
		}

		public void setAutoridad(String autoridad) {
			this.autoridad = autoridad;
		}

		@Override
		public String habitar() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String sentir() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			return "Edad: " + edad + " años" + "\n" +
					"Altura: " + estatura + " metros" + "\n" +
					"Color de ojos: " + colordeojos + "\n"+  
					"Astar es un ser que cree en la justicia a toda costa, no le importa sacrificar a los demas con tal de que se compla la justicia"
					+ "\n" + 
					Habitar() + "\n"  +
					Sentir() + "\n"  +
					"Astar posee 5 poderes: " + "\n" + 
					" \t1. " +crearFuego() + "\n"  +
					" \t2. " +detenerTiempo() + "\n" +
					" \t3. " +Volar() + "\n" + 
					" \t4. "+congelar() + "\n" +
					" \t3. "+incrementarPoder()+ "\n" +
					establecerAlma();
		}
		
	}


