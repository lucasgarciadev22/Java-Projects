package ori_obj_composicao;

public class Motor {
	
	final Carro carro;//recebe um ''carro'' vazio para validar rela��o 1 pra 1 entre carro e motor
	
	boolean ligado = false;//verifica igni��o do motor
	double fatorInjecao = 1;
	String estadoMotor = "Carro Desligado";
	
	//for�ar um carro dentro do construtor do Motor 
	Motor (Carro carro){
		this.carro=carro;
	}
	
	//fun��o de acelera��o do motor
	int giros() {
		if (!ligado) {
			return 0;
		}else {
			
		return (int) Math.round(fatorInjecao*3000);//fun��o de rela��o rpm em rela��o ao fator de inje��o do carro
		
		}
	}
}
