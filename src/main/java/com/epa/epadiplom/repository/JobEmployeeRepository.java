package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.JobEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobEmployeeRepository extends JpaRepository<JobEmployee, Long> {
}
