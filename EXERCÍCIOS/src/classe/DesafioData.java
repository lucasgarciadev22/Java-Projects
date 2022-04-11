package classe;

public class DesafioData {
	public static void main(String[] args) {
		
		Data d1 = new Data(31,12,2022);//chama a classe criada data dentro da var d1
		
		d1.dia=31;//insere valor para o atributo da classe 
		d1.mes=12;//insere valor para o atributo da classe
		d1.ano=2022;//insere valor para o atributo da classe
		
		//chamar data padrão 
		var d2=new Data();
		System.out.println(d2.obterDataFormatada());
		
		
		//outros metodos abaixo:::
		
		//var d2= new Data();
		//d2.dia=31;
		//d2.mes=12;
		//d2.ano=2021;
		//System.out.printf("%d/%d/%d\n",d1.dia,d1.mes,d1.ano);
		//System.out.printf("%d/%d/%d\n",d2.dia,d2.mes,d2.ano);
		
		//testando novo método de desafio de retornar valor formatado através do método criado
		
		//System.out.println(d1.dataFormatada());
		
		//método do professor de resolver o desafio
		System.out.println(d1.obterDataFormatada());
		
		//é possível ainda fazer até a impressao com void (ausência de retorno) mas ele é não recomendado;
		//chamar o método que ja contem uma função de imprimir dentro 
		d1.imprimirDataFormatada();
		
		
		
		
		
		}

}
