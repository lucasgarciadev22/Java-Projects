package ori_obj_encapsulamento.casaB;

import ori_obj_encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
	
		Ana sogra = new Ana();
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
//		System.out.println(segredo); imposs�vel acessar classe privada
//		System.out.println(facoDentroDeCasa);// imposs�vel acessar se o filho (Pedro) n�o est� no mesmo pacote
//		System.out.println(formaDeFalar);
		System.out.println(sogra.todosSabem);
		System.out.println(new Ana().todosSabem);//outra forma de escrever
		
	}

}
