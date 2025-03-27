package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		File f = new File("Ejemplo4_Writer.txt");
		
		try {
			
			FileWriter fw = new FileWriter(f);
			fw.write(sc.nextLine());
			
			fw.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}

}
