package ori_obj_abstrato;

public class Cachorro extends Mamifero {
	//Cachorro � uma classe concreta e deve ter todos seus atributos implementados no construtor
	//necess�rio definir corpo de m�todo mesmo para m�todos abstratos
	
	
	//definindo m�todo mamar que faltou definir na classe pai Mamifero
	@Override
	public String mamar() {
		// TODO Auto-generated method stub
		return "Usando leite";
	}
	
}
