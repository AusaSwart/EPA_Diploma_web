package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepo extends CrudRepository<Event, Long> {
}
