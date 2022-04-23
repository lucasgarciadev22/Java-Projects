package ori_obj_composicao;

public class Carro {
	
	final Motor motor; //chama a classe motor e cria uma instância vazia para validar relação 1 pra 1 entre motor e carro
	
	//construtor de carro para declarar um novo motor atrelado ao carro criando uma relação bidirecional
	Carro(){
		this.motor = new Motor(this);//joga a própria classe Motor dentro do parâmetro de motor anteiormente vazio
	}
	
	
	//metodo acelerar : incrementa 0.4 no fatorInjecao da classe Motor
	void acelerar () {
		if (motor.fatorInjecao <2.6) {//critério que evita rotação excessiva no motor
		motor.fatorInjecao += 0.4;
	}
	}
	//metodo desacelerar : decrementa 0.4 no fatorInjecao da classe Motor
	void desacelerar () {
		
		if (motor.fatorInjecao > 0.5) {//critério que evita rotação negativa 
			motor.fatorInjecao -= 0.4;
		}
	}
	//método ligar: muda o estado da variável boolean 'ligado' da classe motor	
	void ligar() {
		
		motor.ligado=true;
		motor.estadoMotor="Carro Ligado";
		
	}
	//método desligar: muda o estado da variável boolean 'ligado' da classe motor	
		void desligar() {
			
			motor.ligado=false;
			motor.estadoMotor="Carro Desligado";
		}
		
//	//método verificaLigado: verifica se a variável boolean 'ligado'está em 'true' ou 'false'
//		void verificaLigado() {
//			
//			if (motor.ligado==true) {
//				
//				 motor.estadoMotor="Carro Ligado";	
//				
//				} else { 
//					motor.estadoMotor = "Carro Desligado";
//				}
//		}
}
//todos estes métodos serão aplicados dentro da classe CarroTeste