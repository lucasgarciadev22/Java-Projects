package ori_obj_heranca.desafio.mod_acesso;

import ori_obj_heranca.desafio.Carro;
import ori_obj_heranca.desafio.Civic;
import ori_obj_heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		Carro c2 = new Ferrari(400);//defini aqui a velocidade máxima que não foi definida no objeto
		
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		c2.acelerar();//acelera 15 (sobescrito)
		c2.frear();//freia 5 
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
	}

}
