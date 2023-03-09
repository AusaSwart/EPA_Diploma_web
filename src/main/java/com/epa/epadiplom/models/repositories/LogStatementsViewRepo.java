package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.LogStatementsView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface LogStatementsViewRepo
        extends JpaRepository<LogStatementsView, Long> {
    // Read-only methods for BD for Employee view
    List<LogStatementsView> findAllByIdApproverAndApprove(long idApprover, int appr);


}
