package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		double pi = 3.14159;
		double area=pi*raio*raio;//N�o precisa colocar espa�o depois do =
		 
		System.out.println(area);
		
		raio=10;
		area = pi*raio*raio;
		System.out.println("�rea ="+area+"m2.");//Mostra o novo valor atribu�do � �rea junto do texto 
	}

}
