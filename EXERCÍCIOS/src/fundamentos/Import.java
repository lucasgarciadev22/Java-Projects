package fundamentos;

import java.util.Date;//fun��o import fica fora da classe

import javax.swing.JButton;//algumas classes s�o automaticamente importadas caso tenha apenas um nome

public class Import {
	public static void main(String[] args) {
		
		java.lang.String b= "Boa tarde!";//extens�o completa da fun��o String (java.lang)
		String s= "Bom dia!";
		System.out.println(s);
		
		Date d= new Date();
		System.out.println(d);
		//ctrl + shift + o organizar� os imports do programa
		JButton botao= new JButton();
		System.out.println(b);
				
	}
}
