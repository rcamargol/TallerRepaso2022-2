package co.edu.unbosque.model;

public class Cynusx1 {
private Desterrado Re;
private Heroe Kir,Ast;
private Mortal Fer;
public Cynusx1() {
	Re= new Desterrado("Renk", "1500 años", "1,50 metros", "cafe", false);
	Kir= new Heroe("Kira", "200 años", "3 metros", "azul", true);
	Ast= new Heroe("Astar", "200 años", "3 metros", "verdes", true);
	Fer= new Mortal("Fernando", "100", "1,80 metros", "violeta", true);
}
public Desterrado getRe() {
	return Re;
}
public void setRe(Desterrado re) {
	Re = re;
}
public Heroe getKir() {
	return Kir;
}
public void setKir(Heroe kir) {
	Kir = kir;
}
public Heroe getAst() {
	return Ast;
}
public void setAst(Heroe ast) {
	Ast = ast;
}
public Mortal getFer() {
	return Fer;
}
public void setFer(Mortal fer) {
	Fer = fer;
}


}
