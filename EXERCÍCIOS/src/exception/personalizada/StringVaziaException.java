package exception.personalizada;

@SuppressWarnings("serial")//salva objeto em .txt (serialização)

public class StringVaziaException extends RuntimeException{

/**
 * 
 */
//outro método -> geral serial ID
//private static final long serialVersionUID = 1821318585660816559L;
private String nomeDoAtributo;
public StringVaziaException(String nomeDoAtributo) {
	this.nomeDoAtributo = nomeDoAtributo;
}

//criando mensagem de erro personalizada
public String getMessage() {
	
	return String.format("O atributo %s está vazio", nomeDoAtributo);
	
}

}
	