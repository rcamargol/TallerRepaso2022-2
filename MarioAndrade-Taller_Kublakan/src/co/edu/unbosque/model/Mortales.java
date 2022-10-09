package co.edu.unbosque.model;

	public class Mortales extends Kublakan{
		
		private String adconocimiento;
		private String familia;
		private String ejerprofesion;

		public Mortales(int edad, double estatura, String colojos, String alma) {
			super(edad, estatura, colojos, alma);
			// TODO Auto-generated constructor stub
			this.adconocimiento = adconocimiento;
			this.familia = familia;
			this.ejerprofesion = ejerprofesion;
		}

		@Override
		public boolean habitar() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean sentir() {
			// TODO Auto-generated method stub
			return false;
		}
		public String escribir() {
			return null;
		}
		public String leer() {
			return null;
		}

		public String getAdconocimiento() {
			return adconocimiento;
		}

		public void setAdconocimiento(String adconocimiento) {
			this.adconocimiento = adconocimiento;
		}

		public String getFamilia() {
			return familia;
		}

		public void setFamilia(String familia) {
			this.familia = familia;
		}

		public String getEjerprofesion() {
			return ejerprofesion;
		}

		public void setEjerprofesion(String ejerprofesion) {
			this.ejerprofesion = ejerprofesion;
		}
	}

