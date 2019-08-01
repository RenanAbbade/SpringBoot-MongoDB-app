package Com.Renan.Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Renan.Spring.domain.User;
import Com.Renan.Spring.repository.UserRepository;

//SPRING DATA
@Service //Essa anotação serve para referenciar ao Spring, que essa classe será um serviço injetavel em outras classes 
public class UserService {
	
	
	@Autowired //Para instanciar automaticamente um objeto no servico
	
	private UserRepository repo;//Como no MVC o meu servico precisa conversar com o repositorio, crio essa instancia
	//Quando declara um obj dentro de uma classe usando AutoWired, o proprio Spring ira procurar a definicao deste objeto, e vai instanciar o obj para mim
	//É um mecanismo de injecao de dependencia automatica do Spring
	
	public List<User> findAll(){
		return repo.findAll(); //Método que retorna todos os objs deste tipo do BD
		
	}

}
