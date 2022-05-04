package ori_obj_encapsulamento.casaB;

import ori_obj_encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	//Pedro herda atributos de Ana, para acessar estes atributos protected não precisa de construtor Ana
	
	void testeAcessos() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
//		System.out.println(segredo); impossível acessar classe privada
//		System.out.println(facoDentroDeCasa);// impossível acessar se o filho (Pedro) não está no mesmo pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);//outra forma de escrever

	}

}
