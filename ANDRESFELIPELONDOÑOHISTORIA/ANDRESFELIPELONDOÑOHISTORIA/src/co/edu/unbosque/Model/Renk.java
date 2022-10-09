package co.edu.unbosque.Model;

public class Renk extends Desterrados{

	public Renk() {
	super.alma = false;
	super.edad = 1500;
	}

	@Override
	String arrastrarse() {
		// TODO Auto-generated method stub
		return "Me he arrastrado toda mi vida ya que nuestro diós me "
				+ "discrimina por no tener alma :(, pero algun dia tendre mi venganza";
	}

	@Override
	String habitar() {
		// TODO Auto-generated method stub
		return "Vivo en el sur del planeta, un frio y desolado desierto donde los "
				+ "desterrados estamos condenados a arrastrarnos hasta el final de nuestros dias";
	}

	@Override
	String sentir() {
		// TODO Auto-generated method stub
		return "Solo puedo sentirme a mi mismo, a mi soledad";
	}
	
		
	
	public String descRenk() {
		return "Tengo " + edad + " años" + "\n" +
				"He sido maldecido con un alma falsa por nuestro dios,"
				+ " gracias a esto los heroes y mortales nos discriminan"  + "\n" + 
				arrastrarse()+ "\n" +
				habitar() + "\n"  +
				sentir();
				 

}
}