package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department, Long> {
}
