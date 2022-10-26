package abc.first.Services;


import abc.first.Domain.UserDomain;
import abc.first.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDomain> findAll() {
        List<UserDomain> allUsers = userRepository.findAll();
        //System.out.println(allUsers);
        return allUsers;
    }

    @Override
    public String saveUser(UserDomain userdata) {
        userRepository.save(userdata);
        //System.out.println(userdata.getPhoneNumber());
        return "data saved";
    }

    @Override
    public String updateUser(UserDomain newUserData) {
        String msg = null;
        if (newUserData.getId() != null) {
            userRepository.save(newUserData);
            msg = "Data updated";
        } else {
            msg = "Error";
        }
        return msg;
    }

    @Override
    public Optional<UserDomain> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public String deleteUser(UserDomain deleteUserData) {
        userRepository.delete(deleteUserData);
            return "data deleted";
    }



}
