package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.EmployeeTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTaskRepo
        extends JpaRepository<EmployeeTask, Long> {
    // Here we're writing more complicated methods for BD for EmployeeTask table
    // Also connect w/ standard methods
}
