package co.edu.unbosque.model;

public class Facade {
	Airplane airP;
	SeaPlane seaP;
	Helicopter heli;
	Bird bird;
	Superman supM;
	Superboy supB;;
	Bizarro biza;

	public Facade() {
		airP = new Airplane();
		seaP = new SeaPlane();
		heli = new Helicopter();
		bird = new Bird();
		supM = new Superman();
		supB = new Superboy();
		biza = new Bizarro();
		funcionar();
	}
	public String funcionar() {
		return "Airplane:\n"+airP.charge()+"\nHelicopter:\n"+heli.roll()+"\nSeaplane:\n"+seaP.extinguishSeaFire()+"\nBird:\n"+bird.eat()+
				"\nSuperman:\n"+supM.stopBullet()+"\nSuperboy:\n"+supB.weakness()+"\nBizarro:\n"+biza.beAClone();
	}
}
