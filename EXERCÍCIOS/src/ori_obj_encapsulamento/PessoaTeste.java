package ori_obj_encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Lucas", "Garcia",-45);//passa idade na nova pessoa p1 criada
		p1.setIdade(-230);
	
	System.out.println(p1.getIdade());// idade é um 'getter' porque apenas lê informações);
	System.out.println(p1);// escreve as informações retornadas pela classe em forma de texto (toString)
	
	}
	
}
