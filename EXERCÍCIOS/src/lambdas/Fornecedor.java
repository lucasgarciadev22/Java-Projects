package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
	//não recebe nenhum parâmetro e retorna algo
	//colocando um Generics dentro de outro
		Supplier<List<String>> umLista = 
				()-> Arrays.asList("Ana","Bia","Gui");
		
		System.out.println(umLista.get());//usa o get é importante para acessar valores dentro do supplier
		
	}

}
