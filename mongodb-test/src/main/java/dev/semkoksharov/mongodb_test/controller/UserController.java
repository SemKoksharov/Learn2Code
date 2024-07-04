package dev.semkoksharov.mongodb_test.controller;

import dev.semkoksharov.mongodb_test.entity.UserEntity;
import dev.semkoksharov.mongodb_test.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepo userRepo;

    @Autowired
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user){
        return userRepo.save(user);
    }

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userRepo.findAll();
    }

    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable String id){
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@PathVariable String id, @RequestBody UserEntity user ){
       UserEntity toUpdate = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        return updateUser(user, toUpdate);
    }


    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable String id){
        if (! userRepo.existsById(id)) throw new RuntimeException("User not found");
        userRepo.deleteById(id);
    }

    // SO CHE BRUTTO METTERE STA ROBA NEL CONTROLER :D

    private UserEntity updateUser(UserEntity user, UserEntity toUpdate) {

        if(user.getName() != null && ! user.getName().isBlank()){
            toUpdate.setName(user.getName());
        }
        if (user.getSurname() != null && ! user.getSurname().isBlank()){
            toUpdate.setSurname(user.getSurname());
        }
        if (user.getLogin() != null && ! user.getLogin().isBlank()){
            toUpdate.setLogin(user.getLogin());
        }
        if (user.getSurname() != null && ! user.getSurname().isBlank()){
            toUpdate.setPassword(user.getPassword());
        }

        return userRepo.save(toUpdate);
    }

}
