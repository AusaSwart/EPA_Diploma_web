package com.epa.epadiplom.repository;


import com.epa.epadiplom.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    @Override
    Optional<Document> findById(Long aLong);
}
