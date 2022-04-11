package controle;

public class Break {
//o break serve para executar algo fora do laço até a condição ser atendida
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if (i==5) {
				break;//ao chegar no 5 não imprime e da um ' break '
				
			}
			System.out.println(i);
		}
		System.out.println("Fim");
	}
	
}
