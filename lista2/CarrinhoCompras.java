package lista2;

import java.util.ArrayList;

	public class CarrinhoCompras {

	ArrayList<Produto> lista = new ArrayList<Produto>();
	
	 public CarrinhoCompras() {
	    this.lista = new ArrayList<Produto>();
	 }
	  
	public CarrinhoCompras(ArrayList<Produto> lista) {
		this.lista = lista;
	}
	
	public void incluir(Produto produto) {
		this.lista.add(produto);
	}
	
	public void remover(Produto produto) {
		this.lista.remove(produto);
	}
	
	public void listar() {
		for(Produto x: lista)
			System.out.println(x.toString());
	}
	
	public void somaProdutos(Produto produto) {
		double soma = 0.0;
		soma += produto.getPreco();
		System.out.println("A soma dos produtos é: "+soma);
	}

}
