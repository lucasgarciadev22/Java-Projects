package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		//domingo = 6
		//segunda = 7
		//terça = 8
		//quarta = 9
		//quinta = 10
		//sexta = 11
		//sabado = 12
		
		String diaEntrada = JOptionPane.showInputDialog("Que dia da semana é hoje?");
			
		if(diaEntrada.equalsIgnoreCase("Domingo") ) {
		System.out.println("Então hoje é dia 6");
		}
		else if(diaEntrada.equalsIgnoreCase("Segunda")) {
		System.out.println("Então hoje é dia 7");
		}
		else if(diaEntrada.equalsIgnoreCase("Terça")) {
			System.out.println("Então hoje é dia 8");
		}
		else if(diaEntrada.equalsIgnoreCase("Quarta")) {
			System.out.println("Então hoje é dia 9");
		}
		else if(diaEntrada.equalsIgnoreCase("Quinta")) {
			System.out.println("Então hoje é dia 10");
		}
		else if(diaEntrada.equalsIgnoreCase("Sexta")) {
			System.out.println("Então hoje é dia 11");
		}
		else if(diaEntrada.equalsIgnoreCase("Sábado")) {
			System.out.println("Então hoje é dia 12");
		}
		else {
			System.out.println("Dia Inválido! Informe um dia desta semana");
		}
	}
		
}
