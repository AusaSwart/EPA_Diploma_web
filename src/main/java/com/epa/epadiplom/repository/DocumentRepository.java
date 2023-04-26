package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Employee, Long> {
}
