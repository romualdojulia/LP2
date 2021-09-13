package lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		
		Integer numero = 0;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();

		do {
			System.out.println("Digite números inteiros maiores que zero:"); 
			numero = sc.nextInt(); 
			
			if(numero > 0)
				lista.add(numero);
			
			else if(numero < 0)
				System.out.println("Digite números inteiros maiores que zero:");
							
		} 
		while(numero != 0);
		
		System.out.println("Total de elementos armazenados:" + lista.size());
        Integer maiorNum = Collections.max(lista);
        System.out.println("\n Maior numero:" + maiorNum);
        
        Integer menorNum = Collections.min(lista);
        System.out.println("\n Menor numero:" + menorNum);
        

	}
}