package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {


}
