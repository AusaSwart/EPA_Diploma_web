package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepo
        extends JpaRepository<JobTitle, Long> {
    // Here we're writing more complicated methods for BD for JobTitle table
    // Also connect w/ standard methods
}