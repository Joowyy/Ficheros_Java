import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
//		Preguntamos al usuario sobre el archivo y letra
		System.out.println("Tenemos los siguientes ficheros:\n- Ejemplo1.txt\n- Ejemplo2.txt\n- Ejemplo3.txt\nCual deseas consultar.");
		String nombreFichero = sc.nextLine();
		
		System.out.println("¿Que letra quieres ver que se repita?");
		char letraUsuario = sc.nextLine().charAt(0);
		
		contarFichero(nombreFichero, letraUsuario);
		
	}
	
//	Funcion para contar letras
	public static void contarFichero (String nombreFichero, char letraUsuario) {
		
//		Creamos un objeto 'File' asignando el nombre del fichero del Usuario.
		File f = new File(nombreFichero);
		
		try { 
			
//			Creamos un 'FileReader' para poder leer el fichero
			FileReader fr = new FileReader(f);
			int letra;
			int numCaracteres = 0;
			
			while((letra = fr.read()) != -1) {
				
//				Imprime el contenido del fichero
				System.out.print((char) letra);
				
//				Suma cada vez que se repite el caracter del usuario
				if ((char) letra == letraUsuario || (char) letra == letraUsuario) {
					
					numCaracteres ++;
					
				}
				
			}
			
//			Depura el codigo
			System.out.println("\nLa letra " + letraUsuario + " sale unas -> " + numCaracteres + " veces.");
			fr.close();
			
//		En caso de error, haz esto...
		} catch (IOException e) { //En caso de que se produzca una excepción, ésta será atrapada por el catch, y el programa seguirá su ejecución
			
			e.printStackTrace();
			
		}
		
	}

}
