package ori_obj_encapsulamento.casaB;

import ori_obj_encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	//Pedro herda atributos de Ana, para acessar estes atributos protected n�o precisa de construtor Ana
	
	void testeAcessos() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
//		System.out.println(segredo); imposs�vel acessar classe privada
//		System.out.println(facoDentroDeCasa);// imposs�vel acessar se o filho (Pedro) n�o est� no mesmo pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);//outra forma de escrever

	}

}
