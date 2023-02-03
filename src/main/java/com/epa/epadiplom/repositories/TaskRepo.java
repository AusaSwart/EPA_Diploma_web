package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo
        extends JpaRepository<Task, Long> {
    // Here we're writing more complicated methods for BD for Task table
    // Also connect w/ standard methods


}
