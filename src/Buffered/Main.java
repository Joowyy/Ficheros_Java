package Buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
			
			while ((linea = br.readLine()) != null) {
				
				contadorLineas++;
				System.out.println(linea);
				
			}
			
			System.out.println("\nTenemos un total de -> " + contadorLineas + " lineas");
			
			br.close();
			fr.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
		
	}

}
