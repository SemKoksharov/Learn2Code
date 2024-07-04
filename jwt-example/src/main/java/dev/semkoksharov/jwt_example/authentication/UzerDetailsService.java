package dev.semkoksharov.jwt_example.authentication;

import dev.semkoksharov.jwt_example.model.Uzer;
import dev.semkoksharov.jwt_example.repo.UzerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UzerDetailsService implements UserDetailsService {

    private final UzerRepo uzerRepo;

    @Autowired
    public UzerDetailsService(UzerRepo uzerRepo) {
        this.uzerRepo = uzerRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Uzer> userOptional = uzerRepo.findByUsername(username);
        if (userOptional.isPresent()) {
            var uzer = userOptional.get();
            return User.builder()
                    .username(uzer.getUsername())
                    .password(uzer.getPassword())
                    .roles(getRoles(uzer))
                    .build();
        } else {
            throw new UsernameNotFoundException("User " +
                    username + " not found");
        }
    }
    
    private String[] getRoles(Uzer user){
        if (user.getRole() == null){
            return new String[]{"USER"};
        }
        return user.getRole().split(",");
    }


}
