package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
public static void main(String[] args) {
	
	//regra máxima do menor pro maior, o cast funciona porque um cabe no outro como por exemplo int pra float
	double a=1;
	System.out.println(a);
	
	float b=1.0F;//colocando letra f converte o double literal e padrão do java para float
	System.out.println(b);
	//pode ser feito também através de cast (forma)
	float c=(float) 1.0;
	System.out.println(c);//** deve-se tomar cuidado ao núemro de casas o float suporta (double suporta mais)
	//mesmo que caiba deve-se explicitar o cast senão java dá erro porque não entende que o usuário precisa converter
	
	int d=4;
	byte e=(byte)d;//assim ele aceita
	System.out.println(e);
	
	//mesmo convertendo double maior pra int menor ele não aceita sem o formato de cast
	double f=1.999999;
	int g=(int) f;
	System.out.println(g);
	
	
	
	
	
	
	
	
	
}
}
