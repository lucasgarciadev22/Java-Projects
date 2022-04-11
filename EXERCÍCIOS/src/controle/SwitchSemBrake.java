package controle;

public class SwitchSemBrake {
	public static void main(String[] args) {
		
		//if(bool)...
		//while(bool)...
		//for(;bool;)...
		
		String faixa ="preta";//escolhe a faixa
		switch(faixa.toLowerCase()) {//vai descer at� o �ltimo case verificando 
		//inicio dos cases
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
			
		case "roxa":
			System.out.println("Sei o Heian Godan...");
			
		case "verde":
			System.out.println("Sei Heian Yodan...");
			
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
			
		case "vermelh":
			System.out.println("Sei o Heian Nidan...");
			
		case "amarelo":
			System.out.println("Sei o Heian Shodan...");
			break; //interrompe os cases
		default:
			System.out.println("N�o sei de nada");//caso n�o atende nenhum case vem pra c� e n�o volta mais para os cases
		}
		System.out.println("Fim!");
		
		//cases de acesso espec�fico (nesse caso acessa de acordo com o switch idade) esse tipo � sem break
		
		int idade=2;
		switch(idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe respirar");
		}
	}

}
