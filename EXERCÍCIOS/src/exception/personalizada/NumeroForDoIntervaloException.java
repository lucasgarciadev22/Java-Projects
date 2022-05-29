package exception.personalizada;

@SuppressWarnings("serial")//salva objeto em .txt (serializa��o)


public class NumeroForDoIntervaloException extends RuntimeException {

	
	/**
	 * 
	 */
	//outro m�todo -> geral serial ID
	//private static final long serialVersionUID = 1821318585660816559L;
	private String nomeDoAtributo;
	public NumeroForDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	//criando mensagem de erro personalizada
	public String getMessage() {
		
		return String.format("O atributo %s est� fora do intervalo", nomeDoAtributo);
		
	}

}
