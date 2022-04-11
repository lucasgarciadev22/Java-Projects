package controle;

public class Break2 {
	//break rotulado
	public static void main(String[] args) {//for externo
		externo: for(int i =0; i <3; i++) {
			for (int j=0; j<3; j++) {//for interno
				
			if (i==1) {
				break externo;//break externo ignora o interno, esse será o rótulo
			}
			System.out.printf("%d %d", i, j );
			}
			System.out.println();
		}
		
		System.out.println("Fim!");
	}

}
