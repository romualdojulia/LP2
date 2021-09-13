package lista1;

import java.util.Scanner;
import java.util.ArrayList;
public class TesteJogador {

	public static void main(String[] args) {
		
		String nome = "";
		Integer idade = 0;
		Integer numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Jogador> lista = new ArrayList<Jogador>();

		do {
			System.out.print("Nome do jogador: ");
			nome = sc.nextLine();
			System.out.print("Idade do jogador: ");
			idade = sc.nextInt();
			System.out.print("Número do jogador: ");
			numero = sc.nextInt();
			if(numero == 0) {
				break;
			}
			sc.nextLine();
			Jogador jogador = new Jogador(nome, idade, numero);
			lista.add(jogador);
			
		}
		while(true);

		for(Jogador x: lista) {
			System.out.println(x);
		}
	}
}
