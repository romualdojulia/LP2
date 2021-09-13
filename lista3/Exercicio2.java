package lista3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercicio2 {

	public static void main(String[] args) {

		FileInputStream entrada = null;
		FileOutputStream maior = null;
		FileOutputStream menor = null;
		
		try {
			entrada = new FileInputStream("entrada");
			maior = new FileOutputStream("maior");
			menor = new FileOutputStream("menor");
			
			int c;
		
			while ((c = entrada.read())!= -1) {
				if(c>128) {
					System.out.println("maior: "+c);
					maior.write(c);
				}
				else if(c<=128){
					System.out.println("menor: "+c);
					menor.write(c);
				}
			}
		}

		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				entrada.close();
				maior.close();
				menor.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}