package ori_obj_abstrato;

public abstract class Mamifero extends Animal {
	
	@Override
	public String mover() {
		
		return "Usando as patas"; //maneira de locomo��o
	}
public abstract String mamar(); //m�todo abstrato
}
