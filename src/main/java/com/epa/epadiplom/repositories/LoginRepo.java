package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepo
        extends JpaRepository<Login, Long> {
    // Here we're writing more complicated methods for BD for Login table
    // Also connect w/ standard methods
    Optional<Login> findByLogin(String login);

}
