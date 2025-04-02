package SumaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

//		Declaramos los archivos
		File f1 = new File("NumSuma1.txt");
		File f2 = new File("NumSuma2.txt");
		File f3 = new File("ResultadoSuma.txt");
		
//		Almacenamos el contenido en variables
		String contenido1 = leerArchivo1(f1);
		String contenido2 = leerArchivo2(f2);
		
//		Nos escribe el resultado en otro archivo
		escribirArchivo(f3, contenido1, contenido2);
		
	}
	
	public static void escribirArchivo (File f3, String contenido1, String contenido2) {
		
		try {
			
			FileWriter fw = new FileWriter(f3);
			
			int resultado = Integer.valueOf(contenido1) + Integer.valueOf(contenido2);
			
			fw.write(String.valueOf(resultado));
			
			fw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static String leerArchivo1 (File f1) {
		
		try {
			
			FileReader fr1 = new FileReader(f1);
			BufferedReader br1 = new BufferedReader(fr1);
			String linea;

			while ((linea = br1.readLine()) != null) {
				
				System.out.println(linea);
				return linea;
				
			}
			
			fr1.close();
			br1.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public static String leerArchivo2 (File f2) {
		
		try {
			
			FileReader fr2 = new FileReader(f2);
			BufferedReader br2 = new BufferedReader(fr2);
			String linea;
			
			while ((linea = br2.readLine()) != null) {
				
				System.out.println(linea);
				return linea;
				
			}
			
			fr2.close();
			br2.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
		return null;
	}

}
