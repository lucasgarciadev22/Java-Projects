package lambdas;

public class Threads {
	
	public static void main(String[] args) {
		
//interface Runnable -> classe an�nima que pode ser implementada por outra classe definida (Trabalho1)
		
		Runnable trabalho1 = new Trabalho1(); //classe implementada da interface Runnable
		Runnable trabalho2 = new Runnable() {// interface Runnable pura
		
			//m�todo run principal da classe Runnable pura 
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<100; i++) {
					System.out.println("Trabalho #02");
			//� poss�vel definir outros par�metros da Thread dentro do m�todo run
					
					try {
						Thread.sleep(100);
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		};
		
		//utilizando Runnable como interface funcional atrav�s de lambdas
		
		Runnable trabalho3 = ()-> {
			for (int i=0; i<100; i++) {
				
				System.out.println("Trabalho #01");
				
				try {
					Thread.sleep(100);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}	
		};
		
		Runnable trabalho4 = Threads::trabalho4;//chama refer�ncia do static void trabalho 4
		
	//criando as Threads para processar ambos os Trabalhos de forma simult�nea ( o processador divide a prioridade de opera��es)
		
		Thread th1 = new Thread(trabalho1);//thread baseada no Runnable criado anteriormente
		Thread th2 = new Thread(trabalho2);//thread baseada no Runnable criado anteriormente
		Thread th3 = new Thread(trabalho3);//thread baseada no Runnable criado anteriormente
		Thread th4 = new Thread(trabalho4);//thread baseada no Runnable criado anteriormente
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
	
	//utilizando Runnable como interface funcional atrav�s do method reference de um static void fora da main
	
	static void trabalho4() {
			for (int i=0; i<100; i++) {
			
			System.out.println("Trabalho #04");
			
			try {
				Thread.sleep(100);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
	}
	
}
