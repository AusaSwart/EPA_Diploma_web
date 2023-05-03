package com.epa.epadiplom.service;

import com.epa.epadiplom.repository.EmployeeTaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeTaskService {

    private final EmployeeTaskRepository employeeTaskRepository;



}
