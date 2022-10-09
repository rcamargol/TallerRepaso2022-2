package co.edu.unbosque.Model;

public class Pajaro extends Animal implements Volador{
	
	private String alas;
	public Pajaro() {
		super.corazon = true;
		this.alas = "Tengo 2 alas recubiertas de plumas que me ayudan a volar";
		}
		@Override
		public String despegar() {
			// TODO Auto-generated method stub
			return "Despego de mi nido moviendo mis alas con mucha rapidez ";
		}
		@Override
		public String aterrizar() {
			// TODO Auto-generated method stub
			return "Aveces aterrizo para cazar uno que otro gusano o semillas ";
		}
		String crearNido() {
			// TODO Auto-generated method stub
			return "Creo mi nido donde vivire y pondre mis huevos ";
		}
		String ponerHuevos() {
			// TODO Auto-generated method stub
			return "Pongo muchos huevos en mi vida para garantizar la supervivencia de mi especie";
		}

		@Override
		String comer() {
			// TODO Auto-generated method stub
			return "Como todos los animales y seres vivos necesito "
					+ "comer para sobrevivir, y para que mis crias sobrevivan ";
		}

		
		String cantar() {
			// TODO Auto-generated method stub
			return "Todas las mañanas canto hermosas melodias";
		}
		@Override
		public String volar() {
			// TODO Auto-generated method stub
			return "Mi vida se basa en volar y volar por todo el mundo";
		}
			
		
		public String descPajaro() {
			return "Soy un pajaro, odio a los humanos , bueno, excepto a los que me dan comida :3" + "\n" +
					alas + "\n"  +
					cantar() + "\n"  +
					crearNido() + "\n"  +
					ponerHuevos() + "\n"  +
					comer()+ "\n" +
					volar() + "\n"  +
					despegar() + "\n"  +
					aterrizar();
					 

	}
}
