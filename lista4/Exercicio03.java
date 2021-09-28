package lista04;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String vo[] = {"a", "e", "i", "o", "u"};
		List<String> lista_vogais = Arrays.asList(vo);
		
		String co[] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		List<String> lista_consoantes = Arrays.asList(co);
		
		FileReader in = null;
		
		Integer vogais = 0;
		Integer consoantes = 0;
		Integer total = 0;
		Integer espaco = 0;
		String caracter;
		
		try {
			
			in = new FileReader("entrada.txt");
			
			int c;
			
			while((c = in.read())!= -1) {
				caracter = String.valueOf((char)c);
				if(lista_vogais.contains(caracter)) {
					vogais++;
				}
				else if(lista_consoantes.contains(caracter)) {
					consoantes++;
				}
				else if(caracter.equals(" "));{
					espaco++;
				}
				total++;
			}
			System.out.println("A quantidade de vogais é: "+vogais);
			System.out.println("A quantidade de consoantes é: "+consoantes);
			System.out.println("A quantidade total é: "+total);
			System.out.println("A quantidade de espaços é: "+espaco);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}