package ori_obj_polimorfismo;

//classe pai para utilizar o polimorfismo com outros tipos de comida (arroz, feijao, sorvete)
public class Comida {
	private double peso;
	
	public Comida(double peso) {
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
}

