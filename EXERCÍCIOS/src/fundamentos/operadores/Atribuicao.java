package fundamentos.operadores;

public class Atribuicao {
public static void main(String[] args) {
	//método clássico de fazer atribuição
	int a=3;
	int b=a;
	int c=a+b;
	
	//método tributativo rápido (simplifica o método anterior)
	c+=b;// c = c + b;
	c-=b;// c = c - b;
	c*=b;// c = c * b;
	c/=a;// c = c / b;
	
	//operador unário incrementar & decrementar
	c++;
	c--;
	System.out.println(c);
	
	c%=2;// c = c % 2; 0 ou 1 esse seria módulo que é o resto da divisão
	System.out.println(c);
	
}
	
}
