package ori_obj_composicao.desafio;

public class DesafioTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Lucas Garcia");
		
		Compra compra1 = new Compra();
		//usando ambos os métodos de adicionar item com ou sem produto
		compra1.adicionarItemComProduto("Caneta", 10, 25);
		compra1.adicionarItem(new Produto("Notebook", 2500), 1);

		Compra compra2 = new Compra();
		compra2.adicionarItemComProduto("Borracha", 2.50, 1);
		compra2.adicionarItem(new Produto("Impressora", 500), 1);
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.obterValorTotal());

}
}