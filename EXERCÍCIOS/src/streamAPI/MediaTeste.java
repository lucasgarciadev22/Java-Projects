package streamAPI;

public class MediaTeste {
	
	public static void main(String[] args) {
		
		//como colocamos return this no método adicionar podemos encadear o método adicionar 
		Media m1 = new Media().adicionar(8.3).adicionar(6.7);
		
		System.out.println(m1.getValor());
		
		
	}

}
