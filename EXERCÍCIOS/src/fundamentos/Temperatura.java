package fundamentos;

public class Temperatura {
//Fórmula de conversao F° > C° --> (F° - 32 x 5/9 = C°)
	public static void main(String[] args) {
		double inF=51;//Entrada em Fahrenheit
		final int menos32=32;// final trava valor
		final double fracao= 5.0/9.0; //Melhor colocar diretamente o valor final ao invés da fração ou colocar 5.0/ 9.0
		double outC=0;
		outC= (inF-menos32)*fracao;
		System.out.println("O resultado é "+outC+"C°");//Mostra resultado datemperatura
		
	}
	
	
	
	
}
