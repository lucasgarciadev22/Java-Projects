package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		//criando novo conjunto hashset
		HashSet conjunto = new HashSet();
		
		//m�todo adicionar ao conjunto
		
		conjunto.add(1.2); //double -> Double 
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> Character
		
		//opera��es b�sicas
		
		System.out.println("O tamanho do conjunto � "+conjunto.size());
		
		//ele n�o aceita repeti��es de elementos por isso se usar 'Teste' ele n�o adicionaria mais um elemento igual
		conjunto.add("teste");
		System.out.println("O tamanho do conjunto � "+conjunto.size());//mostrara o novo tamanho deste conjunto
		//remover
		System.out.println(conjunto.remove("x"));// se estiver no conjunto tera valor 'true' na sa�da
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		conjunto.addAll(nums);//uni�o entre dois conjuntos
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);//conjunto se torna vazio
		
		
		
		
		
	}
}
