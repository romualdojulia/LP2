package exemplos;

import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Azul");
		lista.add("Vermelho");
		lista.add("Verde");
		
		for(String x: lista) { //for each, percorre e retorna os valores do arraylist//
			System.out.println(x);
		}
	}

}
