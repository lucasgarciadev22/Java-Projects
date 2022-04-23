package ori_obj_composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
//		Motor m1 = new Motor(); nao sera necessário criar um novo motor pois o carro ja tem uma classe motor atribuida a ele
		
		
		//verificar estado inicial do motor fazendo leitura dos parâmetros de classe do motor dentro de outra classe carro
		System.out.println("O carro está ligado?  " + c1.motor.estadoMotor);
		
		c1.ligar();//chama funcao de ligar o carro e atualiza o estadoMotor
		//Importante: é preciso usar a classe motor presente dentro da classe carro... para nao acessar o valor nativo de classe
		System.out.println("O carro está ligado?  " + c1.motor.estadoMotor);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		
		System.out.println(c1.motor.giros());//imprime rpm atual do motor 
		
		c1.desacelerar();
		c1.desacelerar();
		c1.desacelerar();
		c1.desacelerar();
		c1.desacelerar();//após este ponto o motor entraria em rotação negativa para corrigir isso usamos critérios de controle e encapsulamento
		c1.desacelerar();
		c1.desacelerar();
		c1.desacelerar();
		
	//relações bidirecionais permitem direcionar um objeto dentro do outro infinitamente
	//exemplo:
	System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
		System.out.println(c1.motor.giros());//imprime rpm atual do motor 
		
	}
}
