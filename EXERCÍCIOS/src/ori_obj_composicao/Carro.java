package ori_obj_composicao;

public class Carro {
	
	final Motor motor; //chama a classe motor e cria uma inst�ncia vazia para validar rela��o 1 pra 1 entre motor e carro
	
	//construtor de carro para declarar um novo motor atrelado ao carro criando uma rela��o bidirecional
	Carro(){
		this.motor = new Motor(this);//joga a pr�pria classe Motor dentro do par�metro de motor anteiormente vazio
	}
	
	
	//metodo acelerar : incrementa 0.4 no fatorInjecao da classe Motor
	void acelerar () {
		if (motor.fatorInjecao <2.6) {//crit�rio que evita rota��o excessiva no motor
		motor.fatorInjecao += 0.4;
	}
	}
	//metodo desacelerar : decrementa 0.4 no fatorInjecao da classe Motor
	void desacelerar () {
		
		if (motor.fatorInjecao > 0.5) {//crit�rio que evita rota��o negativa 
			motor.fatorInjecao -= 0.4;
		}
	}
	//m�todo ligar: muda o estado da vari�vel boolean 'ligado' da classe motor	
	void ligar() {
		
		motor.ligado=true;
		motor.estadoMotor="Carro Ligado";
		
	}
	//m�todo desligar: muda o estado da vari�vel boolean 'ligado' da classe motor	
		void desligar() {
			
			motor.ligado=false;
			motor.estadoMotor="Carro Desligado";
		}
		
//	//m�todo verificaLigado: verifica se a vari�vel boolean 'ligado'est� em 'true' ou 'false'
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
//todos estes m�todos ser�o aplicados dentro da classe CarroTeste