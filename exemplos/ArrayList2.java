package exemplos;

import java.util.ArrayList;
public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Azul");
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Azul");
		
		String x = lista.get(1);//a primeira posição é 0//
		System.out.println(x);
		
		Integer y = lista.indexOf("Verde"); //retorna a posição em que o valor se encontra//
		System.out.println(y);
		
		String w = lista.get(2); 
		System.out.println(w);
		
		lista.set(3, "Marrom"); //sobrepoe a posição 3//
		
		String j = lista.get(3);
		System.out.println(j);
		
		lista.remove("Verde"); //exclui o elemento da lista//
		
		for(String k: lista) {
			System.out.println(k);
		}
	}

}
