package ori_obj_heranca;

public class Monstro extends Jogador{// Monstro, assim como heroi herda classe Jogador

	//chama construtor padrão 
	public Monstro () {
		this(0,0);
	}
	public Monstro (int x, int y) {
		super(x,y); //chama da classe pai
	}
}
