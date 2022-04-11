package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));//vai pular 2 caractéres e imprimir o seguinte " à "
	//funções do tipo String
		
		String s= "Boa tarde";//declaração explícita de variavel
		System.out.println(s.concat("!!!"));//concatenação de s com ''!!!''
		System.out.println(s+"!!!");//combinar sem função concatenar
		System.out.println(s.startsWith("Boa"));//verifica se a string inicia com "Boa" resultado booleano
		System.out.println(s.toLowerCase().startsWith("boa"));//transforma a string em minúnculo e verifica se começa com "boa"
		System.out.println(s.toUpperCase().endsWith("TARDE"));//transforma a string em maiúscula e verifica se termina com "TARDE"
		System.out.println(s.equalsIgnoreCase("boa tarde"));//verifica equivalência de valor na string, ignorando se ela é ou não maiuscula ou minuscula
		System.out.println(s.equals("boa tarde"));//verifica equivalência de valor na string, levando em conta se for maiuscula ou minuscula
		
		var nome = "Pedro";//pela inferência de tipos, a IDE já identificou como String
		var sobrenome="Santos";
		var idade= 33;
		var salario= 12345.678;
		
		System.out.println("Nome:"+nome+"\nSobrenome: "+sobrenome+
				"\nIdade: "+idade+"\nSalario"+salario+"\n\n");//jeito simplório e extenso de escrever
		//maneiras mais corretas usando formatações
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f",nome,sobrenome,idade,salario);//usar printf para formatar
		// %s obtém os valores de nome, sobrenome, idade e salario na sequência, %d significa valor int
		//%.2f formata o salario para apenas 2 casas após a vírgula e declara que é float
		// adicionar um \n no início de frases pula uma linha
		String frase=String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f",nome,sobrenome,idade,salario);
		System.out.println(frase);//armazenando uma frase formatada acima, dentro da variável frase e printando ela
		
		System.out.println("Frase gay".contains("gay"));
		System.out.println("Frase gay".indexOf("gay"));//mostra qual numero de caractere corresponde o inicio da palavra "gay" (6º caractere
		System.out.println("Frase gay".substring(6));//comeca printar o 6º caractere da frase
		System.out.println("Frase gay".substring(6,8));//começa printar o 6º caractere da frase e para antes de printar o 8º
		
		
		
	
	
	}

}
