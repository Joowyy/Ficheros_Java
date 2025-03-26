package Buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Le pedimos una palabra al usuario
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime la palabra que deseas ver que se repite");
		String palabraRepetida = sc.nextLine();
		
		File f = new File("el_quijote.txt");
		
		try {
			
//			Variables a utilizar
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			int contadorLineas = 0;
			int contadorPalabras = 0;
			int contadorPalabraUnica = 0;
			
//			Contador lineas
			while ((linea = br.readLine()) != null) {
				
				contadorLineas++;
				System.out.println(linea);
				
				String[] palabras = linea.split(" ");
				
//				Contamos las palabras
				for (int i = 0; i < palabras.length; i++) {
					
					contadorPalabras++;
					
//					Contamos la palabra dicha por el usuario
					if (palabras[i].equalsIgnoreCase(palabraRepetida)) {
						
						contadorPalabraUnica++;
						
					}
					
				}
//				-- O --
				//contadorPalabras += palabras.length;
				
			}
			
//			Imprimimos los resultados
			System.out.println("\nTenemos un total de -> " + contadorLineas + " lineas");
			System.out.println("Tenemos un total de -> " + contadorPalabras + " palabras");
			System.out.println("Tenemos un total de -> " + contadorPalabraUnica + " repeticiones de la palabra '" + palabraRepetida + "'");
			
			br.close();
			fr.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}

	}

}
