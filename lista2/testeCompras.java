package lista2;

import java.util.ArrayList;

public class testeCompras {

	public static void main(String[] args) {
		
		CarrinhoCompras c1 = new CarrinhoCompras();
		
		Produto p1 = new Produto("1", "Batata", 5.00);
		Produto p2 = new Produto("2", "Tomate", 7.00);
		Produto p3 = new Produto("3", "Alface", 2.00);
		Produto p4 = new Produto("4", "Mandioca", 3.00);
		Produto p5 = new Produto("1", "Beterraba", 12.00);
		
		 c1.incluir(p1);
	     c1.incluir(p2);
	     c1.incluir(p3);
	     c1.incluir(p4);
	     c1.incluir(p5);
	     
	     c1.listar();
	     
	     c1.remover(p1);
	     c1.remover(p5);
	     
	     System.out.println("\nLista atualizada\n");
	     c1.listar();
	}

}
