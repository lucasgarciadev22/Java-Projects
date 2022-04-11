package classe;

public class ValorVSReferencia {
	
	public static void main(String[] args) {
		
		double a=2;
		double b=a;//atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a+" "+b);
		
		Data d1=new Data(1,6,2022);
		Data d2=d1; //atribuição por referência (objeto)
		
		d1.dia=31;
		d2.mes=12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		//cada manipulação altera valores em d1 e d2 porque ambos apontam para o mesmo local na memoria
		
		voltarDataParaValorPadrao(d1);//chama outro método 
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
//evitar manipular objetos atraves desse tipo de rotina 	
		
		int c=5;
		alterarPrimitivo(c);//ao chamar metodo ele cria cópia entao n  é o mesmo c
		System.out.println(c);
//o método alterar primitivo não tem impacto neste c pois apesar de serem mesma variável,
//eles não compartilham mesmo endereço na memoria
		
	}
		
		//acessar static pra voltar ao padrão dela
			
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
