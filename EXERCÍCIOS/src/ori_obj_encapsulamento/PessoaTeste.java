package ori_obj_encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Lucas", "Garcia",-45);//passa idade na nova pessoa p1 criada
		p1.setIdade(-230);
	
	System.out.println(p1.getIdade());// idade � um 'getter' porque apenas l� informa��es);
	System.out.println(p1);// escreve as informa��es retornadas pela classe em forma de texto (toString)
	
	}
	
}
