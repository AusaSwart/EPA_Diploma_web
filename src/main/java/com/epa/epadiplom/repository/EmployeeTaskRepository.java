package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.EmployeeTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeTaskRepository extends JpaRepository<EmployeeTask, Long> {

    Optional<EmployeeTask> findById(Long aLong);
}
