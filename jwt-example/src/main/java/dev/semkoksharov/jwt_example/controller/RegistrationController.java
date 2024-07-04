package dev.semkoksharov.jwt_example.controller;

import dev.semkoksharov.jwt_example.model.Uzer;
import dev.semkoksharov.jwt_example.repo.UzerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/signup")
public class RegistrationController {

    private final UzerRepo uzerRepo;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegistrationController(UzerRepo uzerRepo, PasswordEncoder passwordEncoder) {
        this.uzerRepo = uzerRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/user")
    public Uzer createUser(@RequestBody Uzer user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return uzerRepo.saveAndFlush(user);
    }

}
