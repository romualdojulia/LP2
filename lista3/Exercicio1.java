package lista3;
	
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
	
	public class Exercicio1 {
	
		public static void main(String[] args) {
			
			FileInputStream entrada = null;
			
			Scanner sc = new Scanner(System.in);
			
			do {
				try {
					System.out.println("Digite o nome do arquivo: ");
					entrada = new FileInputStream(sc.nextLine());
					
					int c;
					
					while ((c = entrada.read())!= -1) {
	                    System.out.println(c);
	                }

	            }
	            catch(FileNotFoundException e) {
	                System.out.println("teste");
	                entrada = null;
	            }
	            catch(IOException e) {
	                e.printStackTrace();
	            }

	        }while(entrada == null);

	        try {
	            if(entrada != null) 
	            	entrada.close();
	            	sc.close();
	        }
	        catch(IOException e) {
	            e.printStackTrace();
	        }
	        catch(NullPointerException e) {
	            e.printStackTrace();
	        }
	    }
	}