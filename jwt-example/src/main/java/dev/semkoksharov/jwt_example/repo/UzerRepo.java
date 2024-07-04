package dev.semkoksharov.jwt_example.repo;

import dev.semkoksharov.jwt_example.model.Uzer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UzerRepo extends JpaRepository<Uzer, Long> {
    Optional<Uzer> findByUsername(String username);
}
