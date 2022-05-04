package ori_obj_polimorfismo;

//teste de sobrecarga de métodos e polimorfismo
public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado_1 = new Pessoa(99.25);
		
		Arroz comida_1 = new Arroz(0.25);
		Feijao comida_2 = new Feijao(.25);
		Sorvete sobremesa = new Sorvete(.25);
		
		System.out.println(convidado_1.getPeso());//exibe peso da pessoa antes de comer
		
		//chama métodos comer (arroz, feijao, sorvete...)
		convidado_1.comer(comida_1);
		convidado_1.comer(comida_2);
		
		System.out.println(convidado_1.getPeso());//exibe peso da pessoa
		convidado_1.comer(sobremesa);
		System.out.println(convidado_1.getPeso());//exibe após comer sorvete
	}
	
	

}
