package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//desafio construtor data definir o construtor 
	//construtor padrão implícito
	Data(){
		//dia=1;
		//mes=1;
		//ano=1970;
		//this(dia, mes, ano)//this como método chama construtor
		this(1, 1, 1970);
		//ATENÇÃO CHAMAR APENAS UM CONSTRUTOR
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){//declara os tipos no construtor
		//this como objeto
		this.dia=diaInicial;
		this.mes=mesInicial;
		this.ano=anoInicial;//salva em variáveis de parâmetros já definidos da classe
		
		//usando o this para alterar especificamente os atributos originais da classe
	}
	

	//meu método de resolver o desafio
	
//String dataFormatada() {
	//String diatxt=Integer.toString(dia);
	//String mestxt=Integer.toString(mes);
	//String anotxt=Integer.toString(ano);
	//diatxt=dia+"/";
	//mestxt=mes+"/";
	
	//return diatxt+mestxt+anotxt;
	
	//método do professor para resolver o desafio
 String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
		
		//é possível ainda fazer até a impressao com void (ausência de retorno) mas é não recomendado;
		void imprimirDataFormatada() {
			System.out.println(obterDataFormatada());


		
	}
	
}
	

//}
