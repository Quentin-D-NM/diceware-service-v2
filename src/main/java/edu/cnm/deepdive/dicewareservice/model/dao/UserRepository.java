package edu.cnm.deepdive.dicewareservice.model.dao;

import edu.cnm.deepdive.dicewareservice.model.entity.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

//first type is entity type, second is type of primary key
public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> getUserByOauthKey(String oauthKey);
}
