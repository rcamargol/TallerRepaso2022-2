package model;

public class usuario {
String nombre;
int mes;
int tel;
String letrero;



public usuario(String pnom, int pmes, int ptel) {
	nombre = pnom;
	mes = pmes;
	tel = ptel;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nom) {
	this.nombre = nom;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public int getTel() {
	return tel;
}
public void setTel(int tel) {
	this.tel = tel;
}
@Override
public String toString() {
	return "usuario [nombre=" + nombre + ", mes=" + mes + ", tel=" + tel + ", letrero=" + letrero + "]";
}

}
