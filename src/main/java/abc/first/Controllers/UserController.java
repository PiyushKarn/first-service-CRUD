package abc.first.Controllers;

import java.util.List;
import java.util.Optional;

import abc.first.Domain.UserDomain;
import abc.first.Exception.UserNotFoundException;
import abc.first.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserService userServices;

    @GetMapping("/") //getALLTickets
    public List<UserDomain> allUsers() {
        return userServices.findAll();

    }

    @PostMapping("/")  //AddNewUser
    public String addUser(@RequestBody UserDomain userdata)
    {
        return userServices.saveUser(userdata);
    }

    @PutMapping("/")   //updateExistingUsers
    public String updateUser(@RequestBody UserDomain newUserData)
    {
        return userServices.updateUser(newUserData);
    }

    @GetMapping("/{id}")    //findUserById
    public Optional<UserDomain> getUserById(@PathVariable Long id)
    {

        Optional<Optional<UserDomain>> userDomain = Optional.ofNullable(userServices.findById(id));

        if (userDomain.isEmpty())
            throw new UserNotFoundException("id-" + id);

        return userDomain.get();
    }


    @DeleteMapping("/")       //deleteUserById
    public String deleteUser(@RequestBody UserDomain deleteUserData){
        return userServices.deleteUser(deleteUserData);
    }


}