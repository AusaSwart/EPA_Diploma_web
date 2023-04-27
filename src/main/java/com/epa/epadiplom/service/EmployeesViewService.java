package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.EmployeesView;
import com.epa.epadiplom.repository.EmployeesViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeesViewService {
    private final EmployeesViewRepository employeesViewRepository;
    public List <EmployeesView> findAll(){
        return employeesViewRepository.findAll();
    }
}
