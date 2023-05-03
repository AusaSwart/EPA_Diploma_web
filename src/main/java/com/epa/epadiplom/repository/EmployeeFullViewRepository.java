package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.EmployeeFullView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface EmployeeFullViewRepository extends JpaRepository<EmployeeFullView, Long> {
    List<EmployeeFullView> findAllByIdLogin(long idLogin);
    List<EmployeeFullView> findAllByLoginUser(String loginUser);
}
