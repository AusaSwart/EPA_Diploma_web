package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo
        extends JpaRepository<Contact, Long> {
    // Here we're writing more complicated methods for BD for Contact table
    // Also connect w/ standard methods


}
