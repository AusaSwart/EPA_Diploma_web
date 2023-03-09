package com.epa.epadiplom.models.repositories;

import com.epa.epadiplom.models.entities.EmployeeFullView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface EmployeeFullViewRepo
        extends JpaRepository<EmployeeFullView, Long> {


    // Read-only methods for BD for Employee view
     List <EmployeeFullView> findAllByIdLogin(long idLogin);
}
