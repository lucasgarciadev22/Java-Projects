package controle;

public class Continue {
	//o continue serve para executar algo dentro do la�o at� a condi��o ser atendida
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i%2==1) {//verifica o resto de uma divis�o pra ver se � par ou �mpar
				continue;//se for �mpar vai pro ' continue ' e n�o imprime nada
			}
			System.out.println(i);//imprime apenas os numeros pares
		}
	}

}
