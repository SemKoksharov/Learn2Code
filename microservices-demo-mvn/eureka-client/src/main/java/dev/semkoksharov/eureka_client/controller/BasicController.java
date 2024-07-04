package dev.semkoksharov.eureka_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/test")
    public String greetings(){
        return "Hello from eureka client!";
    }

}
