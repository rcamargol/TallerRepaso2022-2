package co.edu.unbosque.Model.Persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class Filefrases {
	private String data = "src/co/edu/unbosque/Model/Persistence/numero.txt";
	public String LeerArchivo(String letras) {
		String linea ="";
		String cadena = "";
		 File fi = new File (this.data);
		 

			JFileChooser j = new JFileChooser();
			j.showSaveDialog(j);
			File f= j.getSelectedFile();
			
		 try {
			 FileReader frd =new FileReader(f);
			 BufferedReader br = new BufferedReader(frd);
			 linea= br.readLine();
			 while(linea !=null) {
				 cadena +=linea;
				 linea= br.readLine();
				 
			 }
			 frd.close();
		 }catch(IOException e) {
			 return null;
		 }
		 return cadena;
	}

	public int datosarchivos (String dato) {
		JFileChooser JFC = new JFileChooser();
		
		JFC.showSaveDialog(JFC);
		File f = JFC.getSelectedFile();
		try {
			FileWriter fw = new FileWriter (f);
			PrintWriter pw = new PrintWriter (fw);
			pw.print(dato);
			fw.close();
		}catch (IOException e ) {
			return 1;	
		}
		return 0;
	}
}
