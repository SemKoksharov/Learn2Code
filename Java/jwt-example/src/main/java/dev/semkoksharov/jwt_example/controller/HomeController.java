package dev.semkoksharov.jwt_example.controller;

import dev.semkoksharov.jwt_example.model.LoginDTO;
import dev.semkoksharov.jwt_example.authentication.UzerDetailsService;
import dev.semkoksharov.jwt_example.authentication.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    private final AuthenticationManager authenticationManager;
    private final JWTService jwtService;
    private final UzerDetailsService uzerDetailsService;

    @Autowired
    public HomeController(AuthenticationManager authenticationManager, JWTService jwtService, UzerDetailsService uzerDetailsService) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        this.uzerDetailsService = uzerDetailsService;
    }

    @GetMapping("/welcome")
    public String handleWelcome(){
        return "Welcome to hell";
    }

    @GetMapping("/admin")
    public String handleWelcomeAdmin(){
        return "Welcome to hell, Admin!";
    }

    @GetMapping("/user")
    public String handleWelcomeUser(){
        return "Welcome to hell, User!";
    }

    @PostMapping("/login")
    public String loginAndGetToken(@RequestBody LoginDTO loginForm){
     Authentication authentication= authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginForm.username(), loginForm.password())
        );
        if (authentication.isAuthenticated()){
           return jwtService.generateToken(uzerDetailsService.loadUserByUsername(loginForm.username()));

        } else throw new UsernameNotFoundException("Invalid credentials");
    }


}
