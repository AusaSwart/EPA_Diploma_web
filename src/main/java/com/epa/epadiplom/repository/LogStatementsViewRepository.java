package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.LogStatementsView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface LogStatementsViewRepository extends JpaRepository<LogStatementsView, Long> {
    List<LogStatementsView> findAllByIdApproverAndApprove(long idApprover, int appr);
}
