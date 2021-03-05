package fr.gostyle.app.dal;

import fr.gostyle.app.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository {

    List<User> findByName (String name);
}