package ori_obj_composicao;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	Compra compra;//chama uma classe Compra para associar a um Item pois todo item est� dentro da Compra
	
	//construtor do Item
	
	Item (String nome, int quantidade, double preco){
		
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

}
