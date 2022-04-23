package ori_obj_composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
//		Motor m1 = new Motor(); nao sera necess�rio criar um novo motor pois o carro ja tem uma classe motor atribuida a ele
		
		
		//verificar estado inicial do motor fazendo leitura dos par�metros de classe do motor dentro de outra classe carro
		System.out.println("O carro est� ligado?  " + c1.motor.estadoMotor);
		
		c1.ligar();//chama funcao de ligar o carro e atualiza o estadoMotor
		//Importante: � preciso usar a classe motor presente dentro da classe carro... para nao acessar o valor nativo de classe
		System.out.println("O carro est� ligado?  " + c1.motor.estadoMotor);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		
		System.out.println(c1.motor.giros());//imprime rpm atual do motor 
		
		c1.desacelerar();
		c1.desacelerar();
		c1.desacelerar();
		c1.desacelerar();
		c1.desacelerar();//ap�s este ponto o motor entraria em rota��o negativa para corrigir isso usamos crit�rios de controle e encapsulamento
		c1.desacelerar();
		c1.desacelerar();
		c1.desacelerar();
		
	//rela��es bidirecionais permitem direcionar um objeto dentro do outro infinitamente
	//exemplo:
	System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
		System.out.println(c1.motor.giros());//imprime rpm atual do motor 
		
	}
}
