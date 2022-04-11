package controle;

public class Continue {
	//o continue serve para executar algo dentro do laço até a condição ser atendida
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i%2==1) {//verifica o resto de uma divisão pra ver se é par ou ímpar
				continue;//se for ímpar vai pro ' continue ' e não imprime nada
			}
			System.out.println(i);//imprime apenas os numeros pares
		}
	}

}
