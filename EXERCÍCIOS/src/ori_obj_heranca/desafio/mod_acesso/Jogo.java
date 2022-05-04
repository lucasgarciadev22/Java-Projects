package ori_obj_heranca.desafio.mod_acesso;

import ori_obj_heranca.Direcao;
import ori_obj_heranca.Heroi;
import ori_obj_heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
	
	Heroi heroi = new Heroi(0, 0);
	Monstro monstro = new Monstro();
	
	//posi��o inicial do jogador
	heroi.x = 10;
	heroi.y = 10;
	//posi��o inicial do jogador 2(oponente)
	monstro.x = 10;
	monstro.y = 10;
//jogador 1 se posiciona de forma v�lida para atacar	
	heroi.andar(Direcao.SUL);
	
System.out.println(heroi.x);	
System.out.println(heroi.y);	
System.out.println(monstro.x);	
System.out.println(monstro.y);	

System.out.println("Vida do Heroi �: " + heroi.vida);
System.out.println("Vida do Monstro �: " + monstro.vida);

//jogador 1 ataca!
heroi.atacar(monstro);
if (heroi.atacar(monstro) == true) {
	System.out.println("O Her�i atacou!");
}else {
	System.out.println("O Monstro esquivou!");
}
//jogador 2 revida!
monstro.atacar(heroi);
if (monstro.atacar(heroi) == true) {
	System.out.println("O Monstro atacou!");
	

}else {
	System.out.println("O Her�i esquivou!");
}

//monstro se desloca e evita o ataque
monstro.andar(Direcao.NORTE);	
heroi.atacar(monstro);
if (heroi.atacar(monstro) == true) {
	System.out.println("O Her�i atacou!");
}else {
	System.out.println("O Monstro esquivou!");
}

System.out.println("Vida do jogador 1 �: " + heroi.vida);
System.out.println("Vida do jogador 2 �: " + monstro.vida);


}
}