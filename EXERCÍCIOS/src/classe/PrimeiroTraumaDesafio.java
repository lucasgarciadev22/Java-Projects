package classe;

public class PrimeiroTraumaDesafio {
	
	int a=3;//n�o pode mexer nessa linha (op��o 1 mant�m em atributo de inst�ncia)
	static int b=4;//tranforma instancia em static para que static main consiga acessar(op�ao 2)
	
	public static void main(String[] args) {
		//� necess�rio criar uma inst�ncia para acessar as vari�veis fora do main
		PrimeiroTraumaDesafio p=new PrimeiroTraumaDesafio();//chamar a classe PrimeiroTrauma que cont�m o vari�vel a
		System.out.println(p.a);
		System.out.println(b);
	}
}
