package ori_obj_composicao;

public class Motor {
	
	final Carro carro;//recebe um ''carro'' vazio para validar relação 1 pra 1 entre carro e motor
	
	boolean ligado = false;//verifica ignição do motor
	double fatorInjecao = 1;
	String estadoMotor = "Carro Desligado";
	
	//forçar um carro dentro do construtor do Motor 
	Motor (Carro carro){
		this.carro=carro;
	}
	
	//função de aceleração do motor
	int giros() {
		if (!ligado) {
			return 0;
		}else {
			
		return (int) Math.round(fatorInjecao*3000);//função de relação rpm em relação ao fator de injeção do carro
		
		}
	}
}
