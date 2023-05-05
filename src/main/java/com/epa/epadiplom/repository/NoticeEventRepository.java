package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.NoticeEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoticeEventRepository extends JpaRepository<NoticeEvent, Long> {

    Optional<NoticeEvent> findById(Long id);


}
