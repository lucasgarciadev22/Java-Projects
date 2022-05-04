package ori_obj_polimorfismo;

public class Pessoa {
	
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}	
	public void comer (Arroz arroz) {
		this.peso += arroz.getPeso();//adiciona o peso do arroz 
	}
	
	public void comer (Feijao feijao) {
		this.peso += feijao.getPeso();//adiciona o peso do arroz 
	}
	
	public void comer (Sorvete sorvete) {
		this.peso += sorvete.getPeso();//adiciona o peso do arroz 
	}
	
}
	
