package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.EmployeeTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTaskRepository extends JpaRepository<EmployeeTask, Long> {

}
