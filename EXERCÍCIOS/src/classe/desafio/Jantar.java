package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		Comida c1 = new Comida ("Arroz",0.250);
		Comida c2 = new Comida ("Feijao", 0.300);
		
		Pessoa p1 = new Pessoa ("Lucas",99.8);
		
		System.out.println(p1.apresentar());//chama função de apresentação da pessoa
		
		p1.comer(c1);//comeu arroz e engordou
 		
		System.out.println(p1.apresentar());//chama função de apresentação da pessoa
		
		p1.comer(c2);//comeu feijão e engordou
		
		System.out.println(p1.apresentar());
		
		if(p1.peso>100) {
			System.out.println("Eu acho que exagerei na comida!");
		}
		
		
		
		
	}
	
}

