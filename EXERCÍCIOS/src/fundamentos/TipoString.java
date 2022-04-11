package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));//vai pular 2 caract�res e imprimir o seguinte " � "
	//fun��es do tipo String
		
		String s= "Boa tarde";//declara��o expl�cita de variavel
		System.out.println(s.concat("!!!"));//concatena��o de s com ''!!!''
		System.out.println(s+"!!!");//combinar sem fun��o concatenar
		System.out.println(s.startsWith("Boa"));//verifica se a string inicia com "Boa" resultado booleano
		System.out.println(s.toLowerCase().startsWith("boa"));//transforma a string em min�nculo e verifica se come�a com "boa"
		System.out.println(s.toUpperCase().endsWith("TARDE"));//transforma a string em mai�scula e verifica se termina com "TARDE"
		System.out.println(s.equalsIgnoreCase("boa tarde"));//verifica equival�ncia de valor na string, ignorando se ela � ou n�o maiuscula ou minuscula
		System.out.println(s.equals("boa tarde"));//verifica equival�ncia de valor na string, levando em conta se for maiuscula ou minuscula
		
		var nome = "Pedro";//pela infer�ncia de tipos, a IDE j� identificou como String
		var sobrenome="Santos";
		var idade= 33;
		var salario= 12345.678;
		
		System.out.println("Nome:"+nome+"\nSobrenome: "+sobrenome+
				"\nIdade: "+idade+"\nSalario"+salario+"\n\n");//jeito simpl�rio e extenso de escrever
		//maneiras mais corretas usando formata��es
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f",nome,sobrenome,idade,salario);//usar printf para formatar
		// %s obt�m os valores de nome, sobrenome, idade e salario na sequ�ncia, %d significa valor int
		//%.2f formata o salario para apenas 2 casas ap�s a v�rgula e declara que � float
		// adicionar um \n no in�cio de frases pula uma linha
		String frase=String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f",nome,sobrenome,idade,salario);
		System.out.println(frase);//armazenando uma frase formatada acima, dentro da vari�vel frase e printando ela
		
		System.out.println("Frase gay".contains("gay"));
		System.out.println("Frase gay".indexOf("gay"));//mostra qual numero de caractere corresponde o inicio da palavra "gay" (6� caractere
		System.out.println("Frase gay".substring(6));//comeca printar o 6� caractere da frase
		System.out.println("Frase gay".substring(6,8));//come�a printar o 6� caractere da frase e para antes de printar o 8�
		
		
		
	
	
	}

}
