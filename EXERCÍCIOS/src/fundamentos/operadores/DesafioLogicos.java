package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		//Desafio aula 47 do Módulo fundamentos. 
		
		//Digitar valores
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		boolean compraSorvete = trabalho1||trabalho2;
		boolean compraTV32 = trabalho1^trabalho2;
		boolean compraTV50 = trabalho1&&trabalho2;
		//Operador Unário
		boolean maisSaude =!compraSorvete;
		
		//analisando as variáveis trabalho1 = trabalho na terça / trabalho2 = trabalho na quinta
		System.out.println("Comprou TV 32\"?"+compraTV32);// colocar \ para ele entender que não acabou a linha string é apenas símbolo de polegada				
		System.out.println("Comprou TV 50\"?"+compraTV50);// colocar \ para ele entender que não acabou a linha string é apenas símbolo de polegada				
		System.out.println("Comprou Sorvete?"+compraSorvete);// colocar \ para ele entender que não acabou a linha string é apenas símbolo de polegada				
		System.out.println("Está mais saudável?"+maisSaude);// colocar \ para ele entender que não acabou a linha string é apenas símbolo de polegada				
		
		
		
		
		
				
				
	}

}
