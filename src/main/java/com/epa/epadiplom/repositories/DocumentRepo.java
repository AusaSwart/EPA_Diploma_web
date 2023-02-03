package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepo extends JpaRepository<Employee, Long> {


}
