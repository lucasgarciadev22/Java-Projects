package fundamentos.operadores;

public class Atribuicao {
public static void main(String[] args) {
	//m�todo cl�ssico de fazer atribui��o
	int a=3;
	int b=a;
	int c=a+b;
	
	//m�todo tributativo r�pido (simplifica o m�todo anterior)
	c+=b;// c = c + b;
	c-=b;// c = c - b;
	c*=b;// c = c * b;
	c/=a;// c = c / b;
	
	//operador un�rio incrementar & decrementar
	c++;
	c--;
	System.out.println(c);
	
	c%=2;// c = c % 2; 0 ou 1 esse seria m�dulo que � o resto da divis�o
	System.out.println(c);
	
}
	
}
