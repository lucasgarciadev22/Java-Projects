package controle;

public class Continue2Rotulado {

	public static void main(String[] args) {
		
		externo: for(int i =0; i <3; i++) {
			for (int j=0; j<3; j++) {//for interno
				
			if (i==1) {
				continue externo;//continue externo ignora o interno, esse será o rótulo
			}
			System.out.printf("[%d %d]", i , j );
			}
			System.out.println();
		}
		
		System.out.println("Fim!");
	}

 }
