package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo
        extends JpaRepository<Event, Long> {
    // Here we're writing more complicated methods for BD for Event table
    // Also connect w/ standard methods
}
