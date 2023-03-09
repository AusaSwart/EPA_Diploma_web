package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo
        extends JpaRepository<User, Long> {
    // Here we're writing more complicated methods for BD for Login table
    // Also connect w/ standard methods
    Optional<User> findByFirstName(String firstName); //login

}
