package lista04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String resp = sc.nextLine();
		
		FileWriter vogais = null;
		FileWriter consoantes = null;
		String caracter;
		
		String vo[] = {"a", "e", "i", "o", "u"};
		List<String> lista_vogais = Arrays.asList(vo);
		
		String co[] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		List<String> lista_consoantes = Arrays.asList(co);
		
		try {
			vogais = new FileWriter("vogais.txt");
			consoantes = new FileWriter("consoantes.txt");
			
			for(int i=0; i<resp.length();i++) {
				caracter = String.valueOf(resp.charAt(i));
				if(lista_vogais.contains(caracter)) {
					vogais.write(String.valueOf(caracter));
				}
				else if(lista_consoantes.contains(caracter)) {
					consoantes.write(String.valueOf(caracter));
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				vogais.close();
				consoantes.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}