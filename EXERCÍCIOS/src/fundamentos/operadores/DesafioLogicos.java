package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		//Desafio aula 47 do M�dulo fundamentos. 
		
		//Digitar valores
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		boolean compraSorvete = trabalho1||trabalho2;
		boolean compraTV32 = trabalho1^trabalho2;
		boolean compraTV50 = trabalho1&&trabalho2;
		//Operador Un�rio
		boolean maisSaude =!compraSorvete;
		
		//analisando as vari�veis trabalho1 = trabalho na ter�a / trabalho2 = trabalho na quinta
		System.out.println("Comprou TV 32\"?"+compraTV32);// colocar \ para ele entender que n�o acabou a linha string � apenas s�mbolo de polegada				
		System.out.println("Comprou TV 50\"?"+compraTV50);// colocar \ para ele entender que n�o acabou a linha string � apenas s�mbolo de polegada				
		System.out.println("Comprou Sorvete?"+compraSorvete);// colocar \ para ele entender que n�o acabou a linha string � apenas s�mbolo de polegada				
		System.out.println("Est� mais saud�vel?"+maisSaude);// colocar \ para ele entender que n�o acabou a linha string � apenas s�mbolo de polegada				
		
		
		
		
		
				
				
	}

}
