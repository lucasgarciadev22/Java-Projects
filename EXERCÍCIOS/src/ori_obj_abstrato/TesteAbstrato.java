package ori_obj_abstrato;

public class TesteAbstrato {
	
	public static void main(String[] args) {
		
		//dog � da classe mam�fero por isso tem acesso a atributos mais detalhados do que se for apenas de classe animal
		Mamifero dog = new Cachorro();
		
		System.out.println(dog.respirar());
		System.out.println(dog.mover());
		System.out.println(dog.mamar());
	}

}
