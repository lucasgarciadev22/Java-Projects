package ori_obj_heranca;

public class Heroi extends Jogador  { // Heroi herda atributos da classe Jogador
	
	public Heroi() {
		this(0,0);
	}
	
	public Heroi(int x, int y) {
		super(x, y); //chama da classe pai
	}
	
//	//Sobescrever m�todos padr�o da classe Jogador 	
//		boolean atacar (Jogador oponente) {
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		//se os jogadores estiverem na mesma coluna o ataque � v�lido (return true)
//		if (deltaX ==0 && deltaY ==1) {
//			oponente.vida -=20;//subtrai 20 pontos de vida ---> editado em rela��o ao original
//			return true;
//		//se os jogadores estiverem na mesma linha o ataque � v�lido (return true)
//		}else if (deltaX == 1 && deltaY ==0) {
//			oponente.vida -=20;
//		return true;
//		}
//		else return false;
//	}
//	
	//outros m�todos de sobrescrita usando super classe

	//ataque o dobro (sobrescrito)
	@Override
	public boolean atacar (Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
		
	}
	
}
