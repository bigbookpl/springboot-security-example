package pl.bigbook.demo.springboot.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bigbook.demo.springboot.security.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String username);
}