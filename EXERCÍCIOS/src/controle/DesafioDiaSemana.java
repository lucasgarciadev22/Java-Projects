package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		//domingo = 6
		//segunda = 7
		//ter�a = 8
		//quarta = 9
		//quinta = 10
		//sexta = 11
		//sabado = 12
		
		String diaEntrada = JOptionPane.showInputDialog("Que dia da semana � hoje?");
			
		if(diaEntrada.equalsIgnoreCase("Domingo") ) {
		System.out.println("Ent�o hoje � dia 6");
		}
		else if(diaEntrada.equalsIgnoreCase("Segunda")) {
		System.out.println("Ent�o hoje � dia 7");
		}
		else if(diaEntrada.equalsIgnoreCase("Ter�a")) {
			System.out.println("Ent�o hoje � dia 8");
		}
		else if(diaEntrada.equalsIgnoreCase("Quarta")) {
			System.out.println("Ent�o hoje � dia 9");
		}
		else if(diaEntrada.equalsIgnoreCase("Quinta")) {
			System.out.println("Ent�o hoje � dia 10");
		}
		else if(diaEntrada.equalsIgnoreCase("Sexta")) {
			System.out.println("Ent�o hoje � dia 11");
		}
		else if(diaEntrada.equalsIgnoreCase("S�bado")) {
			System.out.println("Ent�o hoje � dia 12");
		}
		else {
			System.out.println("Dia Inv�lido! Informe um dia desta semana");
		}
	}
		
}
