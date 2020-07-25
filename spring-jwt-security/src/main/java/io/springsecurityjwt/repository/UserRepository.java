package io.springsecurityjwt.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springsecurityjwt.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}