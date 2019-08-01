package Com.Renan.Spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Com.Renan.Spring.domain.User;
import Com.Renan.Spring.services.UserService;

@RestController
//Coloco a anotação para dizer que a classe será um recurso REST, e a classe importa automaticamente o REST CONTROLLER
@RequestMapping(value = "/users") // Caminho do endpoint
public class UserResource {
	// O controlador REST @RestController, acesso o servico @AutoWired, tal como no
	// modelo MVC
	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET) // Este método sera o endpoint REST no caminho /users
	public ResponseEntity<List<User>> findAll() {// Estarei retornando o ResponseEntity que encapsula a estrutura
													// necessária para retornarmos respostas HTTP com possiveis
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);// Método ok instancia o ResponseEntity já com o código de resposta HTTP,
												// e no corpo da resposta eu insiro a list

	}

}
