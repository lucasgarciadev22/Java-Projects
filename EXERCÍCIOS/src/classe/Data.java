package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//desafio construtor data definir o construtor 
	//construtor padr�o impl�cito
	Data(){
		//dia=1;
		//mes=1;
		//ano=1970;
		//this(dia, mes, ano)//this como m�todo chama construtor
		this(1, 1, 1970);
		//ATEN��O CHAMAR APENAS UM CONSTRUTOR
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){//declara os tipos no construtor
		//this como objeto
		this.dia=diaInicial;
		this.mes=mesInicial;
		this.ano=anoInicial;//salva em vari�veis de par�metros j� definidos da classe
		
		//usando o this para alterar especificamente os atributos originais da classe
	}
	

	//meu m�todo de resolver o desafio
	
//String dataFormatada() {
	//String diatxt=Integer.toString(dia);
	//String mestxt=Integer.toString(mes);
	//String anotxt=Integer.toString(ano);
	//diatxt=dia+"/";
	//mestxt=mes+"/";
	
	//return diatxt+mestxt+anotxt;
	
	//m�todo do professor para resolver o desafio
 String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
		
		//� poss�vel ainda fazer at� a impressao com void (aus�ncia de retorno) mas � n�o recomendado;
		void imprimirDataFormatada() {
			System.out.println(obterDataFormatada());


		
	}
	
}
	

//}
