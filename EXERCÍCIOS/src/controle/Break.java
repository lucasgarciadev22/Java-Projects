package controle;

public class Break {
//o break serve para executar algo fora do la�o at� a condi��o ser atendida
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if (i==5) {
				break;//ao chegar no 5 n�o imprime e da um ' break '
				
			}
			System.out.println(i);
		}
		System.out.println("Fim");
	}
	
}
