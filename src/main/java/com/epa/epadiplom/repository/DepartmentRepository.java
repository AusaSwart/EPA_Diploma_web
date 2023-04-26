package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByEmployeesId(long id);
}
