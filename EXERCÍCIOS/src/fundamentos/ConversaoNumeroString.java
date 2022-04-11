package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1= 10000;
		System.out.println(num1.toString().length());//converter Integer pra string, pediu o tamanho lenght e printar
		
		int num2=100000;//não definiu Integer
		System.out.println(Integer.toString(num2).length());//usou função e definiu então pra Integer o num2 e converteu pra string, após pediu o tamanho lenght
		
		System.out.println((""+num1).length());
		System.out.println((""+num2).length());
		
	}
}
