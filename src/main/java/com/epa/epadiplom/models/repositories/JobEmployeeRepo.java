package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.JobEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobEmployeeRepo
        extends JpaRepository<JobEmployee, Long> {
    // Here we're writing more complicated methods for BD for JobEmployee table
    // Also connect w/ standard methods
}
