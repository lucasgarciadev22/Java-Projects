package ori_obj_heranca.desafio;

public interface Luxo_Interface {
	
	void ligarAr();
	void desligarAr();
	default int velocidadeDoAr() { //exemplo de método padrão em uma interface
		return 1;
	}

}
