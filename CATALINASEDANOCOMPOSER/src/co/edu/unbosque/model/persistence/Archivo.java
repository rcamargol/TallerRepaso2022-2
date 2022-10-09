package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

	public int escribirArchivo(String dato, File cancion) {

        File f= cancion;

        try {
            FileWriter fw = new FileWriter(f); 
            PrintWriter pw = new PrintWriter(fw); 

            pw.println(dato); 
            fw.close();

        } catch (IOException e) {
            return -1;
        }

        return 0;
    }
	public String leerArchivo(File archivo) {
		String linea = "";
		String cadena = "";
		 File f= archivo;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while(linea != null) {
				cadena += linea + "\n";
				linea = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}

		return cadena;
	}
}

