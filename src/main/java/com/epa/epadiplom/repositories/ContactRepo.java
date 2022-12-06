package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepo extends CrudRepository<Contact, Long> {
}
