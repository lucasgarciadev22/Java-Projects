package classe;

public class PrimeiroTraumaDesafio {
	
	int a=3;//não pode mexer nessa linha (opção 1 mantém em atributo de instância)
	static int b=4;//tranforma instancia em static para que static main consiga acessar(opçao 2)
	
	public static void main(String[] args) {
		//é necessário criar uma instância para acessar as variáveis fora do main
		PrimeiroTraumaDesafio p=new PrimeiroTraumaDesafio();//chamar a classe PrimeiroTrauma que contém o variável a
		System.out.println(p.a);
		System.out.println(b);
	}
}
