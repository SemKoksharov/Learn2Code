package dev.semkoksharov.mongodb_test.repository;

import dev.semkoksharov.mongodb_test.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<UserEntity, String> {
}
