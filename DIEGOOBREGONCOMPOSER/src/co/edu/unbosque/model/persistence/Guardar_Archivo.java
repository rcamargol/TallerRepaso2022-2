package co.edu.unbosque.model.persistence;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Guardar_Archivo {
	
	private ArrayList body;
	private String extension=".txt";
	
	public Guardar_Archivo(ArrayList body, String extension) {
		this.body = body;
		this.extension = extension;
	}
	
	public Guardar_Archivo(){
	}

	public void crear(File guarda) throws IOException {
		  if(guarda !=null){
			    FileWriter  save=new FileWriter(guarda+extension);
			    PrintWriter pw = new PrintWriter(save);
			    for (int i = 0; i < body.size(); i++) {
			    	pw.println(body.get(i));
			    	if(i==3 || i==7 ||  i==11) {
			    		pw.println("");
			    	}
				}
			    save.close();
			    JOptionPane.showMessageDialog(null,
			         "El archivo se a guardado Exitosamente",
			             "Información",JOptionPane.INFORMATION_MESSAGE);
			    }
	}
	
	public ArrayList getBody() {
		return body;
	}

	public void setBody(ArrayList body) {
		this.body = body;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
		
}
