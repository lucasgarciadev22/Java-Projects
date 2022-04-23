package ori_obj_composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem (Produto produto, int quantidade) {
		this.itens.add(new Item (produto, quantidade));
	}
	
	//outro método de adicionar item simultaneamente com um novo produto
	void adicionarItemComProduto (String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item (produto, quantidade));
		
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item: itens) {
			
			total+= (item.quantidade*item.produto.preco);
		}
		
		return total;
	}
	}
