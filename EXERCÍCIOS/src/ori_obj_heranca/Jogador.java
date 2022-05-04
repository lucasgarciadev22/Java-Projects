package ori_obj_heranca;

public class Jogador {
	
	public int vida = 100;// hp inicial
	public int x;
	public int y;
	
	//construtor padr�o  (transferido por heran�a)
	protected Jogador (int x, int y) {
		this.x =x;
		this.y = y;
	}
	
	
	
	//verifica alinhamento em x e dist�ncia em y dos jogadores
	public boolean atacar (Jogador oponente) { // tornar fun��o p�blica
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		//se os jogadores estiverem na mesma coluna o ataque � v�lido (return true)
		if (deltaX ==0 && deltaY ==1) {
			oponente.vida -=10;//subtrai 10 pontos de vida
			return true;
		//se os jogadores estiverem na mesma linha o ataque � v�lido (return true)
		}else if (deltaX == 1 && deltaY ==0) {
			oponente.vida -=10;
		return true;
		}
		else return false;
	}
	
	public boolean andar(Direcao direcao) {
		//usando cases para cada dire��o da enum Direcao
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
			
		}

		return true;
	}

}
