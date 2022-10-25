package abc.first.controller;

import java.util.List;
import java.util.Optional;

import abc.first.Domain.UserDomain;
import abc.first.Exception.UserNotFoundException;
import abc.first.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDomain> allUsers() {
        return userServices.findAll();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDomain userdata)
    {
        return userServices.saveUser(userdata);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDomain newUserData)
    {
        return userServices.updateUser(newUserData);
    }

    @GetMapping("/find/{id}")
    public Optional<UserDomain> getUserById(@PathVariable Long id)
    {

        Optional<Optional<UserDomain>> userDomain = Optional.ofNullable(userServices.findById(id));

        if (userDomain.isEmpty())
            throw new UserNotFoundException("id-" + id);

        return userDomain.get();
    }


    @DeleteMapping("/delete")
    public String deleteUser(@RequestBody UserDomain deleteUserData){
        return userServices.deleteUser(deleteUserData);
    }


}