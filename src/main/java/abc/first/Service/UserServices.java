package abc.first.Service;

import abc.first.Domain.UserDomain;

import java.util.List;
import java.util.Optional;

public interface UserServices {

    List<UserDomain> findAll();

    String saveUser(UserDomain userdata);

    String updateUser(UserDomain newUserData);

    Optional<UserDomain> findById(Long id);

    String deleteUser(UserDomain deleteUserData);


}
