package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.EmployeeTask;
import com.epa.epadiplom.repository.EmployeeTaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeTaskService {

    private final EmployeeTaskRepository employeeTaskRepository;

    public boolean saveEmployeeTask (EmployeeTask employeeTask){
        if(employeeTaskRepository.findById(employeeTask.getId()).isPresent())
            return false;
        employeeTaskRepository.save(employeeTask);
        return true;
    }

}
