package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepo
        extends JpaRepository<Personal, Long> {
    // Here we're writing more complicated methods for BD for Contact table
    // Also connect w/ standard methods


}
