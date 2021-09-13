package lista3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Random numeros = new Random();
		
		ArrayList<Integer> random = new ArrayList<Integer>();
		
		int n = 0;
		
		for(int i=0; i<10; ++i) {
			   random.add(n = numeros.nextInt(100)+1);    
		}
	
		FileOutputStream pares = null;
		FileOutputStream impares = null;
		
		try {
			pares = new FileOutputStream("pares");
			impares = new FileOutputStream("impares");
			
			for(int i=0; i< random.size(); ++i) {
				if (random.get(i) % 2 == 0) {
					pares.write(random.get(i));
				}
				else {
					impares.write(random.get(i));
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
		try {
			pares.close();
			impares.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	  }
   }
}
