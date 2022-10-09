package co.edu.unbosque.model.persistence;

import java.io.*;

import javax.swing.JFileChooser;

public class Archivo {
	
	private String archivodata ="C:\\data";

	public String escribirArchivo(String dato) {
	JFileChooser guardarComo = new JFileChooser();
	guardarComo.setApproveButtonText("Guardar");
	guardarComo.showSaveDialog(guardarComo);
	File archivo = new File(guardarComo.getSelectedFile()+".txt");
	try {
		BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
		salida.write(dato);
		salida.newLine();
		salida.append("\n");
		salida.close();
	}catch(IOException e) {
		return "No se pudo crear el archivo";
	}
	return "Se pudo crear el archivo";
}
	
	public String leerArchivo() {
		
		String linea = "";
		String cadena = "";

		JFileChooser j = new JFileChooser();	
		j.showSaveDialog(j);
		File f = j.getSelectedFile();

		try{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while(linea != null) {
				cadena += linea + "\n";
				linea = br.readLine();
			}
			fr.close();
		}catch(IOException e) {
			return null;
		}
		return cadena;
	}

}
