package ori_obj_heranca.desafio;

public interface Luxo_Interface {
	
	void ligarAr();
	void desligarAr();
	default int velocidadeDoAr() { //exemplo de m�todo padr�o em uma interface
		return 1;
	}

}
