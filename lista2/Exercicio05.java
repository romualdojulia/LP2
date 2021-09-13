package lista2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer dia;
		Integer mes;
		Integer ano;
		
		String nome;
		LocalDate data = LocalDate.now();
		
		HashMap<String, LocalDate> lista = new HashMap<String, LocalDate>();
		
		do {
			System.out.println("Digite o nome: [s] para sair");
			nome = sc.nextLine();
			
			System.out.println("Data de nascimento");
			System.out.println("Digite o dia: ");
			dia = sc.nextInt();
			System.out.println("Digite o mês de nascimento: ");
			mes = sc.nextInt();
			System.out.println("Digite o ano de nascimento: ");
			ano = sc.nextInt();
			
			LocalDate dt = LocalDate.of(ano, mes, dia);
			
			lista.put(nome, dt);
			
			if(sc.hasNextLine())
				sc.nextLine();
		}
		
		while(nome != "s");
		
		System.out.println("A lista atual é: "+lista);

		Set<String> chaves = lista.keySet();
		
		for(String x : lista.keySet())
			System.out.println(x+" - "+lista.get(x));
	}

}
