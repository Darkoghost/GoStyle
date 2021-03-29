package fr.gostyle.app.dal;

import fr.gostyle.app.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends CrudRepository<User, String> {

    List<User> findByName (String name);
    User findByEmailAndMdp (String email, String mdp);
}
