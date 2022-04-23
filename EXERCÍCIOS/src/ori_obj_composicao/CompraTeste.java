package ori_obj_composicao;

public class CompraTeste {
	//este teste mostra uma relação de 1 pra n (um para muitos) desde que uma compra tem muitos itens ma sum item esta dentro de uma compra

	public static void main(String[] args) {
		//constroi a primeira compra
		Compra compra1 = new Compra();
		//passando os parametros do ArrayList 'itens' 
		compra1.cliente = "Lucas Garcia";
//		compra1.itens.add(new Item ("Caneca", 5 , 49.80));
//		compra1.itens.add(new Item ("Guarda Chuva", 1 , 22.50));
//		compra1.itens.add(new Item ("Caderno", 2 , 8.20));

		//existe a maneira também de usar a função criada de adicionarItem
		compra1.adicionarItem(new Item ("Caneca", 5 , 49.80));
		compra1.adicionarItem(new Item ("Guarda Chuva", 1 , 22.50));
		compra1.adicionarItem(new Item ("Caderno", 2 , 8.20));
		
		//mostrando a quantidade do tipo de item comprado (não a quantidade total individual)
		System.out.println("Existem "+ compra1.itens.size() + " tipos de item no carrinho");
		
		System.out.printf("O valor total do carrinho é : R$ %.2f", compra1.obterVlorTotal());
		
		
		
	}
	

}
