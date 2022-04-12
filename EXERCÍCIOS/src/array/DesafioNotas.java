package array;

import java.util.Scanner;

public class DesafioNotas {
	public static void main(String[] args) {
		//lucas 11 de abr de 2022
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a Quantidade de Notas: ");
		
		int QtdNotasEntrada=entrada.nextInt();//faz leitura de entrada
		
		double[] notas = new double[QtdNotasEntrada];//usa o valor de entrada para definir o tamanho do array
		
		//primeiro for para ler todas as notas na entrada
		for(int i=0;i<notas.length;i++) {
			System.out.println("Digita a nota"+ (i + 1) +": ");//solicita todas as notas
			notas[i] = entrada.nextDouble();//salva as notas informadas na entrada 
			
		}
		
		double total=0;
		//seguno for (foreach) para incrementar as notas e fazer um total somado
		for(double nota: notas) {
			total+= nota;
		}
		//cálculo de média baseado no tamanho total do arra de notas informado
		double media = total/notas.length;
		System.out.printf("A média é  %.2f !",media);
		entrada.close();
		
	}
	
}
