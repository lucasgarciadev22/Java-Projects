package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		//cases com conceitos múltiplos acessos e multiplos breaks
		//o exemplo a seguir ira verificar os conceitos das notas
		
	//lucas 7 de mar de 2022
	System.out.println("Informe a nota: ");
	
	Scanner entrada = new Scanner(System.in);
	
	int conceitoin=entrada.nextInt();
	String conceito="";
	
	switch(conceitoin) {
	case 10: case 9:
	conceito="A";
		break;
	
	case 8: case 7:
		conceito="B";
		break;	
	case 6: case 5:
		conceito="C";
		break;
	case 4: case 3:
		conceito="D";
		break;
	case 2: case 1: case 0:
		conceito="E";
		break;
		
	default:
		conceito="Inválido";
		

	}
	System.out.println("O conceito é  "+conceito);
	entrada.close();
	}
}
