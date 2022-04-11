package classe;

public class ValorVSReferencia {
	
	public static void main(String[] args) {
		
		double a=2;
		double b=a;//atribui��o por valor
		
		a++;
		b--;
		
		System.out.println(a+" "+b);
		
		Data d1=new Data(1,6,2022);
		Data d2=d1; //atribui��o por refer�ncia (objeto)
		
		d1.dia=31;
		d2.mes=12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		//cada manipula��o altera valores em d1 e d2 porque ambos apontam para o mesmo local na memoria
		
		voltarDataParaValorPadrao(d1);//chama outro m�todo 
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
//evitar manipular objetos atraves desse tipo de rotina 	
		
		int c=5;
		alterarPrimitivo(c);//ao chamar metodo ele cria c�pia entao n  � o mesmo c
		System.out.println(c);
//o m�todo alterar primitivo n�o tem impacto neste c pois apesar de serem mesma vari�vel,
//eles n�o compartilham mesmo endere�o na memoria
		
	}
		
		//acessar static pra voltar ao padr�o dela
			
			static void voltarDataParaValorPadrao(Data d) {
				d.dia=1;
				d.mes=1;
				d.ano=1970;
	}
//passar primitivo para parametrizar um static

		static void alterarPrimitivo(int c) {
			c++;
		}
		
			
			
}
