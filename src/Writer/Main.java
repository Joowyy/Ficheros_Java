package Writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
//		Pedimos la palabra
		System.out.println("Dime la palabra que deseas ver que se repite");
		String palabraRepetida = sc.nextLine();
		System.out.println("Dime cuantas palabras quieres copiar:");
		int palabrasCopiar = sc.nextInt();
		
//		Creamos los ficheros
		File f = new File("el_quijote.txt");
		File f2 = new File("FicheroContador.txt");
		
		try {
			
//			Variables a utilizar // Con el 'FileWriter' si no existe el fichero, se crea automaticamente
			FileWriter fw = new FileWriter(f2);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			int contadorLineas = 0;
			int contadorPalabras = 0;
			int contadorPalabraUnica = 0;
			
//			Contador lineas / palabra / palabraUnica
			while ((linea = br.readLine()) != null) {
				
				contadorLineas++;
				System.out.println(linea);
				
//				Array de palabras para almacenarlas y comprobarlas
				String[] palabras = linea.split(" ");
				
//				Contamos las palabras
				for (int i = 0; i < palabras.length; i++) {
					
					contadorPalabras++;
					
//					Limita el texto a las palabras que necesites
					if (contadorPalabras <= palabrasCopiar) {
						
						fw.write(palabras[i] + " ");
						
					}
					
//					Contamos la palabra dicha por el usuario || La segunda condicion comprubea si la palabra termina en un '.'
					if (palabras[i].equalsIgnoreCase(palabraRepetida) || palabras[i].equalsIgnoreCase(palabraRepetida + ".")) {
						
						contadorPalabraUnica++;
						
					}
					
				}
//				-- O --
				//contadorPalabras += palabras.length;
				
			}
			
//			Imprimimos los resultados
			System.out.println("\nTenemos un total de -> " + contadorLineas + " lineas");
			System.out.println("Tenemos un total de -> " + contadorPalabras + " palabras");
			
//			Lo mandamos a otro fichero
			System.out.println("Las repeticiones de palabra se muestran en el fichero 'FicheroContador.txt'");
			//fw.write("La palabra '" + palabraRepetida + "' se repite un total de -> " + contadorPalabraUnica);
			
//			Cerrar los 'Reader' / 'Flujos' es muy importante
			br.close();
			fr.close();
			fw.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}

	}

}
