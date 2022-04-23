package ori_obj_composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();//cria um array da classe Item
	
	//método que adiciona inicia uma compra e um item novo na lista
	void adicionarItem(Item item) {//recebe o item a ser adicionado 
		
		itens.add(item);//adiciona no ArrayList
		item.compra =this;
		
	}
	//nova função de classe para o cálculo do valor total da lista de compras
	double obterVlorTotal() {
		double total = 0;
		
		for(Item listaCompra: itens) {
			total += listaCompra.quantidade*listaCompra.preco;
		}
		return total;
	}

}
