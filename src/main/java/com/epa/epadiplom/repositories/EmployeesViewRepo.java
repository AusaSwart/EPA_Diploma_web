package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.EmployeesView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface EmployeesViewRepo
        extends JpaRepository<EmployeesView, Long> {
    // Read-only methods for BD for Employees view


}
