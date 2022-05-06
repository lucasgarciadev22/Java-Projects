package ori_obj_abstrato;

public class Cachorro extends Mamifero {
	//Cachorro é uma classe concreta e deve ter todos seus atributos implementados no construtor
	//necessário definir corpo de método mesmo para métodos abstratos
	
	
	//definindo método mamar que faltou definir na classe pai Mamifero
	@Override
	public String mamar() {
		// TODO Auto-generated method stub
		return "Usando leite";
	}
	
}
