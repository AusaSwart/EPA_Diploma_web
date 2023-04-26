package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.EventsView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface EventsViewRepository extends JpaRepository<EventsView, Long> {
    List<EventsView> findAllByIdRecipient(long idLogin);
}
