package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.LogStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogStatementRepository extends JpaRepository<LogStatement, Long> {
}
