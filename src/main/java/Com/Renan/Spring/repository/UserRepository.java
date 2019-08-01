package Com.Renan.Spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Com.Renan.Spring.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	//SpringData - mongoRepository<Tipo da classe de dominio, tipo do ID da classe de dominio
	

}
