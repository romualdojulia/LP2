package exemplos;

import java.util.HashSet;
public class Set2 {

	public static void main(String[] args) {
		
		HashSet<String> lista = new HashSet<String>();
		
		lista.add("Azul");
		lista.add("Amarelo");
		lista.add("Vermelho");
		lista.add("Verde");
		
		Boolean x = lista.contains("Vermelho"); //verfica se o elemento existe na lista, coleção//
		System.out.println(x);
		
		Boolean y = lista.remove("Vermelho"); //remove o elemento na lista//
		System.out.println(y);
		
		for(String g: lista) {
			System.out.println(g);
		}
	}

}
