package ori_obj_heranca;

public class Jogador {
	
	public int vida = 100;// hp inicial
	public int x;
	public int y;
	
	//construtor padrão  (transferido por herança)
	protected Jogador (int x, int y) {
		this.x =x;
		this.y = y;
	}
	
	
	
	//verifica alinhamento em x e distância em y dos jogadores
	public boolean atacar (Jogador oponente) { // tornar função pública
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		//se os jogadores estiverem na mesma coluna o ataque é válido (return true)
		if (deltaX ==0 && deltaY ==1) {
			oponente.vida -=10;//subtrai 10 pontos de vida
			return true;
		//se os jogadores estiverem na mesma linha o ataque é válido (return true)
		}else if (deltaX == 1 && deltaY ==0) {
			oponente.vida -=10;
		return true;
		}
		else return false;
	}
	
	public boolean andar(Direcao direcao) {
		//usando cases para cada direção da enum Direcao
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
