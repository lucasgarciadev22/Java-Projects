package array;

public class ForEach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4 };//outra maneira de escrever um array
		
		//estrutura tradicional de percorrer o array
		for (int i =0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println();
		
		//estrutura foreach
		for(double nota: notas) {
		System.out.println(nota+" ");//cria um array nota baseado em outro array notas e ele executa até o tamanho total do array notas
		}
	}
}
