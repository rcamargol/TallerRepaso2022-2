package co.edu.unbosque.model.persistence;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

    public int escribirArchivo(String dato1, String cancion) {
				
		File f = new File(dato1); //aqui se llama la variable de archivo
		try {
			FileWriter fw = new FileWriter(f); // aqui se vuelve a llamara a la variable File
			PrintWriter pw = new PrintWriter(fw);//aqui se llama la variable de filewriter para poder escribir en el archivo
			
			pw.print(cancion); // se escribre el contenido del parametro
			
			fw.close(); //se cierra
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
}
