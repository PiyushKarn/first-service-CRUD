package abc.first.Repositories;


import abc.first.Domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserDomain, Long> {

}
