package classe;

public class Usuario {
	
	String nome;
	String email;
	
	//implementando equals para validar a comparação EqualsHashCode
	
	@Override
	public boolean equals(Object objeto) {
		
		if (objeto instanceof Usuario) {//se objeto for uma instância da classe desejada faz o equals
			
			Usuario outro = (Usuario) objeto; //fazendo cast da classe Usuario dentro de objeto
			
			boolean nomeIgual= outro.nome.equals(this.nome);//verifica se o nome do novo objeto é igual ao nome da classe Usuario
			boolean emailIgual= outro.email.equals(this.email);//verifica se o email do novo objeto é igual ao nome da classe Usuario
			
			return nomeIgual && emailIgual;	
		}
		else{ 
			return false;
		}
			}

}
