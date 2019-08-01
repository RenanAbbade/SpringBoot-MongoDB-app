package Com.Renan.Spring.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Com.Renan.Spring.domain.User;

@RestController
//Coloco a anotação para dizer que a classe será um recurso REST, e a classe importa automaticamente o REST CONTROLLER
@RequestMapping(value="/users") //Caminho do endpoint
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)//Este método sera o endpoint REST no caminho /users
	public ResponseEntity<List<User>> findAll(){//Estarei retornando o ResponseEntity que encapsula a estrutura necessária para retornarmos respostas HTTP com possiveis cabeçalhos ou erros etc
		
		User maria = new User("1", "Maria Silva", "maria@g.com");
		User renan = new User("2", "Renan Abate", "ren@g.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,renan));
		return ResponseEntity.ok().body(list);//Método ok instancia o ResponseEntity já com o código de resposta HTTP, e no corpo da resposta eu insiro a list
		
	}

}
