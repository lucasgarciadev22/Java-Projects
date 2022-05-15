package ori_obj_heranca.desafio.mod_acesso;

import ori_obj_heranca.desafio.Carro;
import ori_obj_heranca.desafio.Civic;
import ori_obj_heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		Ferrari c2 = new Ferrari(400);//defini aqui a velocidade máxima que não foi definida no objeto
		
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		//como c2 é uma Ferrari e não mais apenas um Carro o programa permite acessar os métodos implementados em Esportivo
		c2.ligarTubo();
		c2.acelerar();//acelera 15 (sobescrito)
		c2.frear();//freia 5 
		c2.ligarAr();//liga ar e diminui aceleração do turbo
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		System.out.println(c2.velocidadeDoAr());//acessar valor dentro da interface 
	}

}
