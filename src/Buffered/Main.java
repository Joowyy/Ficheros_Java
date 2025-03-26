package Buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File f = new File("el_quijote.txt");
		
		try {
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			int contadorLineas = 0;
			int contadorPalabras = 0;
			
//			Contador lineas
			while ((linea = br.readLine()) != null) {
				
				contadorLineas++;
				System.out.println(linea);
				
				String[] palabras = linea.split(" ");
				
//				Contamos las palabras
				for (int i = 0; i < palabras.length; i++) {
					
					contadorPalabras++;
					
				}
				
			}
			
//			Imprimimos los resultados
			System.out.println("\nTenemos un total de -> " + contadorLineas + " lineas");
			System.out.println("Tenemos un total de -> " + contadorPalabras + " palabras");
			
			br.close();
			fr.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}

	}

}
