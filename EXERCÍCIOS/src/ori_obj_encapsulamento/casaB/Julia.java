package ori_obj_encapsulamento.casaB;

import ori_obj_encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
	
		Ana sogra = new Ana();
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
//		System.out.println(segredo); impossível acessar classe privada
//		System.out.println(facoDentroDeCasa);// impossível acessar se o filho (Pedro) não está no mesmo pacote
//		System.out.println(formaDeFalar);
		System.out.println(sogra.todosSabem);
		System.out.println(new Ana().todosSabem);//outra forma de escrever
		
	}

}
