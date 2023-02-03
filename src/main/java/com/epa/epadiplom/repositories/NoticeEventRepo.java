package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.NoticeEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeEventRepo
        extends JpaRepository<NoticeEvent, Long> {
    // Here we're writing more complicated methods for BD for NoticeEvent table
    // Also connect w/ standard methods


}
