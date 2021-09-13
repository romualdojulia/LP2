package exemplos;

import java.util.HashSet;
public class Set1 {

	public static void main(String[] args) {
		
		HashSet<String> lista = new HashSet<String>();
		
		lista.add("Azul");
		lista.add("Amarelo");
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Vermelho");
		lista.add("Azul");
		
		for (String x: lista) { //neste caso o HashSet não garante a ordem dos elementos e não os repete tbm//
			System.out.println(x);
		}
	}

}
