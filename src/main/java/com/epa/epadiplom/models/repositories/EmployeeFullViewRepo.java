package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.EmployeeFullView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeFullViewRepo
        extends JpaRepository<EmployeeFullView, Long> {
    // Read-only methods for BD for Employee view
}
