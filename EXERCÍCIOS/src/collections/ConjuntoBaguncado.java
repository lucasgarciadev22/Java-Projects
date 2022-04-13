package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		//criando novo conjunto hashset
		HashSet conjunto = new HashSet();
		
		//método adicionar ao conjunto
		
		conjunto.add(1.2); //double -> Double 
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> Character
		
		//operações básicas
		
		System.out.println("O tamanho do conjunto é "+conjunto.size());
		
		//ele não aceita repetições de elementos por isso se usar 'Teste' ele não adicionaria mais um elemento igual
		conjunto.add("teste");
		System.out.println("O tamanho do conjunto é "+conjunto.size());//mostrara o novo tamanho deste conjunto
		//remover
		System.out.println(conjunto.remove("x"));// se estiver no conjunto tera valor 'true' na saída
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		conjunto.addAll(nums);//união entre dois conjuntos
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);//conjunto se torna vazio
		
		
		
		
		
	}
}
