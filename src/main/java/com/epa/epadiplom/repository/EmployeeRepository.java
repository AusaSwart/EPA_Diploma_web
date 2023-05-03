package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional <Employee> findByFirstNameAndMiddleNameAndLastName(
            String firstName,
            String middleName,
            String lastName);

}
