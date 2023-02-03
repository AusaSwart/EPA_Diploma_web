package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.LogStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogStatementRepo
        extends JpaRepository<LogStatement, Long> {
    // Here we're writing more complicated methods for BD for LogStatement table
    // Also connect w/ standard methods


}
