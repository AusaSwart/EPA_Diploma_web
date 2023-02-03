package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event, Long> {


}
