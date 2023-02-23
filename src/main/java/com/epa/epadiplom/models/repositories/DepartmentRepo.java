package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo
        extends JpaRepository<Department, Long> {
    // Here we're writing more complicated methods for BD for Department table
    // Also connect w/ standard methods
    Department findByEmployeesId (long id);


}
