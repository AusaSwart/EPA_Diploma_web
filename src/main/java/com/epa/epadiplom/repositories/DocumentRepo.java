package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepo extends CrudRepository<Employee, Long> {
}
