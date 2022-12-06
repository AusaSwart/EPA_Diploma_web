package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.EmployeeTask;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeTaskRepo extends CrudRepository<EmployeeTask, Long> {
}
