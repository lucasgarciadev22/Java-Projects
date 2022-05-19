package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	//usando Java Consumer
	
	public static void main(String[] args) {
		
		//usando individualmente o Consumer
		Consumer<Produto> imprimirNome= p-> System.out.println(p.nome+"!");
		
		Produto p1= new Produto("Caneta", 12.35, 0.08);
		imprimirNome.accept(p1); //recebe produto 1 usando método .accept nativo
		
		//passando uma lista de produtos
		Produto p2= new Produto("Notebook", 5499.90, 0.20);
		Produto p3= new Produto("Caderno", 32.55, 0.18);
		Produto p4= new Produto("Apontador", 10.15, 0.15);
		Produto p5= new Produto("Lápis", 2.99, 0.05);
		
		List<Produto> produtos= Arrays.asList(p1,p2,p3,p4,p5);
		
		//diferentes modos de usar o lambda
		produtos.forEach(imprimirNome);
		produtos.forEach(p-> System.out.println(p.preco));//não necessáriamente precisa de {  }
		produtos.forEach(System.out::println);//usando method reference irá puxar o toString da classe original Produto
		
		
	}

}
