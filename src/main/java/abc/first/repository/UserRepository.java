package abc.first.repository;


import abc.first.Domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserDomain, Long> {

}
