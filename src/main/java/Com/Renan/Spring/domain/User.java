package Com.Renan.Spring.domain;
//Para dizer que a classe User correponde a uma colecction do mongo DB, devemos usar as antotacoes @Document antes da classe, e o @Id em cima do atributo que for a primaryKey 
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="user")//Entre parenteses é opicional
public class User implements Serializable {
	// Serializable é um padrão que é utilizado para os objetos serem convertidos em
	// bytes, para serem trafegados em rede ou gravados em arquivo
	//Gerando o número de versão padrão
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String name;
	private String email;

	public User() {

	}

	public User(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
