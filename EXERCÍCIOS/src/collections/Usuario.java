package collections;

import java.util.Objects;

public class Usuario {
	String nome;

	//construtor do Usuario
	Usuario(String nome) {
		this.nome = nome;
	}
	
	public String toString () {
		return "Meu nome é "+this.nome+".";
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
		
		//ou
		//final in prime =31;
		//int result = 1;
		//result = prime * result + ((nome==null)) ?0 : nome.hashCode();
		
		
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	

}
