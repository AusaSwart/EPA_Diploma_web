package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo
        extends JpaRepository<Employee, Long> {
    // Here we're writing more complicated methods for BD for Employee table
    // Also connect w/ standard methods


}
