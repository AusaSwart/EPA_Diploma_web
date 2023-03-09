package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.EventsView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface EventsViewRepo
        extends JpaRepository<EventsView, Long> {
    // Read-only methods for BD for Employee view

    List<EventsView> findAllByIdRecipient(long idLogin);
}
