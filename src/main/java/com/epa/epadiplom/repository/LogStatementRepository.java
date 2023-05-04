package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.LogStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LogStatementRepository extends JpaRepository<LogStatement, Long> {

    Optional<LogStatement> findByIdAndIdApprover (long id, long idApprover);

}