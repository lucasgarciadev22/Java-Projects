package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		double pi = 3.14159;
		double area=pi*raio*raio;//Não precisa colocar espaço depois do =
		 
		System.out.println(area);
		
		raio=10;
		area = pi*raio*raio;
		System.out.println("Área ="+area+"m2.");//Mostra o novo valor atribuído à área junto do texto 
	}

}
