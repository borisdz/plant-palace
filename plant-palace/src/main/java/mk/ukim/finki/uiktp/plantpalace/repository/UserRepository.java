package mk.ukim.finki.uiktp.plantpalace.repository;


import mk.ukim.finki.uiktp.plantpalace.model.User;
import mk.ukim.finki.uiktp.plantpalace.model.enumerations.Role;
import mk.ukim.finki.uiktp.plantpalace.projections.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameAndPassword(String username, String password);

    Optional<User> findByUsername(String username);

    UserProjection findByRole(Role role);

}
